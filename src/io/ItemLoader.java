package io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import model.Item;
import model.ItemDefinitions;

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
				Node item = listOfItems.item(i);
				
				if(item.getNodeType() == Node.ELEMENT_NODE) {
					Element itemNode = (Element) item;
					
					NodeList idList = itemNode.getElementsByTagName("id");
					if(idList.getLength() > 0) System.out.println();
					Element idElement = (Element) idList.item(0);
					System.out.println(idElement);
					
					NodeList textIdList = idElement.getChildNodes();
														
					NodeList nameList = itemNode.getElementsByTagName("name");
					Element nameElement = (Element) nameList.item(0);
					
					NodeList textNameList = nameElement.getChildNodes();
															
					NodeList descList = itemNode.getElementsByTagName("desc");
					Element descElement = (Element) descList.item(0);
					
					NodeList textDescList = descElement.getChildNodes();
										
					NodeList buyPriceList = itemNode.getElementsByTagName("buy");
					Element buyPriceElement = (Element) buyPriceList.item(0);
					
					NodeList textBuyPriceList = buyPriceElement.getChildNodes();
										
					NodeList sellPriceList = itemNode.getElementsByTagName("sell");
					Element sellPriceElement = (Element) sellPriceList.item(0);
					
					NodeList textSellPriceList = sellPriceElement.getChildNodes();
					
					items.add(new Item(Integer.parseInt(((Node) textIdList).getNodeValue().trim()), new ItemDefinitions()));
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
