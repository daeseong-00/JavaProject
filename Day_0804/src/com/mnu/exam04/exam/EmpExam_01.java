package com.mnu.exam04.exam;

import java.util.List;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

//전체 사원정보 출력
//사원번호, 이름, 입사일, 급여, 부서번호, 부서명, 지역명을 출력
public class EmpExam_01 {
	public static void main(String[] args) {
			EmpDAO dao = EmpDAO.getInstance();
			List<CommDTO> list = dao.totalList();
			
			System.out.println("사원번호\t이름\t\t입사일\t\t\t급여\t부서번호\t부서명\t지역명");
			for(CommDTO dto : list) {
				System.out.print(dto.empDTO.getEno() + "\t");
				System.out.print(dto.empDTO.getEname() + "\t\t");
				System.out.print(dto.empDTO.getHiredate() + "\t");
				System.out.print(dto.empDTO.getSalary() + "\t");
				
				// 2. 부서 정보 (deptDTO)
				System.out.print(dto.deptDTO.getDno() + "\t");
				System.out.print(dto.deptDTO.getDname() + "\t");
				System.out.print(dto.deptDTO.getLoc() + "\n");
			}
	}

}
