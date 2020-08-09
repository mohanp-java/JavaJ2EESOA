package com.session6;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class SAXParserDemo extends DefaultHandler {
    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document starts....");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.print("<"+qName + ">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.print(new String(ch,start,length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("</"+qName+ ">");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document ends....");
    }


    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParser saxParser = SAXParserFactory.newInstance().newSAXParser();
        saxParser.parse(new FileInputStream("C:\\Users\\Public\\JavaJ2EESOA\\src\\com\\session6\\Players.xml"), new SAXParserDemo());
    }
}
