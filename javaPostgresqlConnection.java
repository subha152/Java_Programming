package JavaProject2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeClass {
   public static void main(String[] args) throws ClassNotFoundException, SQLException{
	  Class.forName("org.postgresql.Driver");
	  System.out.println("Driver Loaded");
	  String url="jdbc:postgresql://localhost:5432/emp";
	  String uname="postgres";
	  String pwd="subha007";
	  Connection con=DriverManager.getConnection(url,uname,pwd);
	  Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select * from employee");
	  while(rs.next()) {
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	  }
   }
}

create database emp;
create table employee(
	roll int primary key,
	name varchar(20) not null,
	age int not null,
	city varchar(20) not null
)
select * from employee;
insert into employee(roll,name,age,city)
values(1,'abc',19,'Kolkata'),
(2,'ab',20,'Mumbai'),
(3,'abcd',22,'Bangalore'),
(4,'subha',23,'pune');
