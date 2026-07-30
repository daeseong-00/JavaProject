package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.MemberDAO;
import com.mnu.model.MemberDTO;

public class MemberSearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("회원번호 입력 : ");
		int custno = scn.nextInt();
		
		//회원이 있는 경우(번호,이름,전화,성별,등급,등록일출력)
		//없으면 "등록된 회원정보가 없습니다"
		
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = dao.memberSearch(custno);
		
		System.out.println("회원번호\t회원이름\t회원전화\t회원성별\t회원등급\t회원가입일");
		System.out.print("회원번호 : " + dto.getCustno()+"\t");
		System.out.print("회원이름 : " + dto.getCustname()+"\t");
		System.out.print("회원전화 : " + dto.getPhone()+"\t");
		System.out.print("회원성별 : " + dto.getGender()+"\t");
		System.out.print("회원등급 : " + dto.getGrade()+"\t");
		System.out.print("회원가입일 : " + dto.getJoindate()+"\n");
		

	}

}
