package kasus;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 * ParsingData
 */
public class ParsingData {

    public static void main(String[] args) {
        try {
            File inputFile = new File ("data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element:"+ doc.getDocumentElement().getNodeName());
            System.out.println("-----------------------------");

            for (int temp = 0; temp <nList.getLenght(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "+nNode.getNodeName());

                if (nNode.getNodeType()==Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Employee Name : " + eElement.getAttribute("name").item(0).getTextContent());
                    System.out.println("Employee Email : " + eElement.getAttribute("email").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}