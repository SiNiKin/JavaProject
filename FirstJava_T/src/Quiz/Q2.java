package Quiz;

public class Q2 {

	public static void main(String[] args) {
		
		String banner = "==========출력결과==========";
		String name = "홍길동"; 
		int age = 20;
		String num = "010-1234-1234";
		float height = 178.5f;
		double weight = 75;
//		char blood = 'O';
		String blood = "O";
		
//		System.out.printf("%s", banner);
		System.out.println(banner);
		System.out.println();
		System.out.printf("이름\t: %s", name);
		System.out.println();
		System.out.printf("나이\t: %d", age);
		System.out.println();
		System.out.printf("Tel\t: %s", num);
		System.out.println();
		System.out.printf("키\t: %.1f", height);
		System.out.println();
		System.out.printf("몸무게\t: %.0f", weight);
		System.out.println();
		System.out.printf("혈액형\t: %s", blood);
		

	}

}
