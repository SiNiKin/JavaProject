package customermanager;

import java.util.Scanner;

public class customermanager {

	public static void main(String[] args) {
		// 이전에 만들어 놓은 고객 관리 프로그램을 OOP형식으로 변경하여 재 프로그래밍을 진행 !
		// 1. Customer 클래스를 생성하고,
		// 2. 관련 프로그램을 위에 생성한 Customer 클래스 기준으로 재작성하세요!
		
		// 이름, 성별, 이메일, 출생년도
		// 고객 수, 고객 정보 입력, 이전 고객, 다음 고객, 현재 데이터, 삭제, 나가기
		Customer cun = new Customer();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			// 고객 메뉴 ui(TEXT UI)
			System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", cun.count, cun.index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
			System.out.println("메뉴 입력 : ");
			String menu = scan.next();
			menu = menu.toLowerCase();		// 대소문자 구분 X
			// 메뉴 선택시 동작을 구현...
			switch(menu.charAt(0)) {
			case 'ㅑ':
			case 'i':
				System.out.println("고객 정보 입력을 시작합니다.");
				if (cun.count >= cun.MAX) {
					System.out.println("더 이상 저장할 수 없습니다.");
				}else {
					// 저장을 위한 메서드...
					cun.insertCustomerData();
					System.out.println("고객 정보 입력을 시작합니다.");
				}
				break;
			case 'ㅔ':
			case 'p':	// previous
				System.out.println("이전 데이터를 출력합니다.");
				if(cun.index <= 0) {	// 이전 데이터가 존재하지 않는 경우
					System.out.println("이전 데이터가 존재하지 않습니다.");
				}else {
					cun.index --;
					cun.printCustomerData(cun.index);
				}
				break;
			case 'ㅜ':
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(cun.index >= cun.count - 1) {
					System.out.println("다음 데이터가 존재하지 않습니다.");
				}else {
					cun.index ++;
					cun.printCustomerData(cun.index);
				}
				break;
			case 'ㅊ':
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if ((cun.index >= 0) && (cun.index < cun.count)) {
					cun.printCustomerData(cun.index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅕ':
			case 'u':
				System.out.println("현재 데이터를 업데이트 합니다.");
				if ((cun.index >= 0) && (cun.index < cun.count)) {
					cun.updateCustomerData(cun.index);
				}else {
					System.out.println("업데이트 할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅇ':
			case 'd':
				System.out.println("현재 데이터를 삭제합니다.");
				if ((cun.index >= 0) && (cun.index < cun.count)) {
					cun.deleteCustomerData(cun.index);
				}else {
					System.out.println("삭제할 데이터가 선택되지 않았습니다.");
				}
				break;
			case 'ㅂ':
			case 'q':	// 종료
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				System.exit(0); 	// 프로세스 종료
				break;
			default:
				System.out.println("메뉴를 잘 못 입력했습니다. 다시 선택해 주세요.");
			}
		}

	}

}

class Customer{
	static final int MAX = 100;
	
	String[] nameList = new String[MAX];		// 이름 저장
	String[] genderList = new String[MAX];	// 성별 저장
	String[] emailList = new String[MAX];	// 이메일 저장
	int[] birthYearList = new int[MAX];	
	
	int index = -1;
	int count = 0;
	
	Scanner scan = new Scanner(System.in);
	
	
	// 고객 정보 입력
	void insertCustomerData() {
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("성별 : ");
		String gender = scan.next();
		System.out.println("이메일 : ");
		String email = scan.next();
		System.out.println("출생년도 : ");
		int birthYear = scan.nextInt();
		
		//고객 객체들 배열에 저장
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++;		
	}
	
	// 고객 정보 출력
	void printCustomerData(int index) {
		System.out.println("=============CUSTOMER INFO================");
		System.out.println("이름 : " + nameList[index]);
		System.out.println("성별 : " + genderList[index]);
		System.out.println("이메일 : " + emailList[index]);
		System.out.println("출생년도 : " + birthYearList[index]);
		System.out.println("==========================================");
	}
	
	// 고객 정보 업데이트
	void updateCustomerData(int index) {
		System.out.println("-----------UPDATE CUSTOMER INFO--------------");
		System.out.print("이름" + "(" + nameList[index] + ") :");
		String name = scan.next();
		if(name.length() != 0) {	// 검증...
			nameList[index] = name;
		}
		System.out.print("성별(" + genderList[index] + ") :");
		genderList[index] = scan.next();
		System.out.print("이메일(" + emailList[index] + ") :");
		emailList[index] = scan.next();
		System.out.print("출생년도(" + birthYearList[index] + ") :");
		birthYearList[index] = scan.nextInt();
	}
	
	// 고객 정보 삭제
	void deleteCustomerData(int index) {
		for (int i = index; i < count - 1; i++) {
			nameList[i] = nameList[i + 1];
			genderList[i] = genderList[i + 1];
			emailList[i] = emailList[i + 1];
			birthYearList[i] = birthYearList[i + 1];
		}
		count --;
	}
	
	
	
}
