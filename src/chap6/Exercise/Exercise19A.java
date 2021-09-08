package chap6.Exercise;

public class Exercise19A {
	//작성 위치
	private int balance;
	static private int MIN_BALANCE = 0;
	static private int MAX_BALANCE = 1000000;
	
	public void setBalance(int balance){
		this.balance += balance;
		
		if(MIN_BALANCE>= this. balance || this.balance >= MAX_BALANCE) {
			this.balance -= balance;
			System.out.println("***금액 설정을 다시 해주세요.****");
		}
	}
	public int getBalance(){
		return this.balance;
	}
}
