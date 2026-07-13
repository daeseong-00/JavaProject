//키보드로 이름,국어,영어,수학 점수를 입력 총점, 평균을 구하여 출력하는 프로그램 작성
// 3과목 60이상, 평균 80이상"합격", 아니면 "불합격"
// 불합격인 경우 불합격 사유 과락 or 평균미만

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		
		String na = scn.next();
		int kr = scn.nextInt();
		int en = scn.nextInt();
		int ma = scn.nextInt();
		
		int tot = kr+en+ma;
		double ave = tot/3.;
		
		String re = "";
		String why = "";
		if(kr>=40 && en>=40 && ma>=40 && ave>=80) {
			re = "합격";
		}else {
			re = "불합격";
			if(kr<40 || en<40 || ma<40) {
				why = "과락";
			}else {
				why = "평균미만";
			}
			
		}
		
		
		System.out.println("이름 : " + na);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("판정 : " + re);
		if(re.equals("불합격")) {
		System.out.println("사유 : " + why);
		}
	}

}
