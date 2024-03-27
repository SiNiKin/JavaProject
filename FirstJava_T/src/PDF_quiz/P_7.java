package PDF_quiz;

public class P_7 {
	
	static class Calculator{
		int result = 0;
		
		void add(int ... i) {
			for(int a : i) {
				result += a;
			}
		}
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println(cal.result);
		cal.add(1,2,3);
		System.out.println(cal.result);
		cal.add(1,5);
		System.out.println(cal.result);
		cal.add(5,5,5,5);
		System.out.println(cal.result);

	}

}
