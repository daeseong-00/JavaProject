//키보드로 실수를 입력 입력된 값이 85 ~ 95사이면 "Pass"
//아니면 "No" 출력하는 프로그램 작성

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력하세요");
		
		double sil = scn.nextDouble();
		String str = (sil>=85 && sil<=95 ? "Pass" : "No");
		System.out.println(sil + "는 " + str + "입니다.");
		
		boolean bool1 = sil>=85;
		boolean bool2= sil<=95;
		String str2 = (bool1 && bool2) ? "Pass" : "No";
		System.out.println(sil + "는 " + str2 + "입니다.");
		
		
		
		

	}

}
