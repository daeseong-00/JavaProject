package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_05 {
	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno = 50;
		String dname = "총무과";
		String loc = "서울";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "update dept set dname=?, loc=? where dno=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(3, dno);
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);

			
			int row = pstmt.executeUpdate();//insert, update, delete
			System.out.println("수정된 로우 : " + row);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}

	}

}
