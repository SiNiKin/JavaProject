package PDF_quiz;

public class P_11_1 {

	static class ArrayPrint{
		void printArray(String[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		void printArray(int[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
		void printArray(char[] arr) {
			for(int i =0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ArrayPrint ap = new ArrayPrint();
		
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1, 2, 3, 4, 5};
		char[] cArr = {'가','나'};

		ap.printArray(sArr);
		ap.printArray(iArr);
		ap.printArray(cArr);
	}


}
