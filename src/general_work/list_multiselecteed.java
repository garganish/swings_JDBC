/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general_work;

import java.awt.EventQueue;
import java.awt.Label;
import java.awt.List;

/**
 *
 * @author anishgarg
 */
public class list_multiselecteed {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new multi_list();
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }   
}

  class multi_list extends general
    {
         private List lt;
        private Label lb;
        public multi_list() {
            setLayout(null);
            
            //setLayout(new FlowLayout());
            lt = new List(7,true);
            lt.setBounds(50, 100, 200, 100);
            lt.add("audi");
            lt.add("mercedes");
            lt.add("bmw");
            lt.add("mustang");
            lt.add("fortuner");
            lt.add("lamborgine");
            lt.add("maseratti");
            
            lb=new Label();
            lb.setBounds(70, 200, 300, 300);
            add(lt);
            add(lb);
            lt.addItemListener((e)->
            {
                String[] values=lt.getSelectedItems();
                if(values.length>0)
                {
                    String val="";
                    for(String items :values )
                    {
                        val+="["+items+"]";
                        lb.setText(val);
                    }
                }
                else
                {
                    lb.setText("all items are cleared");
                }
            });
        }
        
    }