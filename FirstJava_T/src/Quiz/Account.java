package Quiz;

public class Account {
	String name;	// 이름
	int pw;			// 비밀번호
	int money;		// 잔액
	String num;		// 계좌번호
	double plus;	// 이자
	
	
	public Account() {
		name = "김신이";
		pw = 0000;
		money = 500000;
		num = "123456-7891";
		plus = 1.9;
	}
	
	public Account(String name1, int pw1, int money1, String num1) {
		name = name1;
		pw = pw1;
		money = money1;
		num = num1;
	}
	
	// 메서드
	// 예금하다
	public void saveMoney(int amount) {
		money = money + amount;		// money += amount;
	}
	
	// 출금하다
	public void withdrawMoney(int amount) {
		money -= amount;
	}
	
	// 잔액 확인
	public int getMoney() {
		return money;
	}

}
