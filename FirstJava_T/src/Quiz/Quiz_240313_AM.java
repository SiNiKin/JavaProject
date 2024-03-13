package Quiz;

import java.util.Scanner;

public class Quiz_240313_AM {
	
	public static void main(String[] args) {
		Account acc1 = new Account();
		
		System.out.println("잔액 확인 : " + acc1.getMoney());
		// 입금 : 10000원
		acc1.saveMoney(10000);
		System.out.println("입금 후 잔액 확인 : " + acc1.getMoney());
		// 출금 : 100000원
		acc1.withdrawMoney(100000);
		System.out.println("출금 후 잔액 확인 : " + acc1.getMoney());
	
	}
	
}
