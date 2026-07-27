package com.mnu.exam01;
class Parent{
	void show() {
		System.out.print("Parent");
	}
}
class Child extends Parent{
	//오버라이딩
	void show() {
		System.out.println("Child");
	}
}
public class Exam_10 {

	public static void main(String[] args) {
		Parent pa = new Child();
		pa.show();
	}

}
