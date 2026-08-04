package com.mnu.exam03;

import java.util.LinkedList;
import java.util.Queue;

public class Exam_09 {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.offer(400);
		System.out.println("큐 객체 수 : " + queue.size());
		
		while(!queue.isEmpty()) {
			int a = queue.poll();
			System.out.println("꺼낸 객체 : " + a);
			System.out.println("큐 객체 수 : " + queue.size());
		}

	}

}
