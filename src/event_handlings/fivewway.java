/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_handlings;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author anishgarg
 */
public class fivewway {
    public static void main(String[] args) {
        new five();
    }
    
}
class five extends Frame
{

    public five() {
         setTitle("five frame");
        setSize(500,500);
        setVisible(true);
        setLocationRelativeTo(null);
        //do the registrations always
        addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 dispose();
                // super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
             }
            
});
       
    }
    
}
