package com.myweb.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	
	// 1. 스스로의 객체를 멤버 변수로 선언하고 1개로 제한
	private static BoardDAO instance = new BoardDAO();
		
	// 2. 외부에서 객체를 생성할 수 없에 생성자에 PROVATE 설정
	private BoardDAO() {
		try {
			// 커넥션 풀을 꺼내는 작업
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql2");
			} catch (NamingException e) {
				System.out.println("커넥션 풀링 에러 발생");
			}
		}
		
	// 3. 외부에서 객체를 요구할 때 getter를 써서 반환
	public static BoardDAO getInstance() {
		return instance;
	}
	
	// DB연결을 위한 객체 선언....
	private DataSource ds;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//------------ 기능을 메서드로 선언 -----------------------
}
