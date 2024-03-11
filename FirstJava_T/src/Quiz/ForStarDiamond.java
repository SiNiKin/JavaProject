package Quiz;

import java.util.Scanner;

public class ForStarDiamond {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별직기를 진행해 보세요.  
		/*          힌트  : 공백, 별, 단(줄)
		      *
		     ***
		    *****
		   *******
		  *********
		   *******
		    *****
		     ***
		      *
		 */
//		int dan = 5;
//		
//		System.out.println("1) ");
//		for (int i = 0; i < dan; i++) {
//			// space를 찍기...
//			for (int j = 0; j < dan - i - 1; j++) {
//				System.out.print(" ");
//			}
//			// 별찍기...
//			for (int j = 0; j < i*2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); 	// 줄바꿈
//		}
//		for (int i = 1; i < dan; i++) {
//			// space를 찍기...
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			// 별찍기...
//			for (int j = 0; j < 2*dan - (2*i) - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println(); 	// 줄바꿈
//		}

		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		int line = scan.nextInt();
		
		if (line % 2 == 0) {
			System.out.println("입력값이 잘못 되었습니다.");
		}else {
			System.out.println("사용자가 입력한 문자열 : " + line);
			
			for (int i = 0; i < line; i++) {
				// space를 찍기...
				for (int j = 0; j < line - i - 1; j++) {
					System.out.print(" ");
				}
				// 별찍기...
				for (int j = 0; j < i*2 + 1; j++) {
					System.out.print("*");
				}
				System.out.println(); 	// 줄바꿈
			}
			
			for (int i = 1; i < line; i++) {
				// space를 찍기...
				for (int j = 1; j < i + 1; j++) {
					System.out.print(" ");
				}
				// 별찍기...
				for (int j = 0; j < 2*line - (2*i) -1; j++) {
					System.out.print("*");
				}
				System.out.println(); 	// 줄바꿈
			}
		}

	}

}