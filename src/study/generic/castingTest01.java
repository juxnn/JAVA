package study.generic;

import java.util.ArrayList;
import java.util.List;

public class castingTest01 {

	
	public static void main(String[] args) {
		
		//casting이 필요한 경우
		List list01 = new ArrayList();
		list01.add("hello");
		
		//String str01 = list01.get(0); (에러)
		String str01 = (String)list01.get(0);
		
		System.out.println(list01.get(0).getClass().getName());
		System.out.println(str01);
		
		//casting이 필요 없는 경우
		List<String> list02 = new ArrayList<String>();
		list02.add("hello");
		String str02 = list02.get(0);
		
		System.out.println(list02.get(0).getClass().getName());
		System.out.println(str02);
		
	}
	
	
	
	
}
