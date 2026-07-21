package bbb;

import java.util.Scanner;

import aaa.Student;

public class StudentExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("학생정보입력 : ");
		int hak = scn.nextInt();
		String na = scn.next();
		boolean gen = scn.nextBoolean();
		int age = scn.nextInt();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		//StudentPro stPro = new StudentPro();
		StudentPro stPro = StudentPro.getInstance();
		
		Student st1 = stPro.getStudent(hak,na,gen,age,kor,eng,mat);
		
		stPro.setStudentOutput(st1);
		

	}

}
