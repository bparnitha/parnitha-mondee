import java.sql.*;
public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mondee";
		String username ="root";
		String password = "Pandu";
		Connection con = DriverManager.getConnection(url, username, password);
		if(con!=null)
		   System.out.println("connection established");	
		
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate("insert into emp values(205,'ramesh',32000)");
		if(count!=0)
			System.out.print("Record Inserted!!");

	}
	}

