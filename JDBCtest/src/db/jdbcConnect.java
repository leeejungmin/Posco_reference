package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

import dto.Student;

public class jdbcConnect {
	
	public jdbcConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public Connection getConnection() {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
		
			System.out.println("MySQL Connection Success!!");
		} catch (SQLException e) {			 
			e.printStackTrace();
		}
		return conn;
	}
	
	public int insertData(int number, String name) {
		
		String sql = " INSERT INTO TESTTABLE(NUMBER, NAME) "
				   + " VALUES(" + number + ", '" + name + "') ";
		System.out.println(sql);
		
		Connection conn = getConnection();
		Statement state = null;
		
		int count = 0;
		
		try {
			state = conn.createStatement();
			
			count = state.executeUpdate(sql);
			
			System.out.println("성공적으로 추가되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// DB rollback
			e.printStackTrace();
		} finally {			
			// DB close			
			try {
				if(conn != null) {
					conn.close();
				}
				if(state != null) {
					state.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}			
		}
		return count;
	}
	
	public boolean createData(String name, int number) {
		
		String sql = " 	INSERT INTO TESTTABLE(NUMBER, NAME) "
				   + "  VALUES(?, ?) ";
		
		Connection conn = getConnection();
		PreparedStatement psmt = null;
		
		int count = 0;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, number);
			psmt.setString(2, name);
			
			count = psmt.executeUpdate();
			
			System.out.println("정상적으로 추가되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// DB close			
			try {
				if(conn != null) {
					conn.close();
				}
				if(psmt != null) {
					psmt.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}	
		}
		return count>0?true:false;
	}
	
	// insert delete update = 0/1
	// select 90%
	
	public List<Student> allSelect() {
		
		String sql = " SELECT NUMBER, NAME FROM TESTTABLE ";
		
		Connection conn = getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<Student> list = new ArrayList<Student>();
		
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Student st = new Student(rs.getInt(1), rs.getString(2));
				list.add(st);
			}
			
			System.out.println("모두 검색되었습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// DB close			
			try {
				if(conn != null) {
					conn.close();
				}
				if(psmt != null) {
					psmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}	
		}
		return list;
	}
	
	
	
}














