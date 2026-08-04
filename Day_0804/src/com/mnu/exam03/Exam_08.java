package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//Stack, Queue

public class Exam_08 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();

		Deque<Integer> stack2 = new ArrayDeque();//이건잘안씀
		//속도가 더 빠르다고 하는데 모름  // 작동방식은 stack과 동일
		
		//삽입
		stack2.push(123);
		stack2.push(456);
		stack2.push(789);
		stack2.push(12);//8진수로 판단하여 10으로 출력
		
		System.out.println("전체 : " + stack2);
		System.out.println("객체 수 : " + stack2.size());
		
		System.out.println("마지막 입력 객체 : " + stack2.peek());
		//System.out.println("마지막 입력 객체 꺼내기 : " + stack.pop());
		//System.out.println("객체 수 : " + stack.size());
		//확장 for
		for(Integer data : stack2) {
			System.out.println(data);
		}//이건 꺼낸게 아니라 확인한거라 위랑 차이 없음
		System.out.println("객체 수 : " + stack2.size());
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
		System.out.println("객체 수 : " + stack2.size());
		
	}

}
