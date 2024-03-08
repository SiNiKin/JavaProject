package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_240308_AM {

	public static void main(String[] args) {
		// quiz-1
		// 1 ~ 101 미만의 임의의 정수를 생성하고, 그 숫자가 짝수인지 홀수인지 출력하세요. (3항 연산식을 사용)
		
		Random rand = new Random();
		int q1 = (int)(Math.random()*100) + 1;
		System.out.println("랜덤 수는 : " + q1);
		System.out.println("3항 연산의 결과 : " + (q1%2 == 0? "짝수" : "홀수"));
		
//		int d = rand.nextInt(100) +1;
//		int re = d%2;
//		
//		String answer = re > 0  ? "홀수입니다." : "짝수입니다.";
//		System.out.println(d);
//		System.out.println(answer);
//		System.out.println();
		
		// quiz-2
		// -5 ~ 5 사이의 임의의 정수를 생성하고, 삼항연산삭을 사용하여 절대값을 출력하세요.
		// 0 <= x <=10, y가 -5 <= y <= 5의 식을 구하세요... => 5-x = y
		
		int q2 = 5 - (int)(Math.random()*11);
		System.out.println("랜덤 수는 : " + q2);
		int abs = (q2 >=0 ? q2 : -q2);	// -q2 => q1 * -1
		System.out.println(q2 + "의 절대값은 : " + abs);
		
//		int f = rand.nextInt(11)-5;
//		System.out.println(f);
//		String result = f >= 0 ?  Integer.toString(f) : Integer.toString(f*-1);
//		System.out.println(result);
//		System.out.println();
		
		// quiz-3 
		// 정수를 입력받아 그 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요. (3항 연산식을 사용하세요)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int q3 = scan.nextInt();
		String result = q3%2 == 0 ? "짝수" : "홀수";
		System.out.println("입력받은 " + q3 + "는 : " + result);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 입력 >> ");
//		int num = scan.nextInt();
//		int numr = num%2;
//		String q3 = numr > 0 ? "홀수입니다." : "짝수입니다.";
//		System.out.println(q3);
//		System.out.println();
		
		//quiz-4
		// 키와 나이를 입력받아서 키는 140이상, 나이는 8상 이상인 경우만 놀이기구에 탑승 여부를 결정하는 프로그램을 작성하세요.
		// (조건 : 키 -140 이상, 나이는 8살 이상)
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.println("====================");
		if(height >= 140) {
			if(age >= 8) {
				System.out.println("탑승이 가능합니다!");
			}else {
				System.out.println("탑승이 불가능합니다...");
			}
		}else {
			System.out.println("탑승이 불가능합니다...");
		}
		
//		Scanner height = new Scanner(System.in);
//		System.out.print("키를 입력해주세요 >> ");
//		int h = height.nextInt();
//		Scanner age = new Scanner(System.in);
//		System.out.print("나이를 입력해주세요 >> ");
//		int a = age.nextInt();
//		
//		if( h >= 140 && a >= 8) {
//			System.out.println("탑승이 가능합니다!");
//		}else {
//			System.out.println("탑승이 불가능합니다...");
//		}
//		
//		System.out.println();
		

		// quiz-5
		// 정수 두개를 입력받아서 큰수를 출력. 같은 경우에는 같다고 출력하는 프로그램을 작성하세요.
		// **빼기로 다시 해보기**
		
		System.out.println("정수 두개를 입력하세요");
		System.out.print("> ");
		int q5_1 = scan.nextInt();
		System.out.print("> ");
		int q5_2 = scan.nextInt();
		
		if(q5_1 == q5_2) {
			System.out.println("같은 수입니다.");
		}else if(q5_1 > q5_2) {
			System.out.println(q5_1 + "이 큰 수입니다.");
		}else {
			System.out.println(q5_2 + "이 큰 수입니다.");
		}
		
//		Scanner q5_num1 = new Scanner(System.in);
//		System.out.print("정수를 입력해주세요 >> ");
//		int q5_num_1 = q5_num1.nextInt();
//		Scanner q5_num2 = new Scanner(System.in);
//		System.out.print("두번째 정수를 입력해주세요 >> ");
//		int q5_num_2 = q5_num2.nextInt();
//		
//		if(q5_num_1 == q5_num_2) {
//			System.out.println("같아요");
//		}else {
//			System.out.println("달라요");
//		}
//		
//		System.out.println();
		
		// quiz-6
		// 정수를 입력받아서 양의 정수인 경우에는 짝수, 홀수를 구분하고, 0이면 0입니다를 출력, 음수인 경우에는 음의 정수 입니다를 출력하는 프로그램을 작성하세요.
		
		System.out.println("정수를 입력하세요");
		System.out.print("> ");
		int q6 = scan.nextInt();
		if(q6 > 0) {		// 양의 정수
			if(q6%2 == 0) System.out.println(q6 + "은(는) 짝수입니다."); 
			else System.out.println(q6 + "은(는) 짝수입니다.");
		}else if(q6 ==0) {	// 0인 경우
			System.out.println("입력한 정수는 0입니다.");	
		}else {				// 음의 정수
			System.out.println(q6 + "은(는) 음의 정수입니다.");
		}
		
//		Scanner q6_num = new Scanner(System.in);
//		System.out.println("정수를 입력해주세요 >> ");
//		int q6 = q6_num.nextInt();
//		
//		if(q6 > 0) {
//			if(q6%2 == 0) {
//				System.out.println("짝수입니다.");
//			}else {
//				System.out.println("홀수입니다.");
//			}
//		}else if(q6 == 0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		// quiz-7
		// switch를 사용하여 수박, 사과, 멜론, 포도, 귤을 구매시 가격을 출력하는 프로그램을 작성하세요.
		
		System.out.println("구매한 메뉴는? ");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print(">> ");
		String fruit = scan.next();
		
		switch(fruit) {
		case "수박":
			System.out.println(fruit + "의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println(fruit + "의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println(fruit + "의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println(fruit + "의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println(fruit + "의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(fruit + "은(는) 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}
		
		scan.close();
		
//		Scanner q7 = new Scanner(System.in);
//		System.out.println("어떤 과일을 구매할까요? ");
//		String fru = q7.nextLine();
//		
//		switch(fru) {
//		case "수박":
//			
//		case "멜론":
//			System.out.println("1만원 입니다.");
//			break;
//		case "사과":
//			System.out.println("8천원 입니다.");
//			break;
//		case "포도":
//			System.out.println("5천원 입니다.");
//			break;
//		case "귤":
//			System.out.println("3천원 입니다.");
//			break;
//		default:
//			System.out.println("그런거 없습니다.");
//			break;
//		}
//		
//		scan.close();
		
	}

}
