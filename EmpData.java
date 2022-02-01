import java.util.Scanner;
import java.sql.*;
class EmpData {
	    static Scanner sc=new Scanner(System.in);
	    static void insert(Statement stmt) throws SQLException{
		System.out.println("Enter eid,ename,salary");
		int eid=sc.nextInt();
		String ename=sc.next();
		int sal=sc.nextInt();
		int i=stmt.executeUpdate("insert into emp values("+eid+",'"+ename+"',"+sal+")");
		if(i!=0) {
			System.out.println("Record Inserted");
		}
	}
	    static void delete(Statement stmt) throws SQLException{
		System.out.println("Enter eid to delete:");
		int eid=sc.nextInt();
		int x=stmt.executeUpdate("delete from emp where eid="+eid+" ");
		if(x!=0) {
			System.out.println("Record Deleted");
		}
	}
	    static void update(Statement stmt) throws SQLException{
		int j=stmt.executeUpdate("update emp set sal=sal+ "+2500+"");
		if(j!=0) {
			System.out.println("Record Updated");
		}
	}
	    static void select(Statement stmt) throws SQLException{
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondee","root","Pandu");
		Statement stmt=con.createStatement();
		while(true) {
			System.out.println("emp database ..........\n Enter your choice\n1.insert\n2.update\n3.delete\n4.select");
			char ch=sc.next().charAt(0);
			
			switch(ch) {
			case '1':
				insert(stmt);
				break;
			case '2':
				update(stmt);
				break;
			case '3':
				delete(stmt);
				break;
			case '4':
				select(stmt);
				break;
			default:
				System.out.println("Invalid option");
			
			}
			System.out.println("\nDo you want to continue? y/n");
			char cr=sc.next().charAt(0);
				System.out.println("want to continue: "+cr);
			}
		}
	}

