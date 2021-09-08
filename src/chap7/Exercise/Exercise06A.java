package chap7.Exercise;

public class Exercise06A {
	public String nation;
	
	public Exercise06A() {
		this("대한민국");
		System.out.println("Exercise06A() call");
		
	}
	
	public Exercise06A(String nation) {
		this.nation = nation;
		System.out.println("Exercise06A(String nation) call");
	}

}
