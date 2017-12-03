package com.siva;
import java.sql.*;

public class RegisterDao {

	public static int save(RegisterAction r){
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:localDb","svraju", "svraju1234");
			PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?,?)");
			ps.setString(1,r.getName());
			ps.setString(2,r.getPassword());
			ps.setString(3,r.getEmail());
			ps.setString(4,r.getGender());
			ps.setString(5,r.getCountry());
			
			status=ps.executeUpdate();
			con.close();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}

	public static int get(RegisterAction r){
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:localDb","svraju", "svraju1234");
			PreparedStatement ps=con.prepareStatement("select * from strutsuser where name = ?");
			
			ps.setString(1,r.getName());
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				r.setName(rs.getString(1));
				r.setPassword(rs.getString(2));
				r.setEmail(rs.getString(3));
				r.setGender(rs.getString(4));
				r.setCountry(rs.getString(5));				
				
//				list.add(user);
				status =1;
			}
			rs.close();	
			con.close();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}

	public static int update(RegisterAction r){
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:localDb","svraju", "svraju1234");
			PreparedStatement ps=con.prepareStatement("update strutsuser set password = ?, email  =?, gender = ?, country =? where name=?");
			ps.setString(1,r.getName());
			ps.setString(2,r.getPassword());
			ps.setString(3,r.getEmail());
			ps.setString(4,r.getGender());
			ps.setString(5,r.getCountry());
			
			status=ps.executeUpdate();
			con.close();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}

	public static int delete(RegisterAction r){
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:localDb","svraju", "svraju1234");
			PreparedStatement ps=con.prepareStatement("delete from strutsuser name = ?");
			ps.setString(1,r.getName());
			
			status=ps.executeUpdate();
			con.close();
		
		}catch(Exception e){e.printStackTrace();}
		return status;
	}

}
