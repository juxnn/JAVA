package study.generic;

public class multiTypeParameter01 {
	
	public static class Product<T, M>{
		private T kind;
		private M model;
		
		public T getKind() { return this.kind; }
		public M getModel() { return this.model; }
		
		public void setKind(T kind) { this.kind = kind; }
		public void setModel(M model) {this.model = model; }
	}
	
	public static class Tv{
	}
	public static class Car{		
	}
	
	public static void main(String[] args) {
		
		//자바6 이전 버전
		//Product<Tv, String> product1 = new Product<Tv, String>();
		
		//자바7부터 이렇게 간단하게 써도 된다.
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		
	}
	

}
