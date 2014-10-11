package com.sanyinchen.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXml {
	public static List<XmlObject> parseXml(String filepath)
			throws ParserConfigurationException, SAXException, IOException,
			XPathExpressionException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();
		builderFactory.setNamespaceAware(true);
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(filepath);
		XPathFactory factory = XPathFactory.newInstance();
		XPath path = factory.newXPath();
		XPathExpression expression = path.compile("/rss/channel/item");
		Object res = expression.evaluate(document, XPathConstants.NODESET);
		NodeList nodeList = (NodeList) res;
		System.out.println("length->"+nodeList.getLength());
		List<XmlObject> reslist=new ArrayList<XmlObject>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element node =(Element) nodeList.item(i);
			//System.out.println("title: "+node.getElementsByTagName("dc:creator").item(0).getFirstChild().getNodeValue());
			String mtitle=node.getElementsByTagName("title").item(0).getFirstChild().getNodeValue();
			String link=node.getElementsByTagName("link").item(0).getFirstChild().getNodeValue();
			String comments=node.getElementsByTagName("comments").item(0).getFirstChild().getNodeValue();
			String pubDate=node.getElementsByTagName("pubDate").item(0).getFirstChild().getNodeValue();
			String creator=node.getElementsByTagName("dc:creator").item(0).getFirstChild().getNodeValue();
			String description=node.getElementsByTagName("description").item(0).getFirstChild().getNodeValue();
			String category=node.getElementsByTagName("category").item(0).getFirstChild().getNodeValue();
			//String pubDate=node.getElementsByTagName("comments").item(0).getFirstChild().getNodeValue();
			XmlObject object=new XmlObject(mtitle, link, comments, pubDate, creator, description, category);
			reslist.add(object);
		}

		return reslist;
	}
	
}
