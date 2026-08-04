package com.mnu.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam_05 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "홍길동");
		map.put("B", "이길동");
		map.put("C", "이길동");
		map.put("A", "오길동");
		map.put("D", "최길동");
		
		System.out.println("객체 수 : " + map.size());
		System.out.println("객체 : " + map);
		
		System.out.println("키 A 값 : " + map.get("A"));
		
		//키값만 추출
		Set KeySet = map.keySet();
		for(Object obj : KeySet) {
			System.out.println(obj + " : " + map.get(obj));
		}
		
		//람다식을 이용한 출력
		map.forEach((key,value)->{
			System.out.println(key + ":" + value);
		});
		
	}

}
