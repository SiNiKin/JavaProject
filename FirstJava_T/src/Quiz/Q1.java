package Quiz;

public class Q1 {

	public static void main(String[] args) {
		// Q1
		System.err.println("===============================");
		System.out.println("             /)/)              ");
		System.out.println("            (  ..)             ");
		System.out.println("            (   >♡             ");
		System.out.println("       Have a Good Time.       ");
		System.err.println("===============================");
		
		// Q2
//		System.out.println("       #### 회비 정보 ####       ");
//		System.out.println("=========================================");
//		System.out.println("이름	나이	 전화번호		회비");
//		System.out.println("=========================================");
//		System.out.println("홍길동 	\"15\"	 010-123-1234   ￦20,000");
//		System.out.println("임꺽정 	\"20\"	 010-234-2345   ￦30,000");
//		System.out.println("김말이 	\"28\"	 010-345-3456   ￦50,000");
//		System.out.println("------------------------------------------");
//		System.out.println("총합계			        ￦100,000");
//		System.out.println("==========================================");
		
		System.out.println("       #### 회비 정보 ####       ");
		System.out.println("=================================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("=================================================");
		System.out.println("홍길동\t\"15\"\t010-123-1234\t￦20,000");
		System.out.println("임꺽정\t\"20\"\t010-234-2345\t￦30,000");
		System.out.println("김말이\t\"28\"\t010-345-3456\t￦50,000");
		System.out.println("-------------------------------------------------");
		System.out.println("총합계\t\t\t\t￦100,000");
		System.out.println("=================================================");
		
		//Q3 놀이공원까지 11개 지하철 역을 지남. 출발역에서 도착역까지 37분 소요. 한개의 역을 지나는데 걸리는 시간은?	
		//(출력은 소수점 2자리까지...)
//		int a = 11;
//		int b = 37;
//		System.out.printf("%.2f", (float)b/a);
		double stat = 11;
		int min = 37;
		double result = (int)((min/stat)*100)/100.0;
		System.out.println("한 역을 지나는데 걸린 시간은 " + result + "분이 소요되었다.");

	}

}
