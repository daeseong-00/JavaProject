//키보드로 정수를 입력 받아서 80이상이면 "합격", 아니면 "불합격"를 출력

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int sc = scn.nextInt();
		
		String str = "";
			if(sc>=80) {
				str="합격";
			}else {
				str="불합격";
			}
			System.out.println(sc + "점 = " + str);
		

	}

}
