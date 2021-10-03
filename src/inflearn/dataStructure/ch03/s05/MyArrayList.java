package inflearn.dataStructure.ch03.s05;

import java.util.Arrays;

public class MyArrayList<E> {
	
	private static final int INIT_CAPACITY = 10;
	private E [] theData;
	private int size;
	private int capacity;
	
	public MyArrayList() {
		//theData = new E [INIT_CAPACITY];
		//자바에서는 new 명령어에서 실제 존재하는 타입이 아닌, 가짜 타입을 사용할 수 없다.
		//자바의 규칙이다.
		//객체로 생성이 불가능하다는 것 같다(내생각)
		theData = (E[])new Object [INIT_CAPACITY];
		//이렇게 하는게 최선이다.
		size = 0;
		capacity = INIT_CAPACITY;
	}
	
	public void add(int index, E anEntry) {
		if(index<0 || index>size)	//error or exception
			throw new ArrayIndexOutOfBoundsException(index);
		if(size>=capacity)
			reallocate();
		for(int i=size-1; i>=index; i--) {
			theData[i+1] = theData[i];
		}
		theData[index] = anEntry;
	}
	
	private void reallocate() {
		//E [] tmp = (E [])new Object[capacity * 2];
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}

	public void add(E enEntry) {
		add(size, enEntry);
	}
	
	public int size() {
		return size;
	}
	
	public int indexOf( E anEntry) {
		for(int i=0; i<size; i++)
			if(theData[i].equals(anEntry))
				return i;
		return -1;
	}
	
	public E get(int index) {
		if(index<0 || index>= size)
			throw new ArrayIndexOutOfBoundsException(index);
		return theData[index];
	}
	
	public E set(int index, E newValue) {
		if(index<0 || index>=size)
			throw new ArrayIndexOutOfBoundsException(index);
		E oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	public E remove(int index) {
		if(index<0 || index>=size)
			throw new ArrayIndexOutOfBoundsException(index);
		E returnValue = theData[index];
		for(int i=index+1; i<size; i++)
			theData[i-1] = theData[i];
		size--;
		return returnValue;
	}
	
	
	public static void main(String[] args) {
		MyArrayList<String> test = new MyArrayList<>();
		
		try {
			test.add(1, "Hello");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("------------");
		}
		
		System.out.println("**************");
	}
	
}
