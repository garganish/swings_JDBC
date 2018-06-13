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
public class secondway {
    public static void main(String[] args) {
        new second();
    }
    
}
class second extends Frame
{

    public second() {
        setTitle("second frame");
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        //do the registrations always
        secondframes actions=new secondframes(this);
        addWindowListener(actions);
    }
    
}
class secondframes implements WindowListener
{
private second sf;

    public secondframes(second sf) {
        this.sf = sf;
    }

    

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
        sf.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
