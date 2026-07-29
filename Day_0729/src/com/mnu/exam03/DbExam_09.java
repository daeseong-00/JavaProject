package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.mnu.util.DBManager;

public class DbExam_09 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("사번입력 : ");
		//키보드로 사원번호 입력
		int eno = scn.nextInt();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "delete from emp where eno=?;";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eno);
			

			
			int row = pstmt.executeUpdate();//insert, update, delete
			System.out.println("삭제된 로우 : " + row);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}

	}

}
