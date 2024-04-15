package com.myweb.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.myweb.util.JdbcUtil;


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
	// 중복 확인 메서드
	public int IdConfirm(String id) {
		int result = 0;
		
		String sql = "select * from users where id = ?";
		
		try {
			// Connection Pool
			conn = ds.getConnection();
			
			// PreparedStatement
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			//SQL 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		
		return result;
	}
	
	// 회원가입 메서드 
	public int join(UserVO vo) {
		int result = 0;
	
		String sql = "insert into users(id, pw, name, email, address) "
				+ "values(?,?,?,?,?)";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getAddress());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 로그인
	public int login(String id, String pw) {
		int result = 0;
		String sql = "select * from users where id = ? and pw = ?";
		
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
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 회원 정보를 얻어오는 메서드 
	public UserVO getUserInfo(String id1) {
		UserVO vo = null;
		
		String sql = "select * from users where id = ?";
		
		try {
			// conn 객체 생성
			conn = ds.getConnection();
			// pstmt 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id1);
			
			//sql 실행
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				Timestamp regdate = rs.getTimestamp("regdate");
				
				vo = new UserVO(id, null, name, email, address, regdate);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return vo;
	}
	
	// 회원 정보 수정
	public int update(UserVO vo) {
		int result = 0;
		
		String sql = "update users set name = ?, email=?, address=? where id=?";
		
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
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 패스워드 변경 메서드
	public int changePassword(String id, String newPw) {
		int result = 0;
		
		String sql = "update users set pw = ? where id=?";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, newPw);
			pstmt.setString(2, id);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
	
	// 회원 정보 삭제
	public int delete(String id) {
		int result = 0;
		
		String sql = "delete from users where id = ?";
		
		try {
			// Connection 객체 생성
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				JdbcUtil.close(conn, pstmt, rs);
		}
		
		return result;
	}
}
