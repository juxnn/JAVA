package study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortTest01 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Park");
		nameList.add("Choi");
		nameList.add("Kim");
		
		System.out.println("- 정렬 전" + nameList);
		
		Collections.sort(nameList);
		
		System.out.println("- 정렬 후" + nameList);
		
		
		
		
	}
}
