package algorithm.programmers.lv1;

import java.util.ArrayList;

public class Phoneketmon {

	public static int solution(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int mon : nums) {
        	if(!list.contains(mon))
        		list.add(mon);
        }
        
        return (nums.length/2 < list.size()) ? nums.length/2 : list.size();
    }
	
	public static void main(String[] args) {
		int[] test1 = {3,1,2,3};
		int[] test2 = {3,3,3,2,2,4};
		int[] test3 = {3,3,3,2,2,2};
		
		System.out.println( solution(test1) );
		System.out.println( solution(test2) );
		System.out.println( solution(test3) );
	}
}
