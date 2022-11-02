package SqlServerConnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnector {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:sqlserver://localhost:1433;"+
		"databaseName=seleniumTest;IntegratedSecurity=true";
        
         //Database Password
        //String userName="root";
        //String password="root";
        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
        try{
        	
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	//Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        	con=DriverManager.getConnection(dbUrl);
        	//con = DriverManager.getConnection(dbUrl,userName,password); // if database have userName and password
        	System.out.println("Connection Established");
        	
        	String SQL="select * from employee";
        	st=con.createStatement();
        	rs=st.executeQuery(SQL);
        	
        	while(rs.next())
        	{
        		System.out.println(rs.getString(1)+" "+rs.getString(2));
        	}
        }
        catch(Exception e){
        	e.printStackTrace();
        }	

	}

}
