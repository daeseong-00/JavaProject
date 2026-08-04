package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

public class Exam_02 {
	public static void main(String[] args) {
		//키보드 입력(부서번호)
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자로부터 부서번호 입력받기
		System.out.print("조회할 부서번호 입력 >> ");
		int inputDno = sc.nextInt();
		
		// 2. DAO 객체 생성 및 데이터 조회
		EmpDAO dao = EmpDAO.getInstance();
		List<CommDTO> list = dao.getListByDno(inputDno); // 입력받은 부서번호 전달
		
		// 3. 결과 출력
		System.out.println("사원번호\t이름\t\t입사일\t\t급여\t부서번호\t부서명\t지역명");
		
		if (!list.isEmpty()) {
			for (CommDTO dto : list) {
				System.out.print(dto.empDTO.getEno() + "\t");
				System.out.print(dto.empDTO.getEname() + "\t\t");
				System.out.print(dto.empDTO.getHiredate() + "\t");
				System.out.print(dto.empDTO.getSalary() + "\t");
				System.out.print(dto.deptDTO.getDno() + "\t");
				System.out.print(dto.deptDTO.getDname() + "\t");
				System.out.print(dto.deptDTO.getLoc() + "\n");
			}
	}
	}
}
		
	

	