package algorithm.doit.chap04;

import java.util.Scanner;

public class IntStack {

	private int max;		//스택용량
	private int ptr;		//스택 포인터
	private int[] stk;		//스택 본체
	
	//실행시 예외: 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException{	
		public EmptyIntStackException() {}
	}
	
	//실행시 예외: 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			//스택 본체용 배열을 생성			
		}catch(OutOfMemoryError e) {	//생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		if(ptr == max)					//스택이 가득 참
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)						//스택이 비어있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	
	//스택에서 x를 찾아 인덱스(없으면-1)를 반환
	public int indexOf(int x) {
		for(int i = ptr -1; i>=0; i--) 	//정상쪽에서 선형 검색
			if(stk[i] == x)
				return i;	//검색 성공
		return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	//스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택 안의 모든 데이터를 바닥->꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0)
			System.out.println("스택이 비어있습니다.");
		else {
			for(int i=0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ");
			
			int menu = stdIn.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
				case 1://푸시
					System.out.print("데이터 ");
					x = stdIn.nextInt();
					try {
						s.push(x);
					}catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;
			

				case 2://팝
					try {						
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
					
				case 3://피크
					try {
						x= s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;
					
				case 4:	//덤프
					s.dump();
					break;
			}
			
		}
	}
}
