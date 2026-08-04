package com.mnu.exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set 인터페이스; 클래스 : HashSet
public class Exam_02 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("이사람");
		set.add("김사람");
		set.add("박사람");
		set.add("최사람");
		set.add("이사람");
		//순서가 없고 중복안됨
		System.out.println("객체 확인 : " + set);
		//1.확장 for()
		for(Object obj : set) {
			System.out.print(obj+"  ");
		}
		System.out.print("\n");
		//2.반복자 Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {//존재하면
			System.out.print(iter.next()+"  ");
		}
		
		//3. ArrayList 변환 후
		List list = new ArrayList(set);
		
		
	}

}
