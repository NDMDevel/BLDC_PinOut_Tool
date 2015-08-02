/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bldc_pinout_tool;

import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Escritorio
 */
public class DLDC_PinOut_Tool
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, Exception
    {
        /*
        // TODO code application logic here
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setValidating(false);
        dbf.setNamespaceAware(true);
        dbf.setFeature("http://xml.org/sax/features/namespaces", false);
        dbf.setFeature("http://xml.org/sax/features/validation", false);
        dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", false);
        dbf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document dom = db.parse("microchip_dsPIC33FJ128MC802.lbr");

        Element docElements = dom.getDocumentElement();
        // busca todos los tags <deviceset>
        NodeList deviceset = docElements.getElementsByTagName("deviceset");
        int device = 0;
        //busca el nombre del integrado (y lo guarda en devname)
        String devname = null;
        for( int i=0 ; i<deviceset.item(device).getAttributes().getLength() ; i++)
            if( deviceset.item(device).getAttributes().item(i).getNodeName().equals("name") )
            {
                devname = deviceset.item(device).getAttributes().item(i).getNodeValue();
                break;
            }
        
        //busca los package disponibles para el integrado y los guarda en packages
        ArrayList<String> packages = new ArrayList();
        for( int i=0 ; i<deviceset.item(device).getChildNodes().getLength() ; i++)
            for( int j=0 ; j<deviceset.item(device).getChildNodes().item(i).getChildNodes().getLength() ; j++)
                if( deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getNodeName().equals("device") )
                {
                    //packages_count indica la cantidad de packages disponibles para este integrado
                    for( int k=0 ; k<deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getAttributes().getLength() ; k++ )
                        if( deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getAttributes().item(k).getNodeName().equals("package") )
                        {
                            System.out.println(deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getAttributes().item(k).getNodeName());
                            System.out.println(deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getAttributes().item(k).getNodeValue());
                            packages.add(deviceset.item(device).getChildNodes().item(i).getChildNodes().item(j).getAttributes().item(k).getNodeValue());
                        }
                }
        System.out.println("<"+devname+">");
        System.out.println(devname);
        for( int i=0 ; i<packages.size() ; i++ )
            System.out.println(packages.get(i));
        System.out.println("</"+devname+">");

        
        //org.jb2011.LNF.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF ();
        }*/
        MainWindow win = new MainWindow();
        win.setVisible(true);
    }
}
