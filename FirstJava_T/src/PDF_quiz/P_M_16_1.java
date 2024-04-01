package PDF_quiz;

import java.util.Scanner;

public class P_M_16_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] foodArr = new String[100];
		
		System.out.println("# 먹고싶은 음식을 입력하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		
		int i = 0;
		while (true) {
			System.out.print("> ");
			String food = scan.next();
			
			// 입력 받은 값 인덱스 배열 저장...
			foodArr[i] = food;
			
			if(food.equals("그만")) {
				System.out.println("입력 종료!!");
				System.out.print("내가 먹고싶은 음식들 : [ ");
				
				// 배열 출력 반복문...
				for (int k = 0; k < i; k++) {
					System.out.print(foodArr[k] + " ");
				}
				
				System.out.print("]");
				
				break;		// 무한루프 탈출...
			}
			
			i++;			
		}
		scan.close();

	}

}
