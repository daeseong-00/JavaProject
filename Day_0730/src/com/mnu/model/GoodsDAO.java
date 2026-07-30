package com.mnu.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.util.DBManager;

public class GoodsDAO {

	private GoodsDAO() {}
	private static GoodsDAO instance = new GoodsDAO();
	public static GoodsDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public int goodsWrite(GoodsDTO gDTO) {
		
		int row = 0;
		
		String sql="insert into tbl_goods(pcode,pname,pcost,stock)\r\n "
				+ "values(?,?,?,?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, gDTO.getPcode());
			pstmt.setString(2, gDTO.getPname());
			pstmt.setInt(3, gDTO.getPcost());
			pstmt.setInt(4, gDTO.getStock());
			
			row = pstmt.executeUpdate();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return row;
	}
		
		//상품목록 검색 메소드
	public List<GoodsDTO> goodsList(){
		List<GoodsDTO> gList = new ArrayList<GoodsDTO>();
		
		String sql = "select pcode,pname,pcost,stock from tbl_goods";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				GoodsDTO dto = new GoodsDTO();
				dto.setPcode(rs.getString("pcode"));
				dto.setPname(rs.getString("pname"));
				dto.setPcost(rs.getInt("pcost"));
				dto.setStock(rs.getInt("stock"));
				
				gList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return gList;
	}
}

