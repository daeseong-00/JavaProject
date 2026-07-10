//2. 키보드로 점수 2개 입력, 입력된 점수가 80 ~ 90 사이면 "Pass"
// 아니면"NoPass"

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("입력");
		int sc = scn.nextInt();
		
		//&& 사용시
		if(sc>=80 && sc<=90) {
			System.out.println("Pass");
		}else {
			System.out.println("Nopass");
		}
		
		//&& 미사용시
		if(sc>=80) {
			if(sc<=90) {
				System.out.println("&& 미사용 시 Pass");
			}else {
				System.out.println("&& 미사용 시 NoPass");
			}
		}else {
			System.out.println("&& 미사용 시 NoPass");
		}
		//
	}

}
