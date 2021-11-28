package inflearn.dataStructure.ch04.s01;

public class MySingleLinkedList<T> {

	public Node<T> head;
	public int size = 0;
	
	public MySingleLinkedList() {
		head = null;		//초기화는 어디에서 해도 상관은 없다.
		size = 0;
	}
	
	public void add(int index, T item) {
		
	}
	public void remove(int index) {
		
	}
	public T get(int index) {
		return null;
	}
	public int indexOf(T item) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		MySingleLinkedList<String> list = new MySingleLinkedList<String>();
		
		list.add(0, "Sat");	//S
		list.add(1, "Fri");	//S F
		list.add(0, "Mon");	//M S F
		list.add(2, "Tue");	//M S T F
		
		String str = list.get(2);	//str = "Tue";
		list.remove(2);				//M S F
		int pos = list.indexOf("Friday");
		
	}
}
