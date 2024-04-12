package com.myweb.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class UserDAO {
	
	// 1. 스스로의 객체를 멤버 변수로 선얻하ㅓ고 1개로 제한
	private static UserDAO instance = new UserDAO();
	
	// 2. 외부에서 객체를 생성할 수 없에 생성자에 PROVATE 설정
	private UserDAO() {
		// 생성자가 한번 동작할 때 다음과 같은 동작 처리... 드라이버와 연결...
		try {
			// 커넥션 풀을 꺼내는 작업
			InitialContext ctx = new InitialContext();	// 초기 설정파일 저장되는 객체
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql2");
		} catch (NamingException e) {
			System.out.println("커넥션 풀링 에러 발생");
		}
	}
	
	// 3. 외부에서 객체를 요구할 때 getter를 써서 반환
	public static UserDAO getInstance() {
		return instance;
	}
	
	// DB연결을 위한 객체 선언....
	private DataSource ds;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//------------ 기능을 메서드로 선언 -----------------------
	// 회원가입
	public int join(UserVO vo) {
		int result = 0;
	
		String sql = "insert into user values(?,?,?,?,?,?)";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getAddress());
			pstmt.setTimestamp(6, vo.getRegdate());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 로그인
	public int login(String id, String pw) {
		int result = 0;
		String sql = "select * from user where id = ? and pw = ?";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) result = 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 회원 정보 조회
	public UserVO getInfo(String id) {
		UserVO vo = null;
		
		String sql = "select * from user where id = ?";
		
		try {
			// conn 객체 생성
//				conn = DriverManager.getConnection(url, user, password);
			conn = ds.getConnection();
			// pstmt 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//sql 실행
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				vo = new UserVO(id, null, name, email, address, regdate);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}
		
		return vo;
	}
	
	// 회원 정보 수정
	public int update(UserVO vo) {
		int result = 0;
		
		String sql = "update user set name = ?, email=?, address=? where id=?";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getId());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 회원 정보 삭제
	public int delete(String id) {
		int result = 0;
		
		String sql = "delete from user where id = ?";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
}
