package com.sanyinchen.mian;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import com.sanyinchen.demo.ParseXml;
import com.sanyinchen.demo.XmlObject;

public class miantest {
public static void main(String[] arges)
{
	try {
		List<XmlObject> res=ParseXml.parseXml("http://1.sanyinchen.sinaapp.com/?feed=rss2");
	    for(XmlObject item:res)
	    {
	    	System.out.println("---------------------------------");
	    	System.out.println("title->"+item.getMtitle());
	    	System.out.println("creator->"+item.getCreator());
	    	System.out.println("category->"+item.getCategory());
	    	System.out.println("description->"+item.getDescription());
	    	System.out.println("pubDate->"+item.getPubDate());
	    	System.out.println("link->"+item.getLink());
	    	System.out.println("comments->"+item.getComments());
	    }
	} catch (XPathExpressionException | ParserConfigurationException
			| SAXException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
