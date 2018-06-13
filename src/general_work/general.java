
package general_work;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class general extends Frame
{

    public general() {
        setTitle("my general frame");
        setSize(500,500);
        
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
               // super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
            }
            
});
        setVisible(true);
    }
    
}
