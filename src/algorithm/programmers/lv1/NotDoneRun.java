package algorithm.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotDoneRun {

	 public static String solution(String[] participant, String[] completion) {
	       
		 for(String person: participant) {
			 
			 if(!completion.equals(person))
				 return person;
		 }
	        
	        return "";
	 }
	
	 //유효성 검사에서 문제가 생긴다.
	 public static String solution2(String[] participant, String[] completion) {
	       
	        List<String> pList = new ArrayList<>(Arrays.asList(participant));
	        List<String> cList = new ArrayList<>(Arrays.asList(completion));
	        
	        for(String person : cList) {
	        	pList.remove(person);
	        }
	        
	        return pList.get(0);
	 }
	 
	 
	 
	 public static void main(String[] args) {
		
		 String[] pt1 = {"leo", "kiki", "eden"};
		 String[] ct1 = {"eden", "kiki"};
		 
		 
		 System.out.println( solution(pt1, ct1) );
		 
	}
}
