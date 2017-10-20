/*

    To change this license header, choose License Headers in Project Properties.
    To change this template file, choose Tools | Templates
    and open the template in the editor.
    */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * 
 * @author Andrea_F
 */
public class TestSubstance extends javax.swing.JFrame {

    /**
     * Creates new form TestSynthetica
     */
    public TestSubstance() {
        initComponents();
    }

    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * 
     * WARNING: Do NOT modify this code. The content of this method is always
     * 
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400,
                        Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300,
                        Short.MAX_VALUE));

        pack();
    }
        //

    public static void main(String[] args) {
        /**
         * @Param args the command line arguments / public static void
         *        main(String args[]) {
         *        JFrame.setDefaultLookAndFeelDecorated(true);
         *        JDialog.setDefaultLookAndFeelDecorated(true); / Create and
         *        display the form
         */
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                            "org.pushingpixels.substance.api.skin.SubstanceGraphiteChalkLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TestSubstance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TestSubstance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TestSubstance.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TestSubstance.class.getName()).log(Level.SEVERE, null, ex);
                }
                new TestSubstance().setVisible(true);
            }
        });
    }
}