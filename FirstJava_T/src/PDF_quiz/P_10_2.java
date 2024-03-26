package PDF_quiz;

public class P_10_2 {
	
	static class Player{
		String name;
		int hp;
		int mp;
		
		void info() {
			System.out.println("캐릭명 : " + name);
			System.out.println("체력 : " + hp);
			System.out.println("마나 : " + mp);
		}
		
	}
	
	static class Warrior extends Player {
		Warrior(String name){
			this.name = name;
			this.hp = 1000;
			this.mp = 500;
		}
		
		void bash(Warrior p) {
			if (mp <= 100) {
				System.out.println("마나가 부족합니다.");
				System.exit(0);
			}else {
				System.out.println(p.name + "님 배쉬 스킬 적중");
				p.hp -= 150;
				mp -= 100;
			}
		}
		
		void bash(Wizard p) {
			if (mp <= 100) {
				System.out.println("마나가 부족합니다.");
				System.exit(0);
			}else {
				System.out.println(p.name + "님 배쉬 스킬 적중");
				p.hp -= 200;
				mp -= 100;
			}
		}
	}
	
	static class Wizard extends Player {
		Wizard(String name){
			this.name = name;
			this.hp = 500;
			this.mp = 1000;
		}
		
		
		void Blizzard(Player[] players) {
			System.out.println("---------------------");
			System.out.println(name + "님의 눈보라 시전 !");
			
			for(Player a : players) {
				int i = (int)(Math.random()*5)+11;
				a.hp -= i;
				System.out.println(a.name + "님이 " + i + "피해를 입었습니다.");
			}
		}
	}

	public static void main(String[] args) {
		
		Warrior me = new Warrior("나의 캐릭터");
		Wizard play2 = new Wizard("구르미");
		Warrior play3 = new Warrior("강한친구");
		
		Player[] players = new Player[2];
		players[0] = new Warrior("나의 캐릭터");
		players[1] = new Warrior("강한친구");
		
//		System.out.println("---나의 캐릭 배쉬스킬 사용---");
		play2.Blizzard(players);
		play2.Blizzard(players);
		play2.Blizzard(players);
		play2.Blizzard(players);
		
//		play2.info();
//		play3.info();
	}

}
