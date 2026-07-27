package com.mnu.exam02;
//익명 구현 개체
interface AAA{
	void exam(int a);
}

class ExAA implements AAA{
	@Override
	public void exam(int a) {
		System.out.println("a=" + a);
		
	}
}
public class Exam_16 {

	public static void main(String[] args) {
		ExAA a= new ExAA();
		a.exam(100);
		
	
	}

}
