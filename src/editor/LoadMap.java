package editor;

import gfx.Position;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LoadMap {
	static ArrayList<Position> pos = new ArrayList<Position>();
	
	public static void load(String path) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		Document doc;

		try {
			db = dbf.newDocumentBuilder();
			doc = db.parse(new File(path));
			
			doc.getDocumentElement().normalize();
			
			NodeList listOfPositions = doc.getElementsByTagName("tile");
			
			for(int i = 0; i < listOfPositions.getLength(); i++) {
				Node firstPositionNode = listOfPositions.item(i);
				
				if(firstPositionNode.getNodeType() == Node.ELEMENT_NODE) {
					Element firstPositionElement = (Element) firstPositionNode;
					
					NodeList xList = firstPositionElement.getElementsByTagName("x");
					Element xElement = (Element) xList.item(0);
					
					NodeList textXList = xElement.getChildNodes();
					
					NodeList yList = firstPositionElement.getElementsByTagName("y");
					Element yElement = (Element) yList.item(0);
					
					NodeList textYList = yElement.getChildNodes();
					
					pos.add(new Position(Double.parseDouble(((Node) textXList.item(0)).getNodeValue().trim()), Double.parseDouble(((Node) textYList.item(0)).getNodeValue().trim())));
				}
			}
			
			Map.positions = pos;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
