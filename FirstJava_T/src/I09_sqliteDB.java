import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I09_sqliteDB {

	public static void main(String[] args) {
		// SQLite DB 연결하기
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("org.sqlite.JDBC");
			
			// 2. Connection 객체 생성
			String dbfile = "SQLiteDB.db";	// 실제 DB이 있는 경로...
			String url = "jdbc:sqlite:" + dbfile;
			// url -> jdbc:sqlite:SQLite.db
			
			conn = DriverManager.getConnection(url);
			System.out.println("DB 동작에 문제가 없어요!");
			
			// 3. stmt 객체 생성
			stmt = conn.createStatement();
			String sql = "create table if not exists test_table("
									+ "id integer primary key,"
									+ "lastname text(20) not null,"
									+ "firstname text(20),"
									+ "age numeric,"
									+ "city text(20) default 'Seoul')";
			int result = stmt.executeUpdate(sql);
			System.out.println("sql 처리 결과 : " + (result != 0? "성공" : "실패"));
			stmt.close();
			
			// CRUD 테스트 하세요~~~~
			String sql1 = "insert into test_table (lastname, firstname, age, city) "
					+ "values('김', '띠니', 26, '일산')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql1);
			System.out.println("sql 처리 결과 : " + (result != 0? "성공" : "실패"));
			stmt.close();
			
			String sql2 = "select * from test_table";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql2);
			while(rs.next()) {
				System.out.println("id : " + rs.getInt("id") + ", lastname : " 
									+ rs.getString("lastname") + ", firstname : "
									+ rs.getString("firstname") + ", age : "
									+ rs.getInt("age") + ", city : "
									+ rs.getString("city"));
			}
			stmt.close();
			rs.close();
			
			String sql3 = "update test_table set city = 'Busan' where id = 2";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql3);
			System.out.println("sql 처리 결과 : " + (result != 0? "성공" : "실패"));
			stmt.close();
			
			System.out.println("수정 결과 확인");
			String sql4 = "select * from test_table";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql4);
			while(rs.next()) {
				System.out.println("id : " + rs.getInt("id") + ", lastname : " 
									+ rs.getString("lastname") + ", firstname : "
									+ rs.getString("firstname") + ", age : "
									+ rs.getInt("age") + ", city : "
									+ rs.getString("city"));
			}
			stmt.close();
			rs.close();
			
//			String sql5 = "delete from test_table where id = 1";
//			stmt = conn.createStatement();
//			result = stmt.executeUpdate(sql5);
//			System.out.println("sql 처리 결과 : " + (result != 0? "성공" : "실패"));
//			stmt.close();
			
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException sqle) {
			System.out.println("SQL 연동 실패");
			System.out.println(sqle.getMessage());
		} finally {
			try {
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {}
		}

		
	}

}
