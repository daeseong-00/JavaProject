package com.mnu.exam02;
class AAAA{
	
}
class BBBB{
	
}
//다중 상속 불가
/*
 * class AABBExam extends AAAA,BBBB{
 * } 안됨
 */
interface A{
	
}
interface B{
	
}
class AB implements A,B{
	//이건됨
}
class C extends AAAA implements A,B{
	//이것도 됨.
}
public class Exam_15 {
	public static void main(String[] args) {
		

	}

}
