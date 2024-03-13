package Quiz;

public class Monitor {
	
	static final int MAX = 100;
	
	// 멤버 변수 - 속성
	int resolution;
	int size;
	int brightness;
	boolean status;
	
	// 생성자 constructors
	public Monitor() {
		this.resolution = MAX;
		this.size = MAX;
		this.brightness = MAX;
		this.status = false;
	}
	
	// 전원 메서드
	public void pressPowerButton() {
		status = !status;
	}
	
	
	
//	String h;
//	int s;
//	int l;
//	boolean b;
	
//	public Monitor() {
//		h = "800 * 600";
//		s = 24;
//		l = 100;
//		b = false;
//	}
//	
//	public Monitor (int l1, boolean b1) {
//		l = l1;
//		b = b1;
//	}
//	
//	
//	// 밝기 설정
//	public void l_setting (int l_s) {
//		l = l_s;
//	}
	
	// 전원 설정
//	public void button (String b) {
//		switch (b.charAt(0)) {
//		case 'o':
//		case 'O':
//			
//			
//		}
//	}
}
