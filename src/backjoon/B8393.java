package backjoon;

import java.util.Scanner;

public class B8393 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
