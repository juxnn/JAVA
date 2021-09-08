package chap8.Exercise03;

public class Ex03B {
	
	private static void printSound(Ex03A soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Ex03C());
		printSound(new Ex03D());
	}

}
