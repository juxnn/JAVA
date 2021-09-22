package inflearn.dataStructure.ch03.s03;

public class Test {
	public static void main(String[] args) {
		
		
		Object[] array = new Object[100];
		int a = 20;
		Integer age = new Integer(a);		//wrapping
		array[0] = age;
		
		int b = age.intValue();				//unwrapping
		System.out.println(b);
		
		int c = 30;
		array[1] = c;						//auto boxing
		System.out.println(c);
		
		int d = (Integer)array[1];			//auto unboxing
		System.out.println(d);
		
		
		String str = "1234";
		int e = Integer.parseInt(str);
		System.out.println(e);
		
	}

}
