package com.mnu.exam04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam04.util.DBManager;

public class EmpDAO {
	private EmpDAO() {}
	
	public static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
		
	}
	
	
	
	//메소드 정의
	public List<CommDTO> totalList(){
		//반환타입
		List<CommDTO> list = new ArrayList<CommDTO>();
		//쿼리
		String sql="select eno,ename,hiredate,salary,e.dno,dname,loc\r\n"
				+ "    from emp e join dept d on e.dno=d.dno";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 1. 메인 CommDTO 객체 생성
				CommDTO dto = new CommDTO();
				
				// 2. EmpDTO 생성 및 데이터 세팅
				EmpDTO emp = new EmpDTO();
				emp.setEno(rs.getInt("eno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setSalary(rs.getInt("salary")); // DB 컬럼명이 sal이면 "sal"로 변경
				emp.setDno(rs.getInt("dno"));
				
				// 3. DeptDTO 생성 및 데이터 세팅
				DeptDTO dept = new DeptDTO();
				dept.setDno(rs.getInt("dno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				
				// 4. CommDTO 안의 필드에 넣어주기
				dto.empDTO = emp;
				dto.deptDTO = dept;
				
				// 5. 리스트에 추가
				list.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
	
	public List<CommDTO> getListByDno(int dno) {
	    List<CommDTO> list = new ArrayList<CommDTO>();
	    
	    String sql = "SELECT eno, ename, hiredate, salary, e.dno, dname, loc "
	               + "FROM emp e JOIN dept d ON e.dno = d.dno "
	               + "WHERE e.dno = ?";

	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
	        conn = DBManager.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        
	       
	        pstmt.setInt(1, dno);
	        
	        
	        rs = pstmt.executeQuery();
	        
	        while (rs.next()) {
	            CommDTO dto = new CommDTO();
	            
	            EmpDTO emp = new EmpDTO();
	            emp.setEno(rs.getInt("eno"));
	            emp.setEname(rs.getString("ename"));
	            emp.setHiredate(rs.getString("hiredate"));
	            emp.setSalary(rs.getInt("salary"));
	            emp.setDno(rs.getInt("dno"));
	      
	            DeptDTO dept = new DeptDTO();
	            dept.setDno(rs.getInt("dno"));
	            dept.setDname(rs.getString("dname"));
	            dept.setLoc(rs.getString("loc"));
	            
	            dto.empDTO = emp;
	            dto.deptDTO = dept;
	            
	            list.add(dto);
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        DBManager.close(conn, pstmt, rs);
	    }
	    
	    return list;
	}
	public List<EmpDTO> nameList(String name){
		//반환타입
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		//쿼리
		String sql="select * from emp where ename like ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%" + name + "%");//like의 특수문자는 별도로 입력
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
	            EmpDTO dto = new EmpDTO();
	            
	            // 👇 rs에서 값을 꺼내 DTO에 세팅하는 부분이 추가되어야 합니다!
	            dto.setEno(rs.getInt("eno"));
	            dto.setEname(rs.getString("ename"));
	            dto.setJob(rs.getString("job"));
	            dto.setManager(rs.getInt("manager"));
	            dto.setHiredate(rs.getString("hiredate"));
	            dto.setSalary(rs.getInt("salary")); // DB 컬럼명이 sal이라면 "sal"로 변경
	            dto.setCommission(rs.getInt("commission")); // DB 컬럼명이 comm이라면 "comm"으로 변경
	            dto.setDno(rs.getInt("dno"));
	            
	            list.add(dto); // 데이터가 채워진 dto를 리스트에 추가
	        }
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return list;
	}
}
