package algorithm.programmers.lv1;

public class hidePhoneNumber {
	
	 public static String solution(String phone_number) {

	        String answer = "";

	        int n = phone_number.length();
	        for(int i=0; i<n-4; i++){
	            answer += "*";
	        }

	        answer += phone_number.charAt(n-4);
	        answer += phone_number.charAt(n-3);
	        answer += phone_number.charAt(n-2);
	        answer += phone_number.charAt(n-1);

	        return answer;
	    }
	 
	 public static void main(String[] args) {
		
		 
		 System.out.println( solution("01033334444") );
		 System.out.println( solution("027778888") );
		 
	}
	
	

}
