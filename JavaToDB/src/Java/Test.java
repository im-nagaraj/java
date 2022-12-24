package Java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Test {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_sql_quaries","root","Nagaraj@1234");
			java.sql.Statement stmt = con.createStatement();
		     String query= "SELECT * from cutomer where Name='Nagaraj';";
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("Id    Name     Age   ");
			
			while(rs.next())
				System.out.println(""+rs.getInt(1)+"   "+rs.getString(2) +"   "+rs.getInt(3));
		
			con.close();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

	

}
