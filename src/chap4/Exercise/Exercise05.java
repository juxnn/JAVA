package chap4.Exercise;

public class Exercise05 {
	public static void main(String[] args) {
		int x=1;
		int y=1;
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if(5*y == 60 - 4*x)
					System.out.println("("+x+","+y+")");
			}
		}
		
	}

}
