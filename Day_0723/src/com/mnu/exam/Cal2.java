package com.mnu.exam;
//계산기 클래스
//접근제어자 : private(현재파일 내에서만),아무것도 안붙임(default,같은패키지 내), 
//protected(디폴트보다 넓은범위), public(전체)
public class Cal2 {
	private int a;//멤버변수
	private int b;
	//생성자(클래스 이름과 동일한 메소드(), 반환타입 없음)
	public Cal2(){}
	public Cal2(int a) {//동일한 이름으로는 하나 밖에 못만듬, 매개변수의 갯수나 타입,
		//순서가 다르면 가능 ->오버로딩
		//this.a=a; -> a이름이 같아서 this 붙이는거
		b=a;
	}
	public Cal2(int a, int b) {
		this.a=a;
		this.b=b; 
		//a=a; b=b; 이것도 되는데 혼동되니까 this붙임
	}
	
	//기능 메소드
	public void add() {
		int result = a+b;
		System.out.printf("%d + %d = %d\n",a,b,result);
	}
	public static void add(int a, int b) {//static new 쓰기전에 미리 만들어짐 클래스이름으로 직접접근가능
		int result = a+b;
		System.out.printf("%d + %d = %d\n",a,b,result);
	}
	
	
}
