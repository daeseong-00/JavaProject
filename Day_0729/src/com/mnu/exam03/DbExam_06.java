package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_06 {
	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int eno = 1234;
		String ename = "김사원";
		String job = "sales";
		String hiredate = "26/07/29";
		int salary = 2750;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "insert into emp(eno,ename,job,hiredate,salary) values(?,?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);

			
			int row = pstmt.executeUpdate();//insert, update, delete
			System.out.println("등록된 로우 : " + row);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}

	}

}
