package JavaProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentApp2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded");
		String url="jdbc:postgresql://localhost:5432/postgres";
		String uname="postgres";
		String pwd="subha007";
		Connection con=DriverManager.getConnection(url,uname,pwd);
		/*System.out.println("connection created");
		java.sql.Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		 while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getInt(2));
		}*/
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?)");
			ps.setString(1,"Sumit");
			ps.setInt(2,567);
			ps.executeUpdate();
			
			PreparedStatement ps1=con.prepareStatement("insert into student values(?,?)");
			ps.setString(1,"Sumit");
			ps.setInt(2,567);
			ps.executeUpdate();
			
 }
}
