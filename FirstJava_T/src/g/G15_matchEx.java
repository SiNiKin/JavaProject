package g;
import java.util.Arrays;
import java.util.List;

public class G15_matchEx {

	/*
	 * 	스트림 내부에 요소들이 특정 조건을 만족했는지 검사할 수 있는 메서드
	 * 	allMatch(Predicate p)	- 요소들이 모두 p조건을 만족하면 true, 그렇지 않으면 false
	 * 	anyMatch(Predicate p)	- 요소들 중 하나라도 p조건을 만족하면 true, 그렇지 않으면 false
	 * 	noneMatch(Predicate p)	- 요소들이 모두 p조건을 만족하지 않으면 true, 아니면 flase
	 */
	
	
	public static void main(String[] args) {
		
		Shape1 s1 = new Rectangle1(10, 3);
		Shape1 s2 = new Circle1(10);
		Shape1 s3 = new Rectangle1(20, 2);
		Shape1 s4 = new Circle1(11);
		
		List<Shape1> list = Arrays.asList(s1, s2, s3, s4);
		
		// 모든 요소들이 Shape의 인스턴스인지 조건 비교...
		boolean result = list.stream().allMatch(a -> (a instanceof Shape1));
		System.out.println("모든 요소는 Shap1의 객체이다. -> " + result);
		
		// 요소들 중 하나 이상이 Rectangle 객체인지 조건 비교
		boolean result2 = list.stream().anyMatch(a -> (a instanceof Rectangle1));
		System.out.println("요소 중 Rectangle의 객체가 존재한다 -> " + result2);
		
		// 모든 요소가 Circle의 객체인지 조건에 해당하지 않는지 비교
		boolean result3 = list.stream().noneMatch(a -> (a instanceof Circle1));
		System.out.println("모든 요소중 Circle의 객체가 존재하지 않는다 -> " + result3);

	}

}
