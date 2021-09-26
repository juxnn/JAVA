package backjoon;

import java.util.Scanner;

public class B1008 {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		
			double A = sc.nextInt();
			double B = sc.nextInt();
			double C = A/B;
			
			System.out.println(C);
			
			sc.close();
		}
}
