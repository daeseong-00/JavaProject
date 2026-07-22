package com.mnu.sawon;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		//키보드 입력(사원정보입력)
		Scanner scn = new Scanner(System.in);
		System.out.print("사원등록 : ");
		int sabun = scn.nextInt();//사원번호
		String na = scn.next();//이름
		int gen = scn.nextInt();//성별
		int gra = scn.nextInt();//사원등급
		int time = scn.nextInt();//근무시간
		
		SawonDAO dao = SawonDAO.genInstance();
		
		Sawon sawon = dao.getSawon(sabun, na, gen, gra, time);
		
		//주간급여(등급에 따른 시급)
		int wepa = 2000;
		if(sawon.getGra()==1)
			wepa = 10000;
		else if(sawon.getGra()==2)
			wepa = 5000;
		
		int wemo = dao.wepaProcess(sawon, wepa);
		
		//성별계산
		String genstr = "여성";
		if(sawon.getGen()==1 || sawon.getGen()==3)
			genstr="남성";
			
		//출력
		System.out.println("사원번호\t이름\t성별\t등급\t시급\t근무시간\t주간급여");
		System.out.print(sawon.getSabun() + "\t");
		System.out.print(sawon.getSana() + "\t");
		System.out.print(genstr + "\t");
		System.out.print(sawon.getGra() + "\t");
		System.out.print(wepa + "\t");
		System.out.print(sawon.getTime() + "\t");
		System.out.print(wemo + "\t");
		
		
	}

}
