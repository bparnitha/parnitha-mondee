import java.sql.*;
public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mondee";
		String username ="root";
		String password = "Pandu";
		String query="delete from emp where eid=201";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		if(con!=null)
		   System.out.println("connection established");	
		PreparedStatement pstmt = con.prepareStatement(query);
		int count=pstmt.executeUpdate();
		if(count!= 0)
			System.out.print("Record Deleted!!");

	}

}
