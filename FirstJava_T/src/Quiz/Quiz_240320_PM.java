package Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Quiz_240320_PM {

	public static void main(String[] args) {
//		   [[[1. 집합 문제.... ]]] 
//	                다음의 리스트를 생성한 요구한 내용을 작성하세요
//	    ArrayList1 : [1,2,3,4,5,6]
//	    ArrayList2 : [4,5,6,7,8,9]
//
//	    두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요. 
//	    합집합 : [1,2,3,4,5,6,7,8,9]
//	    교집합 : [4,5,6]
//	    차집합 : [1,2,3],[7,8,9]
		
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		System.out.println("ArrayList1 : " + list1);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		System.out.println("ArrayList2 : " + list2);
		
		List hop = new ArrayList();
		List and = new ArrayList();
		List mi_a = new ArrayList();
		List mi_b = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			boolean a = list1.contains(i);
			boolean b = list2.contains(i);
			if (a == true && b == true) {
				and.add(i);
				hop.add(i);
			}else if (a == true || b == true) {
				hop.add(i);
			}
			if (a == true && b == false) {
				mi_a.add(i);
			}else if (a == false && b == true) {
				mi_b.add(i);
			}
		}
		
		System.out.println("합집합 : " + hop);
		System.out.println("교집합 : " + and);
		System.out.println("차집합 : " + mi_a + " , " + mi_b);
		
		System.out.println();
		
//
//	   [[[2. 로또 번호 생성하기]]]
//	    TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
//	     1. TreeSet을 생성하세요
//	     2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
//	     3. 발생한 난수를 추가합니다. 
//	     4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		TreeSet<String> ts2 = new TreeSet<String>();
		
		ts2.add("1번 숫자");
		ts2.add("2번 숫자");
		ts2.add("3번 숫자");
		ts2.add("4번 숫자");
		ts2.add("5번 숫자");
		ts2.add("6번 숫자");
		
		for (String i : ts2) {
			System.out.print(i + "\t\t");
		}
		
		System.out.println();
		
		for (int j = 0; j <= ts2.size(); j++) {
			int lotto = (int)(Math.random()*45)+1;
			ts1.add(lotto);
		}
		
		for (Integer i : ts1) {
			System.out.print(i + "\t\t");
		}
		
//		System.out.println(ts1);
		
//		for (int i = 0; i < 6; i++) {
//			int lotto = (int)(Math.random()*45)+1;
//			ts1.add(lotto);
//		}
//		System.out.println(ts1);
		
	}

}
