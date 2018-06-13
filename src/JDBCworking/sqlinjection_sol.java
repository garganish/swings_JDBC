
package JDBCworking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class sqlinjection_sol {
    public static void main(String[] args) {
        
         Connection con=null;
        Scanner sc=new Scanner(System.in);
        String uname,upass;
        
        try
        {
            System.out.println("enter the username");
            uname=sc.nextLine();
            System.out.println("enter the password");
            upass=sc.nextLine();
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://192.168.64.2:3306/anish_working1";
            String db_user="";
            String db_pwd="";

            con=DriverManager.getConnection(db_url, db_user, db_pwd);
            String query="select * ";
            query+=" from logins";
            query+=" where username=? and password=?";
            System.out.println(query);
            //Statement smt=con.createStatement();
            PreparedStatement smt=con.prepareStatement(query);
            smt.setString(1,uname);
             smt.setString(2,upass);
            //use prepared statement instead of the statements as it avoids the SQL INJECTION as it in the prepared
            // statement the single qoutes is act as a value not as the string.
            ResultSet rs=smt.executeQuery();
            
            if(rs.next())
            {
                System.out.println("valid user");
            
            }
            else
            {
                System.out.println("invalid user");
            }
            rs.close();
            
            smt.close();
            
           
        }catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println(ex);
        }
          finally
        {
            try
            {
                if(con!=null)
                {
                con.close();
                }
            }catch(SQLException ex)
            {
                
            }
            
        }
    }
}
