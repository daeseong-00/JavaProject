package com.mnu.exam01;

import java.util.ArrayList;
import java.util.List;

//List 인터페이스 : 구현 클래스 ArrayList, Vector
// add(),get(),set(),isEmpty(),size(),contains()
public class Exam_01 {
	public static void main(String[] args) {
		List<DeptDTO> dList = new ArrayList();
		
		DeptDTO dto = new DeptDTO();
		dto.setDno(10);
		dto.setDname("aaa");
		dto.setLoc("a001");
 
		
		dList.add(dto);
		dList.add(new DeptDTO(20,"bbb","b001"));
		dList.add(new DeptDTO(30,"ccc","c001"));
		dList.add(new DeptDTO(40,"ddd","d001"));
		dList.add(new DeptDTO(50,"eee","e001"));
		
		//출력
		System.out.println("부서번호\t부서명\t지역명");
		if(!dList.isEmpty()) {//if(dList.size!=0)
			for(DeptDTO var : dList) {
				System.out.print(var.getDno()+"\t");
				System.out.print(var.getDname()+"\t");
				System.out.print(var.getLoc()+"\n");
			}
		}else {
			System.out.print("등록된 자료가 없습니다.");
		}
	}

}
