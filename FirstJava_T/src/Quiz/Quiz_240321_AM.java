package Quiz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Quiz_240321_AM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr1 = {"leo","kiki","eden"};
		String[] arr2 = {"kiki","eden"};
		
		List participant = Arrays.asList(arr1);
		List completion = Arrays.asList(arr2);
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("kiki", "complete");
		map.put("eden", "complete");
		
		System.out.println(participant.get(1) + "의 마라톤 결과 : " + map.getOrDefault("kiki", 1000));
		System.out.println("" + map.getOrDefault("eden", 1000));
		System.out.println("" + map.getOrDefault("leo", "fail"));
		
		

	}

}
