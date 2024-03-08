package Quiz;

public class Quiz_240308_PM {

	public static void main(String[] args) {
		
		//quiz-1
		// - 100부터 1까지 순서대로 출력해보세요.
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		//quiz-2
		// - 1 ~ 200 사이의 수 중에서 2 또는 3의 배수가 아닌 수들의 총 합을 구해보세요.
		
//		or연산자
		int sum = 0;
		for (int n = 1; n <= 200; n++) {
			if(!(n%2 == 0 || n%3 == 0)) {
				sum += n;
			}
		}
		System.out.println(sum);
		
//		and연산자
//		int sum = 0;
//		for (int n = 1; n <= 200; n++) {
//			if(n%2 != 0 && n%3 != 0) {
//				sum += n;
//			}
//		}
//		System.out.println(sum);
		
		//quiz-3
		// - 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) + .... + (1+2+3+4+5+6+7+8+9+10)
		//	 의 결과를 구해보세요.
		
//		반복문 두개 사용
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i!=1) {
				System.out.print("+(");
			}
			for (int j = 1; j <= i; j++) {
				sum += j;
				System.out.print(j);
				if(j != i) {
					System.out.print("+");
				}
			}
			if (i != 1) {
				System.out.print(")");
			}
		}
		System.out.println("\n반복문 두개를 사용하여 풀어 본 결과 : " + sum);
		
//		반복문 하나 사용
		sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			sum2 += sum;
		}
		System.out.println("반복문 한개를 사용하여 풀어 본 결과 : " + sum2);
		
//		int result = 0;
//		for (int b = 1; b < 11; b++) {
//			for (int c = 0; c < b; c++) {
//				result += c;
//			}
//			result += b;
//		}
//		System.out.println(result);
		
	}

}
