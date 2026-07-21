package bbb;

import aaa.Student;

public class StudentPro {
	private StudentPro() {}
	
	public static StudentPro pro = new StudentPro();//private 공유객체
	
	public static StudentPro getInstance() {
		return pro;
	}//여기까지가 싱글톤
	
	//필요한 메소드 정의
	//1. Student 객체를 생성 후 반환하는 메소드
	public Student getStudent(int hak,String na,boolean gen,int age,int kor,int eng,
			int mat) {
		
		Student student = new Student(hak,na,gen,age,kor,eng,mat);
		
		return student;
		
	}
	
	//2. 총점, 평균, 출력하는 메소드
	public void setStudentOutput(Student stu1) {
		System.out.println("학번\t이름\t성별\t나이\t국\t영\t수\t총점\t평균");
		String str="여성";
		if(stu1.isGen())
			str="남성";
		
		int tot = stu1.getKor()+stu1.getEng()+stu1.getMat();
		double ave = tot/3.;
		System.out.print(stu1.getHak()+"\t"+stu1.getNa()+"\t");
		System.out.print(stu1.getAge()+"\t"+str+"\t");
		System.out.print(stu1.getKor()+"\t"+stu1.getEng()+"\t");
		System.out.print(stu1.getMat()+"\t"+tot+"\t");
		System.out.print(ave + "\n");
	}
}
