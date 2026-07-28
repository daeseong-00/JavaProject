package com.mnu.exam03;

public class Exam_14 {
	public static void main(String[] args) {
		String str1 = "자바프로그래밍";
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		for(int i=0; i<str1.length(); i++) {
			char ch1 = str1.charAt(i);
			System.out.print(ch1 + "\n");
		}
		
		String str2="Korea";
		String str3="Korea";
		String str4="Seoul";
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareTo(str4));
		
		
		String str5="";
		for(int i=0; i<10; i++) {
			str5 +=i;
		}
		System.out.println(str5);
		
		String str6="";
		for(int i=0; i<10; i++) {
			str6 = str6.concat(""+i);
		}
		System.out.println(str6);

		
		String str7="hello goodbye";
		boolean bool = str7.contains("good");
		System.out.println(bool);
		
	//	String str8 = String.format("%d 더하기 %d는 %d입니다", 123456);
		String str9 = String.format("%d 더하기 %d는 %d입니다", 3,5,3+5);
		System.out.println(str9);
		
		String str10 = String.format("%7.2f", 3.12567);
		System.out.println(str10);
		
		String str11 = "Jaba&JSP Programming 프로그래밍";
		str11.indexOf('a');
		str11.indexOf('프');
		System.out.println(str11.indexOf('프'));
		
		String str12 ="";
		if(str12.isEmpty()) {
			System.out.println("OK");
			
		String str13 = "안녕하세요";
		int cnt = str13.length();
		System.out.println(cnt);
		
		String str14="1,aaaa,90,80,90";
		String hak[] = str14.split(",");
		
		
		}
	}

}
