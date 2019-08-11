package com.dom.po.parser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class TraverseTest {
	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("D:\\work\\master\\webservices\\20180125\\Java\\Dom\\resource\\po.xml"));
		TraverseDoc traverseDoc = new TraverseDoc();
		traverseDoc.printNode(doc);
	}
}


















