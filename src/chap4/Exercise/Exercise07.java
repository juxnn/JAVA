package chap4.Exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);
		int inputInt;
		

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println(" 1.예금| 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			inputInt = scanner.nextInt();
			switch (inputInt) {

			case 1:
				System.out.print("예금액> ");
				inputInt = scanner.nextInt();
				balance += inputInt;
				break;
			case 2:
				System.out.print("출금액> ");
				inputInt = scanner.nextInt();
				balance -= inputInt;
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance); 
				break;
			case 4:
				System.out.println("");
				run=false;
				break;

			}

		}

		scanner.close();
		System.out.println("프로그램 종료");
	}
}
