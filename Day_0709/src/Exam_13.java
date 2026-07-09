//키보드로 정수를 입력 받아서 80이상이면 "Pass"를 출력

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력");
		int sc = scn.nextInt();
		
		if(sc>=80) {
			System.out.println("Pass");
		}
		System.out.println("시스템을 종료합니다.");
		

	}

}
