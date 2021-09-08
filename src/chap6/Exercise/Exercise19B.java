package chap6.Exercise;

public class Exercise19B {
	public static void main(String[] args) {
		Exercise19A account  = new Exercise19A();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(200000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(900000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-900000);
		System.out.println("현재 잔고: " + account.getBalance());
	}
}
