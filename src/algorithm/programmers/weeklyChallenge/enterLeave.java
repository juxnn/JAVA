package algorithm.programmers.weeklyChallenge;

import java.util.Arrays;

public class enterLeave {

	public static void main(String[] args) {
		
		int[] enter = {1, 4, 2, 3};
		int[] leave = {2, 1, 3, 4};
		int[] answer = new int[4];
		int count=0;
		int enterNum = 0;
		int leaveNum = 0;
		int size = enter.length;
		

		//먼저 들어왔는데, 나중에 나간 경우
		for(int i=0; i<size; i++) {
			
			enterNum = i;
			int x = enter[i];
			for(int j=0; j<size; j++) {
				if(x == leave[j]) {
					leaveNum = j;
				}
			}
			//x의 입실 퇴실 순서를 검색했다.
			//enterNum, leaveNum
			
			//x 보다 먼저 들어온 애들이 나중에 나간 경우
			for(int k=0; k<i; k++) {
				
				for(int l=0; l<size; l++) {
					//enter[k]의 퇴실순서는 j
					if(enter[k] == leave[l]) {
						if(leaveNum > l) {
							count++;
						}
					}
				}
			}
			
			answer[i] = count;
			System.out.println(answer[i]);
		}
	
	}
}
