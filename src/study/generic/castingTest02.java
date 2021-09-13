package study.generic;

public class castingTest02 {
	
	public static class Box{
		private Object object;
		public void set(Object object) {this.object = object;}
		public Object get() { return object; }
	}
	
	public static class Apple{	
	}
	
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
	}
}
