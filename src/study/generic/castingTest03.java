package study.generic;

public class castingTest03 {
	
	public static class Box<T>{
		private T t;
		private T get() { return t; }
		private void set(T t) { this.t = t; }
	}
	
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		int value = box2.get();
		
	}
	

}
