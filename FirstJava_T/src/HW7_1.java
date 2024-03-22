import java.util.Arrays;

public class HW7_1 {
	
	static class ArrayPrint{
		
		String sArr[];
		int iArr[];
		char cArr[];
		
//		public ArrayPrint(String sArr[], int iArr[], char cArr[]) {
//			this.sArr = sArr;
//			this.iArr = iArr;
//			this.cArr = cArr;
//		}
		
		void printArray(){
			for(int i = 0; i < sArr.length; i++) {
				System.out.print(sArr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayPrint ap = new ArrayPrint();
		
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1,2,3,4,5};
		char[] cArr = {'가','나'};
		
		
	}

}
