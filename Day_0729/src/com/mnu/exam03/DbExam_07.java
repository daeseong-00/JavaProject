package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_07 {
	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select eno,ename,job,hiredate,salary,emp.dno,dname from emp join dept on emp.dno=dept.dno\r\n"
				+ "where ename like '_A%'";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("hiredate")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\n");
			}
			

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}

	}

}
