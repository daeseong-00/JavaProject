//

import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 입력(1~200)");
		//String str = scn.next();
		int a = scn.nextInt();
		if(a<1 || a>200) {
			System.out.println("입력오류");
			System.exit(1);
		}
		if(a>='A' && a<='Z') {
			System.out.println("대문자 : " + (char)a);
		}
		if(a>='a' && a<='z') {
			System.out.println("소문자 : " + (char)a);	
		}
	
	}	

}
