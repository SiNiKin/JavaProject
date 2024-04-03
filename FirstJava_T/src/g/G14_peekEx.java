package g;
import java.util.Arrays;
import java.util.List;

public class G14_peekEx {

	/*
	 * 	요소 전체를 반복하는 반복자는 forEach()와 peek()이 있다.
	 * 	forEach()는 최종 단계에서 반복하는 반복자아고, peek() 중간 처리 반복자라고 합니다.
	 * 	peek()메서드는 중간 단계에서 전체 요소를 반복하면서 추가 작업을 하기 위해서 사용함.
	 */
	
	public static void main(String[] args) {
		
		Shape1 s1 = new Rectangle1(10, 3);
		Shape1 s2 = new Circle1(10);
		Shape1 s3 = new Rectangle1(20, 2);
		Shape1 s4 = new Circle1(11);
		
		List<Shape1> list = Arrays.asList(s1, s2, s3, s4);
		
		list.parallelStream().mapToDouble(a -> a.area()).peek(a -> System.out.println(a)).sum();
		// peek()은 중간 반복자이기 때문에 최종처리 메서드가 있어야만 동작이 됩니다.

	}

}


abstract class Shape1 implements Comparable<Shape1> {
	// 필드
	int x, y;
	
	// 생성자
	Shape1(){
		
	}
	
	Shape1(int x, int y){
		this.x = x;
		this.y= y;
	}
	
	// 추상메서드
	abstract double area();
	abstract double length();
	
	// 일반메서드
	public String getLocation(Shape1 o) {
		return "x: " + x + ", y: " + y;
	}
	
	@Override
	public int compareTo(Shape1 o) {
		return (int)(this.area() - o.area());
	}
}


class Rectangle1 extends Shape1 {
	
	// 필드
	int w, h;
	
	// 생성자
	public Rectangle1() {
		this(1,1);
	}
	
	public Rectangle1(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	double area() {
		return w*h;
	}
	
	@Override
	double length() {
		return (w+h) * 2;
	}
	
	@Override
	public String toString() {
		return "넓이 : " + this.area();
	}
}


class Circle1 extends Shape1 {
	
	// 필드
	double r;
	
	// 생성자
	public  Circle1() {
		this(1);
	}
	
	public  Circle1(double r) {
		this.r = r;
	}

	@Override
	double area() {
		return (r * r) * Math.PI;
	}
	
	@Override
	double length() {
		return (r * 2) * Math.PI;
	}
	
	@Override
	public String toString() {
		return "넓이 : " + this.area();
	}
}