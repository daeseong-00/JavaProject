package com.mnu.exam02;
interface CCC{ //인터페이스는 전부 추상메소드라 abstract 생략
	static final double PI=3.14;
	
	void test();
	int a(int a, int b);
	
	
}
//인터페이스 구현하여 클래스 생성
class ExamCCC implements CCC{
	@Override
	public int a(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
interface CCC_1 extends CCC{
	void size();
}
public class Exam_14 {

	public static void main(String[] args) {
		

	}

}
