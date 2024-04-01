package PDF_quiz;

import java.util.Scanner;

public class P_M_16_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kakao = new String[100];
		
		int i = 0;
		while(true) {
			System.out.print("입력할 카카오친구> ");
			String friend = scan.next();
			
			kakao[i] = friend;
			
			if(friend.equals("그만")) {
				System.out.println(i + "명의 카카오 친구가 입력 되었습니다.");
				break;
			}else {
				System.out.println(friend + "입력 성공!");
				System.out.println("------------------");
			}
			i++;
		}
		
		scan.close();

	}

}
