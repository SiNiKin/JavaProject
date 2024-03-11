package Quiz;

public class Quiz_While {

	public static void main(String[] args) {
		// while문을 이용하여
		// 구구단을 다음과 같이 세로로 출력해 주세요
		
//		int x = 2;
//		int y = 0;
//		while (x < 10) {
//			System.out.println(x + "단");
//			while (y < 9) {
//				y ++;
//				System.out.println(x + "x" + y + "=" + x*y);
//			}
//			x ++;
//			y = 0;
//			
//		}

		int gop = 0;
		while (gop <= 9) {
			
			int dan = 2;	// ** 반복시 원래의 2로 돌아와야 합니다.
			
			while (dan <= 9) {
				
				if (gop == 0) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t",dan,gop,dan*gop);
				}
				
				dan ++;
			}
			System.out.println("");
			
			gop ++;
		}
		
	}

}
