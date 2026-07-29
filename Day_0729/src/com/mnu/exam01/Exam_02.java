package com.mnu.exam01;

public class Exam_02 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append("Program");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		sb.delete(0, 4);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(0,"Java P");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		sb.replace(0, 3, "AAA");
		sb.reverse();
		System.out.println(sb);

	}

}
