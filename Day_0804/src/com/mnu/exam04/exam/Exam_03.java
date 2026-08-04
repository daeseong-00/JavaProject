package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.EmpDAO;
import com.mnu.exam04.model.EmpDTO;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String na = scn.next().toUpperCase();
		
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> list = dao.nameList(na);
		System.out.println("사번\t이름\t부서\t매니저\t입사일\t\t\t급여\t커미션\t부서번호");
		if (!list.isEmpty()) {
			for (EmpDTO dto : list) {
				System.out.print(dto.getEno() + "\t");
				System.out.print(dto.getEname() + "\t");
				System.out.print(dto.getJob() + "\t");
				System.out.print(dto.getManager() + "\t");
				System.out.print(dto.getHiredate() + "\t");
				System.out.print(dto.getSalary() + "\t");
				System.out.print(dto.getCommission() + "\t");
				System.out.print(dto.getDno() + "\n");
			}
	}

	}
}

