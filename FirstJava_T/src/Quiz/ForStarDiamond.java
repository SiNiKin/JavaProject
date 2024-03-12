package Quiz;

import java.util.Scanner;

public class ForStarDiamond {

	public static void main(String[] args) {
		// 다이아몬드 찍기
		// 1. 다음과 같은 형태로 별찍기를 진행해 보세요.  
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
		int dan = 5;
		
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < dan - i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		dan = 4;
		for (int i = 0; i < dan; i++) {
			for (int s = 0; s < i + 2; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j < dan*2 - (i*2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// T
		Scanner scan = new Scanner(System.in);
//		System.out.print("몇 줄 그릴까요? ");
//		
//		int d = scan.nextInt();
//		
//		for (int i = 0; i < d; i++) {
//			for (int s = 0; s < d - i-1; s++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i*2 + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < d - 1; i++) {
//			for (int s = 0; s < i + 1; s++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * (d - i - 1) - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 2. 1번의 코드를 활용하여 줄 수를 입력 받아서 그 줄 수 에 맞는 다이아몬드 별을 찍는 
 		//   프로그램을 작성해 보세요. (단, 줄은 홀수로만 입력 받아야 합니다.)
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("몇 줄 그릴까요? ");
//		int row = scan.nextInt();
		// T
		
		// 변수 선언 : sp(여백), st(별), 반전을 위한 flag(boolean)- true(삼각형), false(역삼각형)
//		int sp = row/2;
//		int st = 1;
//		boolean flag = true;
//		
//		for (int i = 0; i < row; i++) {
//			// 여백처리...
//			for (int j = 0; j < sp; j++) {
//				System.out.print(" ");
//			}
//			// 별 찍기...
//			for (int j = 0; j < st; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			if (i == (row/2)) flag = false;	// 반전
//			if(flag) {
//				sp -= 1; st += 2;
//			}else {
//				sp += 1; st -=2;
//			}
//		}
		
		
		
//		int row = scan.nextInt();
//		int row2 = (row+1)/2;
//		
//		if (row % 2 != 0) {
//			
//			for (int i = 0; i < row2; i++) {
//				for (int s = 0; s < row2 - i; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < i*2 +1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			row2 -= 1;
//			for (int i = 0; i < row2; i++) {
//				for (int s = 0; s < i + 2; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < row2*2 - i*2 - 1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println("=========짠!!=========");
//		}else {
//			System.out.println("잘못된 접근입니다. 홀수만 입력해주세요.");
//		}
		
//		if (row % 2 != 0) {
//		
//			for (int i = 0; i < row; i++) {
//				for (int s = 0; s < row - i; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < i*2 +1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			row -= 1;
//			for (int i = 0; i < row; i++) {
//				for (int s = 0; s < i + 2; s++) {
//					System.out.print(" ");
//				}
//				for (int j = 0; j < row*2 - i*2 - 1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//			System.out.println("=========짠!!=========");
//		}else {
//			System.out.println("잘못된 접근입니다. 홀수만 입력해주세요.");
//		}
		
		
//		3. 다이아몬드 달러
		
		System.out.print("몇 줄 그릴까요? ");
		int r = scan.nextInt();
		
		int sp = r/2;
		int st = 1;
		boolean flag = true;
		
		for (int i = 0; i < r; i++) {
		// 여백처리...
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			// 별 찍기...
			for (int j = 0; j < st; j++) {
				if (j == 0 || j == st -1) {
					System.out.print("*");
				}else {
					if (j%2==0) {
						System.out.print("$");
					}
						else {
							System.out.print(" ");
						}
					}
				}
			System.out.println();
		
			if (i == (r/2)) flag = false;	// 반전
			if(flag) {
				sp -= 1; st += 2;
			}else {
				sp += 1; st -=2;
			}
		}
		

		
//		for (int i = 1; i <= r; i++) {
//			for (int j = r; j > i; j--) {
//				System.out.print(" ");
//			}
//			
//			if (i == r) {
//				for (int j = 0; j < 2 * i - 1; j++) {
//					System.out.print("*");
//				}
//			}else {
//				for (int j = 0; j < 2 * i - 1; j++) {
//					if (j == 0 || j == 2 * i - 1 - 1) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			
//			if (i == (r/2)) flag = false;
//			if (flag == false) {
//				if (i == r) {
//					for (int j = 0; j < 2 * i - 1; j++) {
//						System.out.print("*");
//					}
//				}else {
//					for (int j = 0; j < 2 * i - 1; j++) {
//						if (j == 0 || j == 2 * i - 1 - 1) {
//							System.out.print("*");
//						} else {
//							System.out.print(" ");
//						}
//					}
//				}
//			}
//			System.out.println();
//		}
		
		scan.close();
		
	}

}