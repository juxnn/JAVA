package chap6.Exercise;

public class Exercise18B {
	public static void main (String[] args) {
		Exercise18A obj1 = Exercise18A.getInstance();
		Exercise18A obj2 = Exercise18A.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Exercise18A 객체 입니다.");
		}else {
			System.out.println("다른 Exercise18A 객체 입니다.");
		}
	}

}
