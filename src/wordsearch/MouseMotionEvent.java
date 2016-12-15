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
public class MouseMotionEvent extends javax.swing.JFrame implements MouseMotionListener, MouseListener {
    
    static final String NEWLINE = System.getProperty("line.separator");
    
    public MouseMotionEvent() {
        addMouseMotionListener(this);
    }
     
    @Override
    public void mouseMoved(MouseEvent e) {
        //eventOutput("Mouse moved", e);
    }
     
    @Override
    public void mouseDragged(MouseEvent e) {
        Input.findJTextFields(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Input.findJTextFields(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Input.findJTextFields(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //eventOutput("Mouse released", e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //eventOutput("Mouse entered", e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //eventOutput("Mouse exited", e);
    }
}
