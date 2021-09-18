package algorithm.programmers.lv1;

public class numberStringAndEnglish {

	
	public static void main(String[] args) {
	
		System.out.println( solution("one4seveneight") );
		System.out.println( solution("23four5six7") );
		System.out.println( solution("2three45sixseven") );
		System.out.println( solution("123") );
		
	}

	  public static int solution(String s) {

		  /*
	        s = s.replace("zero", "0");
	        s = s.replace("one", "1");
	        s = s.replace("two", "2");
	        s = s.replace("three", "3");
	        s = s.replace("four", "4");
	        s = s.replace("five", "5");
	        s = s.replace("six", "6");
	        s = s.replace("seven", "7");
	        s = s.replace("eight", "8");
	        s = s.replace("nine", "9");  
		  */
	        s = s.replace("zero", "0")
	        		.replace("one", "1")
	        		.replace("two", "2")
	        		.replace("three", "3")
	        		.replace("four", "4")
	        		.replace("five", "5")
	        		.replace("six", "6")
	        		.replace("seven", "7")
	        		.replace("eight", "8")
	        		.replace("nine", "9");
	        
	        return Integer.parseInt(s);
	    }
}
