import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class D04_InnerLocalEx {
	
	private Frame f;
	
	public D04_InnerLocalEx() {
		f = new Frame("inner Loncal 테스트...");
	}
	
	public void launchFrame() {
		int a = 10;
		//Local inner 클래스
		class MyWindowAdapter extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("launch 내 지역변수 a : " + a);
				System.out.println("X버튼을 클릭했어요...");
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(640, 480);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		D04_InnerLocalEx di = new D04_InnerLocalEx();
		di.launchFrame();
	}

}
