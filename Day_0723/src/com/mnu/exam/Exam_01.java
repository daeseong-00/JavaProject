package com.mnu.exam;
class Super{
	private int a=10;
	int b=100; //a는 private 이기때문에 상속 안됨.
}

class Child extends Super{
	//상속은 extends로 상속받음 b만 상속됨.
	int b=50;
	int d=10; // b와 d 두가지 변수
	void test() {
		System.out.println("Super.b= " + super.b);//super는 조상클래스의 값그대로 나옴 this와 비슷한개념
		System.out.println("b= " + b);
		System.out.println("d= " + d);
	}
	
}
public class Exam_01 {

	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println("s1.b = " + s1.b);//100
		
		Child c1 = new Child();
		System.out.println("c1.b = " + c1.b);//100
		System.out.println("c1.d = " + c1.d);//10

	}

}
