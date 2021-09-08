package chap6.Exercise;

import java.util.Scanner;

public class Exercise20B {
	private static Exercise20A[] accountArray = new Exercise20A[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1 ) {
				creatAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성하기
	private static void creatAccount() {
		//작성위치
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
				
		System.out.print("초기입금액: ");
		int money = scanner.nextInt();
		
		//객체 생성
		Exercise20A newAccount = new Exercise20A(ano, owner, money);
		accountArray[size++] = newAccount;
		
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	//계좌 목록보기
	private static void accountList() {
		//작성위치
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		
		for(int i=0; i<size; i++) {
			System.out.print(accountArray[i].getAno() + "\t");
			System.out.print(accountArray[i].getOwner() + "\t");
			System.out.println(accountArray[i].getBalance());
		}
		
	}
	//예금하기
	private static void deposit() {
		//작성위치
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");

		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("예금액: ");
		int money = scanner.nextInt();
		
		Exercise20A account = findAccount(ano);
		account.setBalance(account.getBalance() +money);;
		
	}
	//출금하기
	private static void withdraw() {
		//작성위치
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		
		Exercise20A account = findAccount(ano);
		account.setBalance(account.getBalance() -money);
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Exercise20A findAccount(String ano) {
		//작성위치
		for(int i=0; i<size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}

}
