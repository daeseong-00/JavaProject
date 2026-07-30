package com.mnu.exam02;

import java.util.List;

import com.mnu.model.GoodsDAO;
import com.mnu.model.GoodsDTO;

public class GoodsList {
	public static void main(String[] args) {
		GoodsDAO dao = GoodsDAO.getInstance();
		
		List<GoodsDTO> list = dao.goodsList();
		
		System.out.println("상품코드\t상품명\t단가\t재고수량");
		if(!list.isEmpty()) {
			for(GoodsDTO dto : list) {
				System.out.print(dto.getPcode()+"\t");
				System.out.print(dto.getPname()+"\t");
				System.out.print(dto.getPcost()+"\t");
				System.out.print(dto.getStock()+"\n");
			}
		}else {
			System.out.println("등록된 상품이 없습니다");
		}

	}

}
