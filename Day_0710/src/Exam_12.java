/* 키보드로 이름 국어 영어 수학 입력 총점 평균 등급을 구하여 출력
 * 등급은 100~90 수, 89~80 우, 79~70 미, 69~60 양, 59~0 가
 * [입력형식]
 * 입력 : 이학생 90 77 85
 * 
 * [출력형식]
 * 이름 : 이학생
 * 총점 : xxx
 * 평균 : xx.xx
 * 등급 : x
 * 
 * if()만 사용
 */

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력 : ");
		String na = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int tot = kor+eng+mat;
		double ave = (int)(tot/3.*100+0.5)/100.;
		String gr="가";
		
		int menu = (int)ave/10;
		switch(menu) {
		case 10:
		case 9:
			gr="수";
			break;
		case 8:
			gr="우";
			break;
		case 7:
			gr="미";
			break;
		case 6:
			gr="양";
			break;//가는 맨위에 넣어두어서 안해도 됨.
	
		}
		
		
		
		System.out.println("이름 : " + na);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("등급 : " + gr);
		
		

	}

}
