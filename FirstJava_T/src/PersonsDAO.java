import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PersonsDAO {

	private String url = "jdbc:mariadb://localhost:13306/testdb";
	private String user = "root";
	private String password = "root1234";
	
	// DB 연동을 위한 객체 선언
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public PersonsDAO() {
		try {
			// 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			// Connection 객체 생성
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 객체 생성!!!");
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
			System.out.println(ce.getMessage());
		} catch (SQLException sqle) {
			System.out.println("SQL연동 실페");
			System.out.println(sqle.getMessage());
		}
	}
	

	// insert
	public int insert(PersonsVO vo) {
		int result = 0;
		
		String sql = "insert into Persons (lastname, firstname, age, city) "
				+ "values('" + vo.getLastname() + "','" + vo.getFirstname() + "'," 
				+ vo.getAge() + " ,'" + vo.getCity() + "')";
		
		try {
			// Statement 객체 생성
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("SQL 연동 에러");
			System.out.println(e.getMessage());
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e2) {}
		}
		
		return result;
	}
	
	// 2. 정보 출력 메서드
		// 전체 테이블 정보 출력
		public List<PersonsVO> allPersons() {
			List<PersonsVO> list = new ArrayList<>();
			
			String sql = "select * from Persons Order by id desc ";
			
			try {
				// Statement 객체 생성
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String lastname = rs.getString("lastname");
					String firstname = rs.getString("firstname");
					int age = rs.getInt("age");
					String city = rs.getString("city");
					
					PersonsVO vo = new PersonsVO(id, firstname, lastname, age, city);
					list.add(vo);
				}
			} catch (SQLException e) {
				System.out.println("SQL 연동 실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
					if(rs != null) rs.close();
				} catch (Exception e2) {}
			}
			
			return list;
		}
		
		// id 입력값을 통한 정보 출력
		public PersonsVO selectOne(int id) {
			PersonsVO vo = null;
			
			String sql = "select * from persons where id = " + id;
			
			try {
				// Statement 객체 생성
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					vo = new PersonsVO();
					vo.setId(rs.getInt("id"));
					vo.setLastname(rs.getString("lastname"));
					vo.setFirstname(rs.getString("firstname"));
					vo.setAge(rs.getInt("age"));
					vo.setCity(rs.getString("city"));
				}else {
					System.out.println("찾는 DB가 없습니다.");
				}
			} catch (SQLException e) {
				System.out.println("SQL 연동 실패");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
					if(rs != null) rs.close();
				} catch (Exception e2) {}
			}
			
			return vo;
		}
		
		// 3. 정보 수정 메서드
		public int updatePersons(PersonsVO vo) {
			int result = 0;
			
			String sql = "update persons set firstname = '" + vo.getFirstname() + "', "
					+ "lastname = '" + vo.getLastname() + "', age = " + vo.getAge()
					+ ", city = '" + vo.getCity() + "' where id = " + vo.getId();
			
			try {
				// Statement 객체 생성
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println("SQL 연동 에러");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
				} catch (Exception e2) {}
			}
			
			return result;
		}
		
		
		// 4 . 정보 삭제 메서드
		public int deletePersons(int id) {
			int result = 0;
			
			String sql = "delete from persons where id = " + id;
			
			try {
				// Statement 객체 생성
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (SQLException e) {						// Exception 써도 노상관 / SQL보다 상위
				System.out.println("SQL 연동 에러");
				System.out.println(e.getMessage());
			} finally {
				try {
					if(stmt != null) stmt.close();
				} catch (Exception e2) {}
			}
			
			return result;
		}

}
