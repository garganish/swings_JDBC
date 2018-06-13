/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_handlings;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author anishgarg
 */
public class firstway {
    public static void main(String[] args) {
        new firstframe();
    }
}
class firstframe extends Frame implements WindowListener
{
    public firstframe()
    {
        setTitle("firstframe");
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        
        addWindowListener(this);//registration
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("wndow is opended");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("wndow is closing");
        dispose();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("wndow is closed");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("wndow is minimisez");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("wndow is restore");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("wndow is focus");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("wndow is lost focus");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
