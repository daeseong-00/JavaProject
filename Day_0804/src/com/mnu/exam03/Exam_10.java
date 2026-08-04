package com.mnu.exam03;

import java.util.ArrayDeque;
import java.util.Deque;

//학생 객체를 생성
//스택에 저장 후 출력
public class Exam_10 {
	public static void main(String[] args) {
		Deque<Student> student = new ArrayDeque<Student>();
		student.push(new Student(1,"김학생",90,88,79));
		student.push(new Student(2,"이학생",90,89,70));
		student.push(new Student(3,"박학생",80,78,89));
		student.push(new Student(4,"강학생",95,90,75));
		student.push(new Student(5,"오학생",92,87,79));
		
		
		//출력
		//번호    이름    국어    영어    수학    총점    평균
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		while(!student.isEmpty()) {
			Student st = student.pop();
			System.out.print(st.getBun()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getKor()+"\t");
			System.out.print(st.getEng()+"\t");
			System.out.print(st.getMat()+"\t");
			System.out.print(st.getKor()+st.getEng()+st.getMat()+"\t");
			System.out.print((st.getKor()+st.getEng()+st.getMat())/3.+"\n");
			
		}
	}

}
