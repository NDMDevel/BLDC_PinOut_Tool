/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bldc_pinout_tool;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
        //org.jb2011.LNF.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF ();
        MainWindowV1 win = new MainWindowV1();
        win.setVisible(true);
    }
}
