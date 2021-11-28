package algorithm.programmers.lv1;

public class LostClothes {

	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        //전체 학생 수 n명
        //lost.length = 잃어버린 학생의 수
        
        //lost와 reserve의 값이 같은경우 둘 다 빼준다.
          
        //체육수업을 들을 수 있는 학생의 수
        //answer = n - finalLost.length;
        
        for(int i=0; i<reserve.length; i++) {
        	
        	for(int j=0; j<lost.length; j++) {
        		if(lost[j]==reserve[i]-1 || lost[j]==reserve[i] ||lost[j]==reserve[i]+1 ) {    			
        			answer++;
        			lost[j] = -100;
        			reserve[i] = -10;
        			
        			//한번 빌려준애들을 카운트하지 못하게 조건식을 달아줘야하는데 어렵다.
        			//일단 애매하게 이렇게 해당 값을 바꿔보아서 테스트해야겠다.
        		}
        	}
        }

        return answer;
    }
	
	public static int solution2(int n, int[] lost, int[] reserve) {
		int[] students = new int[n];
		for(int i=0; i<n; i++) {
			
		}
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
	
		int testN1 = 5;
		int[] testLost1 = {2,4};
		int[] testReserve1 = {1,3,5};
		System.out.println(solution(testN1, testLost1, testReserve1) );
		
		int testN2 = 5;
		int[] testLost2 = {2,4};
		int[] testReserve2 = {3};
		System.out.println(solution(testN2, testLost2, testReserve2) );
		
		int testN3 = 3;
		int[] testLost3 = {3};
		int[] testReserve3 = {1};
		System.out.println(solution(testN3, testLost3, testReserve3) );
		
	}
}
