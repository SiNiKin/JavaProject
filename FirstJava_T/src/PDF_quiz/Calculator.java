package PDF_quiz;

public class Calculator {
	
	static double pi = Math.PI;
	
	int result;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	int add(int a, int b) {
		result += a + b;
		return result;
	}
	
	int add(int a, int b, int c) {
		result += a + b + c;
		return result;
	}
	
	int add(int a, int b, int c, int d) {
		result += a + b + c + d;
		return result;
	}
	
	static double Circle(int r) {
		return (2 * r) * pi;
	}

	public static void main(String[] args) {
		
		System.out.printf("원주율 : %.2f\n",pi);
		
		System.out.printf("원의 둘레 : %.2f",Circle(10));
	}

}
