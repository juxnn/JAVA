package algorithm.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionDeveolopment {
	
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        
	        int len = progresses.length;
	        int[] day = new int[len];	//배포되는 날짜

			for(int i=0; i<len; i++) {
				int j=1;
				while(progresses[i] + (speeds[i]*j) < 100) { j++; }
				day[i]=j;
	        }
	        
	        ArrayList<Integer> list = new ArrayList<>();
			
			for(int k=0; k<len; k++) {
				
				int origin = day[k];
				int count = 1;
				if(origin<0) {
					continue;
				}
	            
				for(int l = k+1; l<len; l++) {
					int compare = day[l];
					if(origin>=compare) {
						day[l]= -1;
						count++;
					}else {
						break;
					}
				}
				list.add(count);
	        }   
	        answer = list.stream().mapToInt(i->i).toArray();
	        return answer;
	    }
	}

	public static void main(String[] args) {
		
		
		int[] p = {93, 90, 55};
		int[] s = {1, 30, 5};
		
		int len = p.length;
		int[] day = new int[len];	//배포되는 날짜

		for(int i=0; i<len; i++) {
			
			int j=1;
			
			while(p[i] + (s[i]*j) < 100) { j++; }
			
			day[i]=j;
		}
	
		System.out.println(Arrays.toString(day));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int k=0; k<len; k++) {
			
			int origin = day[k];
			int count = 1;
			if(origin<0) {
				continue;
			}
			for(int l = k+1; l<len; l++) {
				int compare = day[l];
				if(origin>=compare) {
					day[l]= -1;
					count++;
				}else {
					break;
				}
			}
			list.add(count);

		}
		System.out.println(list);

	}
}
