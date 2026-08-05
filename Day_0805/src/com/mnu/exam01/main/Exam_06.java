package com.mnu.exam01.main;

import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

//키보드로 회원번호, 이름(수정불가), 전화, 성별, 등급, 지역코드를 입력
//수정
public class Exam_06 {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = new MemberDTO();
		
		
		Scanner scn = new Scanner(System.in);

		System.out.print("회원번호 : ");
		dto.setCustno(scn.nextInt());
		
		System.out.print("전화번호 : ");
		dto.setPhone(scn.next());
		System.out.print("성별 : ");
		dto.setGender(scn.next().toUpperCase());
		System.out.print("회원등급 : ");
		dto.setGrade(scn.next().toUpperCase());
		System.out.print("거주지역 : ");
		dto.setCity(scn.next());
		
		//등록 메소드 호출
		int row = dao.memberUpdate(dto);
		if(row==1) {
			System.out.println("회원수정 성공");
		}else {
			System.out.println("회원수정 실패");
		}


	}

}
