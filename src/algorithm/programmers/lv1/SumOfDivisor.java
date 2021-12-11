package algorithm.programmers.lv1;

public class SumOfDivisor {

	 public static int solution(int n) {
		 int answer = 0;
	        for(int i=1; i<=n; i++){
	        	if(n%i == 0) answer += i;
	        	}
	        return answer;
	 }
	 
	 public static int solution2(int n) {
		 int answer = 0;
		
		 for(int i=1; i<=n/2; i++) {
			 if(n%i==0) {
				 answer += i + n/i;
			 }
		 }
		 return answer;
	 }
	
	public static void main(String[] args) {
		System.out.println( solution(12) );
		System.out.println( solution(5) );
		
		System.out.println( solution2(12) );
		System.out.println( solution2(5) );
	}
}
