package chap7.Exercise;

public class Exercise06B extends Exercise06A {
	private String name;
	
	public Exercise06B() {
		this("홍길동");
		System.out.println("Exercise06B() call");
	}
	
	public Exercise06B(String name) {
//		super();
		this.name = name;
		System.out.println("Exercise06B(String name) call");
	}

}
