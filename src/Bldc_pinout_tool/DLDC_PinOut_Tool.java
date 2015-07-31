/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bldc_pinout_tool;

import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
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
//        try
        {
            NodeList symbols;
            symbols = dom.getElementsByTagName("symbol");
            System.out.println("Symbols found: "+symbols.getLength());
            for( int i=0 ; i<symbols.getLength() ; i++ )
            {
                Node chip_node = symbols.item(i);
                String chip_name = chip_node.getAttributes().item(0).getNodeValue();
                System.out.println("Chip: "+chip_name);
                if( chip_name.contains("PIC") )
                {
                    NodeList chip_items = chip_node.getChildNodes();
                    for( int j=0 ; j<chip_items.getLength() ; j++ )
                        if( chip_items.item(j).getNodeName().equals("pin") )
                            for( int k=0 ; k<chip_items.item(j).getAttributes().getLength() ; k++ )
                                if( chip_items.item(j).getAttributes().item(k).getNodeName().equals("name") )
                                    System.out.println(chip_items.item(j).getAttributes().item(k).getNodeValue());
                }
            }
        }
//        catch(Exception e)
        {
            //hacer nada
        }
        
        //org.jb2011.LNF.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF ();
        MainWindowV1 win = new MainWindowV1();
        win.setVisible(true);
    }
}
