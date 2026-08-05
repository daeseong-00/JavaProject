package com.mnu.exam01.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam01.util.DBManager;

public class MemberDAO {
	private MemberDAO() {}
	
	public static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//1. 회원전체정보 검색
	public List<MemberDTO> memberList(){
		List<MemberDTO> mList = new ArrayList();
		String sql="select custno,custname,phone,gender,joindate,grade,cityname from tbl_member m join tbl_city c\r\n"
				+ "on m.city=c.city";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt(1));
				dto.setCustname(rs.getString(2));
				dto.setPhone(rs.getString(3));
				dto.setGender(rs.getString(4));
				dto.setJoindate(rs.getString(5));
				dto.setGrade(rs.getString(6));
				dto.setCityname(rs.getString(7));
				
				mList.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return mList;
	}
	
	//1. 회원전체정보 검색
		public List<MemberDTO> memberList2(){
			List<MemberDTO> mList = new ArrayList();
			String sql="select custno,custname,phone,\r\n"
					+ "     decode(gender,'M','남자','F','여자')as gender\r\n"
					+ "     ,joindate,\r\n"
					+ "     decode(grade,'A','VIP','B','일반','C','직원')as grade\r\n"
					+ "     ,cityname from tbl_member m join tbl_city c\r\n"
					+ "     on m.city=c.city";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					MemberDTO dto = new MemberDTO();
					dto.setCustno(rs.getInt(1));
					dto.setCustname(rs.getString(2));
					dto.setPhone(rs.getString(3));
					dto.setGender(rs.getString(4));
					dto.setJoindate(rs.getString(5));
					dto.setGrade(rs.getString(6));
					dto.setCityname(rs.getString(7));
					
					mList.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}
			return mList;
		}
		public List<MemberDTO> memberListPhone(String tel){
			List<MemberDTO> mList = new ArrayList();
			String sql="select custno,custname,phone,\r\n"
					+ "     decode(gender,'M','남자','F','여자')as gender\r\n"
					+ "     ,joindate,\r\n"
					+ "     decode(grade,'A','VIP','B','일반','C','직원')as grade\r\n"
					+ "     ,cityname from tbl_member m join tbl_city c\r\n"
					+ "     on m.city=c.city where phone like ?";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "%"+tel);
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					MemberDTO dto = new MemberDTO();
					dto.setCustno(rs.getInt(1));
					dto.setCustname(rs.getString(2));
					dto.setPhone(rs.getString(3));
					dto.setGender(rs.getString(4));
					dto.setJoindate(rs.getString(5));
					dto.setGrade(rs.getString(6));
					dto.setCityname(rs.getString(7));
					
					mList.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}
			return mList;
		}
		public List<MemberDTO> memberListName(String name){
			List<MemberDTO> mList = new ArrayList();
			String sql="select custno,custname,phone,\r\n"
					+ "     decode(gender,'M','남자','F','여자')as gender\r\n"
					+ "     ,joindate,\r\n"
					+ "     decode(grade,'A','VIP','B','일반','C','직원')as grade\r\n"
					+ "     ,cityname from tbl_member m join tbl_city c\r\n"
					+ "     on m.city=c.city where custname like ?";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				
				rs = pstmt.executeQuery();
				while(rs.next()) {
					MemberDTO dto = new MemberDTO();
					dto.setCustno(rs.getInt(1));
					dto.setCustname(rs.getString(2));
					dto.setPhone(rs.getString(3));
					dto.setGender(rs.getString(4));
					dto.setJoindate(rs.getString(5));
					dto.setGrade(rs.getString(6));
					dto.setCityname(rs.getString(7));
					
					mList.add(dto);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}
			return mList;
		}
	//회원번호 최대 값 찾기
		public int memberMaxCustno(){
			int row = 0;
			String sql="select max(custno) from tbl_member";
			
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					row = rs.getInt(1);
				}
					
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt, rs);
			}
			return row;
		}
//회원등록 메소드
		public int memberWrite(MemberDTO dto) {
			int row = 0;
			String sql = "insert into tbl_member(custno,custname,phone,gender,grade,joindate,city\r\n"
					+ ") values(?,?,?,?,?,sysdate,?)";
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getCustno());
				pstmt.setString(2, dto.getCustname());
				pstmt.setString(3, dto.getPhone());
				pstmt.setString(4, dto.getGender());
				pstmt.setString(5, dto.getGrade());
				pstmt.setString(6, dto.getCity());
				row = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt);
			}
			return row;
		}
		public int memberWriteSeq(MemberDTO dto) {
			int row = 0;
			String sql = "insert into tbl_member(custno,custname,phone,gender,grade,joindate,city\r\n"
					+ ") values(tbl_member_custno_seq.nextval,?,?,?,?,sysdate,?)";
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, dto.getCustname());
				pstmt.setString(2, dto.getPhone());
				pstmt.setString(3, dto.getGender());
				pstmt.setString(4, dto.getGrade());
				pstmt.setString(5, dto.getCity());
				row = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt);
			}
			return row;
		}
		public int memberUpdate(MemberDTO dto) {
			int row = 0;
			String sql = "UPDATE tbl_member\r\n"
					+ "SET phone= ?,gender = ?,grade= ?,city= ? \r\n"
					+ "WHERE custno = ?";
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, dto.getPhone());
				pstmt.setString(2, dto.getGender());
				pstmt.setString(3, dto.getGrade());
				pstmt.setString(4, dto.getCity());
				pstmt.setInt(5, dto.getCustno());
				row = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt);
			}
			return row;
		}
		public int memberDelete(MemberDTO dto) {
			int row = 0;
			String sql = "delete from tbl_member where custno=?";
			try {
				conn = DBManager.getConnection();
				pstmt = conn.prepareStatement(sql);
								
				pstmt.setInt(1, dto.getCustno());
				row = pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.close(conn, pstmt);
			}
			return row;
		}
}
