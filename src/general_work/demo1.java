
package general_work;

import java.awt.EventQueue;


public class demo1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new firstframe();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    
}
class firstframe extends general
{
    
}
