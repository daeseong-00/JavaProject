//2. 키보드로 점수 2개 입력, 입력된 점수가 80 ~ 90 사이면 "Pass"
// 아니면"NoPass"

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		System.out.println("점수 입력");
		
		String hak = "";
		if(val>=90) {
			hak="수";
		}else if(val>=80) {
				hak="우";
			}else if(val>=70) {
					hak="미";
			}else if(val>=60) {
					hak="양";
			}else {
				hak="가";}
	}

}
