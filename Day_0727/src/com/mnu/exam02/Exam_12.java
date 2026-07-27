package com.mnu.exam02;
abstract class AA{
	int a=10;
	void test() {
		
	}
	abstract void add(int a, int b);//오버라이딩 필수
}
class SubAA extends AA{//ctrl + space 하면 오버라이딩뜸
	
	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
public class Exam_12 {

	public static void main(String[] args) {
		//AA a = new AA(); 이건 안됨
		AA a = new SubAA();

	}

}

