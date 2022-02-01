import java.sql.*;
public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mondee";
		String username ="root";
		String password = "Pandu";
		String query="update emp set ename='nani' where eid=102";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		if(con!=null)
		   System.out.println("connection established");	
		PreparedStatement pstmt = con.prepareStatement(query);
		int count=pstmt.executeUpdate();
		if(count!= 0)
			System.out.print("Record updated!!");

	}

}
