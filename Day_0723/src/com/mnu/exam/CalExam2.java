package com.mnu.exam;

public class CalExam2 {
	public static void main(String[] args) {
		Cal2.add(10, 20);//이건 번거롭게 new 안하고도 바로 계산가능 static의 장점
		
		Cal2 c1 = new Cal2();
		c1.add(20,30);

	}

}
