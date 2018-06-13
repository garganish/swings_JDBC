
package JDBCworking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class user_insertion {
    public static void main(String[] args) {
        Connection cc=null;
        Scanner sc=new Scanner(System.in);
        String cid,cname;
        int cfee;
        try
        {
            System.out.println("enter the courseid");
            cid=sc.nextLine();
            System.out.println("enter the coursename");
            cname=sc.nextLine();
            System.out.println("enter the coursefee");
            cfee=sc.nextInt();
            
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";
            cc=DriverManager.getConnection(db_url, db_user, db_pwd);
            String query="insert into courses";
            query+="(courseid,coursename,coursefee)";
            query+=""+"values('"+cid+"','"+cname+"',"+cfee+")";
            Statement smt=cc.createStatement();
           boolean res=smt.executeUpdate(query)>0;
            if(res)
            {
                System.out.println("insertion has been done");
            }
            else
            {
                System.out.println("something went wrong");
            }
        }catch(ClassNotFoundException | SQLException ex)
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
