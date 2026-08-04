package com.mnu.exam01;

import java.util.HashSet;
import java.util.Set;

public class Exam_04 {

	public static void main(String[] args) {
		Set<DeptDTO> set = new HashSet();
		
		set.add(new DeptDTO(10,"aaa","a001"));
		set.add(new DeptDTO(20,"bbb","b001"));
		set.add(new DeptDTO(10,"aaa","a001"));
		set.add(new DeptDTO(30,"ccc","c001"));
		
		System.out.println("객체 수 : " + set.size());

		
	}

}
