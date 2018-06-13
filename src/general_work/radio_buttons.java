/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general_work;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author anishgarg
 */
public class radio_buttons {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new checkbox_group();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
}
class checkbox_group extends general implements ItemListener
{
private  Label lb;
 private Checkbox ch1,ch2,ch3,ch4;
    private CheckboxGroup cg;
    Button btn;
    public checkbox_group() {
        setLayout(new FlowLayout());
        cg=new CheckboxGroup();
        ch1=new Checkbox("mercedes",cg,false);
        ch2=new Checkbox("bmw",cg,false);
        ch3=new Checkbox("audi",cg,false);
        ch4=new Checkbox("royal royce",cg,false);
        lb=new Label();
        btn=new Button("clear selection");
        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);
        add(lb);
        add(btn);
        //registrations
        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);
        ch4.addItemListener(this);
        btn.addActionListener((e)->
                {
                    cg.setCurrent(null);// USED TO UNCHECKED THE RADIO BUTTONS
                    lb.setText("nothng is selected");
                });
        
    }

    
    @Override
    public void itemStateChanged(ItemEvent e) {
        String mess="";
        if(ch1==e.getSource())
        {
            mess+="["+ch1.getLabel()+"]";
        }
        else if(ch2==e.getSource())
        {
            mess+="["+ch2.getLabel()+"]";
        }
        else if(ch3==e.getSource())
         {
                mess+="["+ch3.getLabel()+"]";
         }
        else if(ch4==e.getSource())
         {
                mess+="["+ch4.getLabel()+"]";
          }
        if(mess.isEmpty())
        {
            mess="nothing is selected";
        }
        else
        {
            lb.setText(mess);
        }
    }
    
}
