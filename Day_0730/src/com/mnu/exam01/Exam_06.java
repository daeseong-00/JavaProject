package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 키보드로 학생정보를 입력 학생객체를 생성 List에 저장 후
 * 총점,평균,학점을 구하여 출력
 * [입력형식]
 * 학생정보입력 : 1101 이학생 90 80 90 
 * 
 * 
 * [출력]
 * 번호   이름   국어   영어   수학   총점   평균   학점
 * 
 * [처리조건]
 * 3명 입력,동일한 번호가 있는 경우 "이미 등록된 학생입니다" 경고 출력 후 재입력
 */
public class Exam_06 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<Student> sList = new ArrayList();
		
		for(int i=0; i<3; i++) {
			System.out.print("학생정보입력 : ");
			int bun = scn.nextInt();
			String name = scn.next();
			int kor = scn.nextInt();
			int eng = scn.nextInt();
			int mat = scn.nextInt();
			
			Student stu = new Student(bun,name,kor,eng,mat);
			sList.add(stu);
		}
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		for(Student s : sList) {
			System.out.print(s.getBun()+"\t");
			System.out.print(s.getName()+"\t");
			System.out.print(s.getKor()+"\t");
			System.out.print(s.getEng()+"\t");
			System.out.print(s.getMat()+"\t");
			int tot = s.getKor()+s.getEng()+s.getMat();
			double avg = tot/3.;
			System.out.print(tot+"\t");
			System.out.print(avg+"\t");
			String grade="";
			if(avg>=90)
				grade = "A";
			if(avg>=80)
				grade = "B";
			if(avg>=70)
				grade = "C";
			if(avg>=60)
				grade = "D";
			if(avg<60)
				grade = "F";
			System.out.print(grade + "\n");
		}
		
	}

}
