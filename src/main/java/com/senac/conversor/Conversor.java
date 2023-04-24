/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.conversor;

import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author user
 */
public class Conversor {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        ConversorFrame frame = new ConversorFrame();
        frame.setVisible(true);
    }
}
