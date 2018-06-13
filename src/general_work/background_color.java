
package general_work;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;


public class background_color {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new colours();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
class colours extends general implements Runnable
{
     Thread t;
    public colours() {
     
     t=new Thread(this);// jo object Thread to call kr rha h usski reference iss k pass h
     //jo b iss method k liye colors name ka object chal rha hoga uss ki reference ho gi iss k pass
     t.start();
        addWindowListener(new closing());
     }
    @Override
    public void run() {
           Random rom=new Random();
        while(true)
        {
            try
            {
             Thread.sleep(1500);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
            int red=rom.nextInt(256);
            int green=rom.nextInt(256);
            int blue=rom.nextInt(256);
            Color co=new Color(red, green, blue);
            setBackground(co);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    class closing extends WindowAdapter // FOR CLOSING THE THREAD AS U CVAN STOP THE PROGRAMM ANYTIME BUT THREAD IS WORKING 
    {
        //also 1 window lister is used to stop frame and another is for stooping the thread
        @Override
        public void windowClosing(WindowEvent e) {
            t.stop();
           // super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
