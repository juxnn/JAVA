package algorithm.doit.chap02;

import java.util.Scanner;

public class CardConvRev {

	static int cardConvR(int x, int r, char[] d) {//기수변환을 실행하는 프로그램
		//정수값 x를 r진수로 변환하여 배열 에 아랫자리부터 넣어두고 자릿수를 반환한다.
		
		int digits = 0;								//변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] =  dchar.charAt(x % r);		//r로 나눈 나머지를 저장
			x /= r;
		}while(x != 0);
		
		return digits;
	}
	
	//배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메소드를 작성하세요.
	static int cardConvR2(int x, int r, char[] d) {

		int digits = 0;							
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] =  dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		
		//case 1: 다 처리하고나서 순서를 바꿔준다.
		//case 2: 처음부터 넣을 때 반대로 넣어준다.
		//case 1이 맞는 것 같다.
		//해설을 봐도 case 1 대로 했다. 나와 방법이 같더라.
		char change;
		
		for(int i=0; i<digits/2; i++) {
			change = d[i]; 
			d[i] = d[digits-i-1];
			d[digits-i-1] = change;
		}

		return digits;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int no;						//변환하는 정수
		int cd;						//기수
		int dno;					//변환후의 자릿수
		int retry;					//다시 한번?
		char[] cno = new char[32];	//변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환 합니다.");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수: ");
				no = stdIn.nextInt();
			}while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환할까요?(2~36): ");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			//dno = cardConvR(no, cd, cno);		//no를 cd진수로 변환.
			dno = cardConvR2(no, cd, cno);
			
			System.out.println(cd + "진수로는 ");
			//for(int i = dno-1; i>=0; i--) {
			//	System.out.print(cno[i]);
			//}
			for(int i = 0; i<dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = stdIn.nextInt();	
		}while(retry == 1);
		
		stdIn.close();
	}
}
