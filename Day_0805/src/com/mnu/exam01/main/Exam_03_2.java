package com.mnu.exam01.main;

import java.util.List;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

//회원정보 검색
//회원번호    이름    전화    성별    가입일자    고객등급    고객등급    거주도시
public class Exam_03_2 {
	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list = dao.memberList2();
		System.out.println("회원번호\t이름\t연락처\t\t성별\t가입일자\t\t등급\t도시명");
		if(list.size()==0) {
			System.out.println("등록된 회원이 없음");
		}else {
			for(MemberDTO dto : list) {
				System.out.print(dto.getCustno()+"\t");
				System.out.print(dto.getCustname()+"\t");
				System.out.print(dto.getPhone()+"\t");
				System.out.print(dto.getGender()+"\t");
				System.out.print(dto.getJoindate()+"\t");
				System.out.print(dto.getGrade()+"\t");
				System.out.print(dto.getCityname()+"\n");
			}
		}
		

	}

}
