package latiahan2xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class JDomQueryXmlFileDemo {

   public static void main(String[] args) {

      try {
         File inputFile = new File("jdomquery.txt");
         SAXBuilder saxBuilder = new SAXBuilder();
         Document document = saxBuilder.build(inputFile);
         System.out.println("Root element :" + document.getRootElement().getName());
         Element classElement = document.getRootElement();

         List<Element> supercarList = classElement.getChildren("supercars");
         System.out.println("----------------------------");

         for (int temp = 0; temp < supercarList.size(); temp++) {    
            Element supercarElement = supercarList.get(temp);
            System.out.println("\nCurrent Element :" + supercarElement.getName());
            Attribute attribute = supercarElement.getAttribute("company");
            System.out.println("company : " + attribute.getValue() );
            List<Element> carNameList = supercarElement.getChildren("carname");
            
            for (int count = 0; count < carNameList.size(); count++) {	 
               Element carElement = carNameList.get(count);
               System.out.print("car name : ");
               System.out.println(carElement.getText());
               System.out.print("car type : ");
               Attribute typeAttribute = carElement.getAttribute("type");
               
               if(typeAttribute != null)
                  System.out.println(typeAttribute.getValue());
               else {
                  System.out.println("");
               }
            }
         }
      } catch(JDOMException e) {
         e.printStackTrace();
      } catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
}