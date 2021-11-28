package inflearn.dataStructure.ch04.s01;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T item) {
		data = item;
		next = null;
	}
}
