package backjoon;

import java.util.Scanner;

public class B2588 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int C = B % 10;			//1의 자리수
		int D = B / 10 % 10;	//10의 자리수
		int E = B / 100;		//100의 자리수
		
		System.out.println( A*C );
		System.out.println( A*D );
		System.out.println( A*E );
		System.out.println( A*B );
	
		sc.close();
	}

}





