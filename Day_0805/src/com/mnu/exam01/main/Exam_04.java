package com.mnu.exam01.main;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam01.model.MemberDAO;
import com.mnu.exam01.model.MemberDTO;

//회원검색(전화번호 뒤 4자리)
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("회원검색(전화번호 뒤 4자리) : ");
		String tel = scn.next();
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list = dao.memberListPhone(tel);
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
