package chap6;

public class p275_Service {
	@p274_PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	@p274_PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	@p274_PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	@Myanno
	int i;
}

@interface Myanno {
	
}