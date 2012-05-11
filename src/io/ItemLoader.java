package io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import model.Item;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ItemLoader {
	static ArrayList<Item> items = new ArrayList<Item>();
	
	public static ArrayList<Item> load(String path) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		Document doc;
		
		try {
			db = dbf.newDocumentBuilder();
			doc = db.parse(new File(path));
			
			doc.getDocumentElement().normalize();
						
			NodeList listOfItems = doc.getElementsByTagName("item");
			
			for(int i = 0; i < listOfItems.getLength(); i++) {
				Node firstItemNode = listOfItems.item(i);
				
				if(firstItemNode.getNodeType() == Node.ELEMENT_NODE) {
					Element firstItemElement = (Element) firstItemNode;
					
					NodeList idList = firstItemElement.getElementsByTagName("id");
					Element idElement = (Element) idList.item(0);
					NodeList textIdList = idElement.getChildNodes();
					
					System.out.println(textIdList);
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return items;
	}
}
