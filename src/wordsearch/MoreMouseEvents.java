/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsearch;

import java.awt.event.*;

/**
 * @author Daniel Smith
 * This Class is enabled when the use drags the mouse over the screen
 */
public class MoreMouseEvents extends javax.swing.JFrame implements MouseListener {
    
    static final String NEWLINE = System.getProperty("line.separator");
    
    public MoreMouseEvents() {
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Input.findJTextFields(me);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        Input.findJTextFields(me);
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        Input.findJTextFields(me);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //System.out.println("ENTERED");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //System.out.println("EXITED");
    }
}
