package backjoon;

import java.util.Scanner;

public class B10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
//		배열로 한번에 처리하는 방법.		
//		int[] A = new int[T];
//		int[] B = new int[T];
//		
//		for(int i=0; i<T; i++) {
//			A[i] = sc.nextInt();
//			B[i] = sc.nextInt();
//		}
		
		for(int i=0; i<T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		
		sc.close();
//		배열로 한번에 처리하는 방법.		
//		for(int i=0; i<T; i++) {
//			System.out.println(A[i]+B[i]);
//		}	
	}
}
