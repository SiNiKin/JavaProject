import JDBC.DBConnect;
import JDBC.PlayVO;

public class testCre {

	public static void main(String[] args) {
		DBConnect dao = new DBConnect();
		PlayVO vo = new PlayVO();
		
		dao.createTable();

	}

}
