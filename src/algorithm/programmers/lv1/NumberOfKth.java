package algorithm.programmers.lv1;

import java.util.Arrays;

public class NumberOfKth {

	
	  public static int[] solution(int[] array, int[][] commands) {
	        
	        int len = commands.length;
	        int[] cuttingArray = new int[len];
	        int[] answer = new int[len];
	        
	        for(int i=0; i<len; i++) {  
	        	
		        //commands[0][0] 값 부터 commands[n][1] 값 까지 array를 자른다.
	        	//자른 배열에서 commands[n][2] 값을 꺼내서 저장한다.
	        	
	        	int startPoint = commands[i][0]-1;
	        	int endPoint = commands[i][1];
	        	int selectPoint = commands[i][2]-1;
	        	
	        	cuttingArray = Arrays.copyOfRange(array, startPoint, endPoint);
	        	Arrays.sort(cuttingArray);
	        	answer[i] = cuttingArray[selectPoint];
	        }

	        return answer;
	    }
	  
	  public static void main(String[] args) {
		
		  //2차원 배열 length test
		  int[][] test1 = new int[1][3];
		  System.out.println("test1 length: " + test1.length);
		  
		  int[][] test2 = new int[2][3];
		  System.out.println("test2 length: " + test2.length);
		  
		  int[][] test3 = new int[3][3];
		  System.out.println("test3 length: " + test3.length);
		  
		  System.out.println("*****************************************");
		  
		  //Programmers 테스트
		  int[] testArray = {1, 5, 2, 6, 3, 7, 4};
		  int[][] testCommands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		  
		  //commands는 2,5,3 이다.
		  int[] testCopy = Arrays.copyOfRange(testArray, 1, 5);
		  Arrays.sort(testCopy);
		  System.out.println(Arrays.toString(testCopy));
		  
		  System.out.println("*****************************************");
		  System.out.println("아래는 프로그래머스 예제 test 입니다.");
		  System.out.println( Arrays.toString(solution(testArray, testCommands)) );
		  
		  
	}
}
