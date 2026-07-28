package com.mnu.dbexam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mnu.util.DBManager;

/* JDBC Program
 * 1. jdbc 드라이버로딩
 * 2. Connection 객체 생성
 * 3. Statement(명령문 처리)
 * 4. Close
 * 
 */
public class DbExam_02 {
	public static void main(String[] args) {
		Connection conn = null;      // 연결 담당
		PreparedStatement pstmt = null; // SQL 명령문 처리 담당
		ResultSet rs = null;         // Query 결과 저장
		
		String sql = "select * from emp";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 명령 실행 후 결과를 rs에 저장
			
			// 결과 출력
			System.out.println("eno\tename\tjob\tmanager\thiredate\tsalary\tcommission\tdno");
			while (rs.next()) { 
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getInt("manager") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getInt("commission") + "\t");
				System.out.print(rs.getInt("dno") + "\n");
				
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			// DB 자원 해제 (생성된 역순으로 close)
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}