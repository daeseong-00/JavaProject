package com.mnu.exam;
class DD{
	int a=10;
	void exam() {
		System.out.println("a=" + a);
	}
}
class ChDD extends DD{
	int b=20;
	//오버라이딩
	void exam() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	void test() {
		System.out.println("a=" + a);
	}
}

public class Exam_05 {
	public static void main(String[] args) {
		DD d = new ChDD();//업케스팅 
		System.out.println("a="+d.a);
		//System.out.println("a="+d.b); 이건 안됨. 조상이 물려준 부분만 접근가능
		
		

	}

}
