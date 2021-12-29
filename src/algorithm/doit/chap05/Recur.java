package algorithm.doit.chap05;

import java.util.Scanner;

import algorithm.doit.chap04.IntStack;

public class Recur {

	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	//재귀 알고리즘의 비 재귀적 표현, 꼬리재귀를 제거하기.
	static void recur2(int n) {
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2;
		}
	}
	
	//꼬리 재귀와는 다르게, 앞에서 호출한 재귀 메서드의 제거는 쉽지 않다.
	//잠시 '저장'을 해야 하는 개념이 있기 때문이다.
	//이 때 이런 문제를 잘 해결할 수 있는 데이터구조가 바로 앞장에서 살펴본 스택(stack)이다.
	
	static void recur3(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if(s.isEmpty() != true) {	//스택이 비어있지 않다면
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = stdIn.nextInt();
		
		recur(x);
		
		stdIn.close();
	}
}
