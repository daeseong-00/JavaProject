package com.mnu.exam01.main;

import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

//tbl_member 테이블에 새로운 회원등록
//회원번호는 자동증가 이용
public class Exam_02 {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = new MemberDTO();
		
		
		Scanner scn = new Scanner(System.in);

		System.out.print("회원성명 : ");
		dto.setCustname(scn.next());
		System.out.print("전화번호 : ");
		dto.setPhone(scn.next());
		System.out.print("성별 : ");
		dto.setGender(scn.next().toUpperCase());
		System.out.print("회원등급 : ");
		dto.setGrade(scn.next().toUpperCase());
		System.out.print("거주지역 : ");
		dto.setCity(scn.next());
		
		//등록 메소드 호출
		int row = dao.memberWriteSeq(dto);
		if(row==1) {
			System.out.println("회원등록 성공");
		}else {
			System.out.println("회원등록 실패");
		}

	}

}
