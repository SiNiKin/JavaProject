package Quiz;

public class Quiz_star2_240311 {

	public static void main(String[] args) {
		// 피라미드 찍기
		
		int dan = 5;
		
		System.out.println("1) ");
		for (int i = 0; i < dan; i++) {
			// space를 찍기...
			for (int j = 0; j < dan - i - 1; j++) {
				System.out.print(" ");
			}
			// 별찍기...
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println(); 	// 줄바꿈
		}
		System.out.println();
		
		
		System.out.println("2) ");
		for (int i = 0; i < dan; i++) {
			// space를 찍기...
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별찍기...
			for (int j = 0; j < 2*dan - (2*i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println(); 	// 줄바꿈
		}
		System.out.println();

	}

}
