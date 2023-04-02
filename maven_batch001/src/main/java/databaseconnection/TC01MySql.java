package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TC01MySql {
	public static void main(String args[]){  
	try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
		
String dburl="jdbc:mysql://localhost:3306/om1";
String dbun="root";
String dbpw="root";
		
Connection con=DriverManager.getConnection(dburl,dbun,dbpw);  
		
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from stud");  
	
while(rs.next())  
{//provide column number in that one particular row
	int sid=rs.getInt(1);
	String sname=rs.getString(2);
	int salary=rs.getInt(3);
	int bonous=rs.getInt(4);
}

con.close();  
		}
	catch(Exception e)
	{ System.out.println(e);}  
		
/*my sql password reset
 https://www.youtube.com/watch?v=uD2c1GQSc-I
 https://www.youtube.com/watch?v=opHWC5N2jfU*/		
		}  
		}  
