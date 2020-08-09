package com.session6;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XmlWriter {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, FileNotFoundException {
        //Get Document Builder
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();

        //Build Document
        Document document = documentBuilder.newDocument();

        //Create elements
        Element rootElement = document.createElement("students");
        Element student1 = document.createElement("student");
        Element nameE = document.createElement("name");
        Element emailE = document.createElement("email");
        Element mobileE = document.createElement("mobile");

        //Create text content
        Text nameText = document.createTextNode("John");
        Text emailText = document.createTextNode("john09@gmail.com");
        Text mobileText =document.createTextNode("0987654321");

        //Append text and element
        nameE.appendChild(nameText);
        emailE.appendChild(emailText);
        mobileE.appendChild(mobileText);

        //Append to branch
        student1.appendChild(nameE);
        student1.appendChild(emailE);
        student1.appendChild(mobileE);

        //Append to root
        rootElement.appendChild(student1);
        document.appendChild(rootElement);

        //Transform the source to XML file
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(new DOMSource(document), new StreamResult(new FileOutputStream("C:\\Users\\Amirtha Thiru\\Desktop\\Live session\\Module 6\\students.xml")));

        System.out.println("XML file generated");
    }
}
