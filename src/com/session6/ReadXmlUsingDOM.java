package com.session6;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXmlUsingDOM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String path = "C:\\Users\\Public\\JavaJ2EESOA\\src\\com\\session6\\Players.xml";
        File file = new File(path);

        //Get Document Builder
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        //Build document
        Document document = documentBuilder.parse(file);

        System.out.println("Root element : " + document.getDocumentElement().getNodeName());

        //Get node list
        NodeList nodeList = document.getElementsByTagName("player");
        int  length = nodeList.getLength();
        System.out.println("Size of player :" + length);

        //Get elements
        for (int i = 0; i < length; i++) {
            Node node = nodeList.item(i);
            System.out.println("Current node name : " + node.getNodeName());
            Element element = (Element)node;
            System.out.println("Id : " + element.getAttribute("id"));
            System.out.println("firstname : " + element.getElementsByTagName("firstname").item(0).getTextContent());
            System.out.println("lastname : " + element.getElementsByTagName("lastname").item(0).getTextContent());
            System.out.println("nickname : " + element.getElementsByTagName("nickname").item(0).getTextContent());
            System.out.println("salary : " + element.getElementsByTagName("salary").item(0).getTextContent());
        }
        System.out.println("*************************************");
    }
}
