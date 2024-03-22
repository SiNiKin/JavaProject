package Quiz;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Quiz_240322AM {

	public static void main(String[] args) {
		
		// 생성
		File test = new File("D:/filetest4");
		if (!test.exists()) {	// 파일 폴더가 존재하지 않는 경우...
			test.mkdirs();
		}
		
		File dongju = new File("D:/filetest4/윤동주.txt");
		
		try {
			dongju.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 생성 중 에러가 발생하였습니다.");
		}
		
		
		// 확인
		System.out.println("isDirectory? : " + test.isDirectory());
		System.out.println("exists? : " + dongju.exists());
		
		
		// 이동
		File dst = new File("D:/FileTest/testFile/temp");
		if (!dst.exists()) {
			dst.mkdirs();
		}
		
//		dongju = new File("D:/filetest4/윤동주.txt");
//		dst = new File("D:/FileTest/testFile/temp");
//		
//		dongju.renameTo(dst);
		
		dongju = new File("D:/filetest4/윤동주.txt");
		dst = new File("D:/FileTest/testFile/temp/윤동주.txt");		
		
		
		// 읽기
		FileReader in = null;
		
		char[] cbuf = new char[100];
		String content = "";
		
		try {
			in = new FileReader(dst);		// 기준 데이터 char
			while (true) {
				int data = in.read(cbuf);		// data 반환값은 char의 갯수. 글자수를 기준으로 함
				System.out.println(data);
				if (data != -1) content = new String(cbuf, 0, data);
				else break;
				System.out.println(content);
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { in.close();} catch (Exception e) {}
		}
		
	}

}
