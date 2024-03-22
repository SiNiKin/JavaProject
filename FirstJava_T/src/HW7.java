
public class HW7 {
	
	static class Calculator {
		int result;
		
		int add(int i) {
			result += i;
			return result;
		}
		
		int add(int i, int j) {
			result += i + j;
			return result;
		}
		
		int add(int i, int j, int k) {
			result += i + j + k;
			return result;
		}
		
		int add(int i, int j, int k, int h) {
			result += i + j + k + h;
			return result;
		}
		
		
	}

	public static void main(String[] args) {
		Calculator a = new Calculator();
		a.add(1);
		System.out.println("누적값 : " + a.result);
		a.add(2,3);
		System.out.println("누적값 : " + a.result);
		a.add(1,2,3);
		System.out.println("누적값 : " + a.result);
		a.add(1,2,3,4);
		System.out.println("누적값 : " + a.result);
	}

}
