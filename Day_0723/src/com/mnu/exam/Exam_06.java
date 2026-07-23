package com.mnu.exam;
class SuperA{
}
class ChA extends SuperA{
	
}

public class Exam_06 {
	public static void main(String[] args) {
	//조상은 자식 객체 생성가능
		SuperA sa = new ChA();
		SuperA a = new SuperA();
		
	//자식은 조상 객체 생성 불가
		//ChA ca = new SuperA();
		int value = (int)3.14;//형변환(실수를 정수로)
		double dd = 100;//자동 형변환
		//ChA ca = (ChA)a;// 컴파일 성공, 런타임 오류, 되는거 같이 보여도 실행하면 오류남
		
		
	}

}
