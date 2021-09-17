package inflearn.dataStructure.ch02.s02;

public class Term2 {
	
	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow( x, expo));
	}
	
	public void printTerm() {
		System.out.print(coef + "x^"+ expo);	// -x^2 ==> -1x^2 로 나올것이다. (완벽하진 않음)	
	}
}
