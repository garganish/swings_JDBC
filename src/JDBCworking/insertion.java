/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCworking;

import com.mysql.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anishgarg
 */
public class insertion {
    public static void main(String[] args) {
        Connection cc=null;
        try
        {
          Class.forName("com.mysql.jdbc.Driver");//if exption occur her then as the coonection is null 
          //so it does't go into the further code and in finnaly block null.close() gives null pointer excetion and class not found expetion
          // so to solve the issue check whether the connection hasnull value or not.
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String username="";
            String password="";
            
            cc =  DriverManager.getConnection(db_url, username, password);
           String query="insert into courses";
           query+="(courseid,coursename,coursefee)";
           query+="values('BEE3401','BEEE',3500)";
            Statement smt=cc.createStatement();
            boolean res=smt.executeUpdate(query)>0;
            if(res)
            {
                System.out.println("insert funcrtion done");
            }
            else
            {
                System.out.println("insertion cannot be done");
            }
            
        }catch(ClassNotFoundException| SQLException ex)
        {
            System.out.println(ex);   
        }
        finally
        {
            try
            {
                if(cc!=null)
                {
                cc.close();
                }
            }
            catch(SQLException ex)
            {
                System.out.println(ex);
            }
           
        }
    }
    
}
