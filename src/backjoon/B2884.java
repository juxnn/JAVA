package backjoon;

import java.util.Scanner;

public class B2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		sc.close();
		
		if(minute>=45) {
			System.out.println(hour + " " + (minute-45));
		}else if(minute<45){
			if(hour==0) 
				System.out.println( 23 + " " + Math.abs(minute+15) );
			else 
				System.out.println((hour-1) + " " + Math.abs(minute+15) );
		}
	}
}
