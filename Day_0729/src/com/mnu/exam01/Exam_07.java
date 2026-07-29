package com.mnu.exam01;

public class Exam_07 {

	public static void main(String[] args) {
		//int a = System.currentTimeMillis(); int는 자리수가 작아서 오류
		long a2 = System.currentTimeMillis();
		long a3 = System.nanoTime();//더 세분화된시간
				System.out.println(a2);
				System.out.print(a3);

	}

}
