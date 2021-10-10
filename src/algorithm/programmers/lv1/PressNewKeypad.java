package algorithm.programmers.lv1;


public class PressNewKeypad {

	public static class Solution{
		public static String solution(int[] numbers, String hand) {
			
			int positionL = 10;													//왼손의 시작점 *은 10으로 설정
			int positionR = 12;													//오른손의 시작점 #은 12로 설정
			String answer = "";
			
			for(int i =0; i<numbers.length; i++) {
				if(numbers[i] == 0) {											//계산을 위해 0을 11로 설정한다.
					numbers[i] = 11;
				}
				if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {		//1,4,7은 왼손이 누른다.
					positionL = numbers[i];
					answer += "L";
				}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {	//3,6,9는 오른손이 누른다.
					positionR = numbers[i];
					answer += "R";
				}else if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 11) {	// 2,5,8,0을 입력해야 할 때
				
					int distanceL = calculateDistance(numbers[i], positionL);	//해당 포인트와 왼손의 거리를 계산한다.
					int distanceR = calculateDistance(numbers[i], positionR);	//해당 포인트와 오른손의 거리를 계산한다.
					
					if(distanceL > distanceR) {									//오른쪽 손이 더 가까우면
						positionR = numbers[i];									//오른손의 위치가 포인트로
						answer += "R";
					}else if(distanceL < distanceR) {							//왼쪽 손이 더 가까우면
						positionL = numbers[i];									//왼손의 위치가 포인트로
						answer += "L";
					}else {														//두 손의 거리가 동일할 때
						if(hand.equals("right")) {
							positionR = numbers[i];								//오른손 잡이면 오른손으로
							answer += "R";										
						}else if(hand.equals("left")) {
							positionL = numbers[i];								//왼손 잡이면 오른손으로
							answer += "L";
						}
					}
				}//else문 끝
			}//for문 끝	
			return answer;
		}
	}

	public static int calculateDistance(int keypad, int handPosition) {
		
		int x = Math.abs( keypad - handPosition );
		
		if( x == 0) {
			return 0;
		}else if( x==1 || x==3 ){
			return 1;
		}else if ( x==2 || x==4 || x==6 ) {
			return 2;
		}else if ( x==5 || x==7 || x==9) {
			return 3;
		}else {
			return 4;
		}
	}
	
	public static void main(String[] args) {

		int[] ex1 = {1,3,4,5,8,2,1,4,5,9,5};
		System.out.println( Solution.solution(ex1, "right") );
		
		System.out.println("---");

		int[] ex2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		System.out.println( Solution.solution(ex2, "left") );
	
		System.out.println("---");

		int[] ex3 = {1,2,3,4,5,6,7,8,9,0};
		System.out.println( Solution.solution(ex3, "right") );
		
	}
}
