package study.generic;

public class genericWithExtends01 {

	public static class Util01{
		
		public static <T extends Number> int comapre(T t1, T t2) {
			double v1 = t1.doubleValue();
			double v2 = t2.doubleValue();
			
			return Double.compare(v1, v2);	
		}
		
		public static void main(String[] args) {
			
			//String은 Number type이 아니다.
			//String str = Util01.comapre("a", "b");
			
			int result1 = Util01.comapre(10, 20);
			System.out.println(result1);
			
			int result2 = Util01.comapre(4.5, 3);
			System.out.println(result2);
		}
		
	}
	
}
