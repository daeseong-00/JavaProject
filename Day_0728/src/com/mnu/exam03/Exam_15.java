package com.mnu.exam03;

public class Exam_15 {
	public static void main(String[] args) {
		String str = "951027-1234567";//주민번호
		// 0123456789
		//문자열 길이
		int len = str.length();
		System.out.println("문자열 길이 = " + len);//14
		//나이 계산(2025-출생년도)
		int year = Integer.parseInt(str.substring(0,2)) + 1900;
		int age = 2025-year;
		System.out.println("나이 = " + age);//30
		//성별 체크 - 1
		String g = str.substring(7,8);//7번부터 8번전까지
		String gender="여자";
		if(g.equals("1")) {
		gender="남자";
		}
		System.out.println("성별 1 = " + gender);//남자
		//성별체크 - 2//문자열 위치 indexOf()
		int index = str.indexOf("-");//6
		//7번부터 8번전까지
		String g2 = str.substring(index+1,index+2);
		String gender2="여자";
		if(g2.equals("1")) {
		gender2="남자";
		}
		System.out.println("성별 2 = " + gender2);//남자
		//성별체크 - 3//charAt(index)=> char
		int index2 = str.indexOf("-");//6
		char gen = str.charAt(index2+1);
		String gender3="여자";
		if(gen=='1') {
		gender3="남자";
		}
		System.out.println("성별 3 = " + gender3);//남자
		}
		}
