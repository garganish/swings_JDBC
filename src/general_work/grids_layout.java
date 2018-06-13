/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general_work;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class grids_layout {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
           new grid();                
            }
        });
    }
}
class grid extends general implements ActionListener
{
  Button[][] bt;
    public grid() {
       bt=new Button[10][10];
        GridLayout layout=new GridLayout(10, 10, 10, 10);
        setLayout(layout);
        int count=100;
        for(int i = 0; i < 10; i++ ){
            for(int j = 0; j < 10; j++ ){
                bt[i][j] = new Button();
                add(bt[i][j]);
                bt[i][j].addActionListener(this);
            }
        }
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<10;j++)
                {
                   bt[i][j].setLabel(String.valueOf(count));
                   count--;
                }
            }
            else
            {
             
             
             for(int j=9;j>=0;j--)
             {
                 bt[i][j].setLabel(String.valueOf(count));
                   count--;;
             }
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() instanceof Button)
        {
            Button bt= (Button) e.getSource();
            setTitle("button "+bt.getLabel()+" clicked");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
