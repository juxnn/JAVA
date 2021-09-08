package chap6.Exercise;

public class Exercise18A {
	//작성위치
	private static Exercise18A singleton = new Exercise18A();
	
	static Exercise18A getInstance() {
		return singleton;
	}

}
