package com.mnu.exam02;

import java.util.Scanner;

import com.mnu.model.GoodsDAO;
import com.mnu.model.GoodsDTO;


public class GoodsWrite {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("상품코드");
		String pcode = scn.next();
		System.out.print("상품명");
		String pname = scn.next();
		System.out.print("상품단가");
		int pcost = scn.nextInt();
		System.out.print("재고수량");
		int stock = scn.nextInt();
		
		GoodsDAO dao = GoodsDAO.getInstance();
		GoodsDTO dto = new GoodsDTO();
		dto.setPcode(pcode);
		dto.setPname(pname);
		dto.setPcost(pcost);
		dto.setStock(stock);
		
		int row = dao.goodsWrite(dto);
		if(row==1) {
			System.out.print("상품등록 성공");
		}else
			System.out.print("상품등록 실패");
		
		


	}

}
