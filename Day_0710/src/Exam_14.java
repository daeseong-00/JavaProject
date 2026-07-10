//키보드 이름, 국어, 영어, 수학 점수를 입력 총점, 평균을 구하여
//최대점수, 최소점수를 출력
/* 입력 : 홍길동 90 80 70 60
 * 
 * 출력
 * 이름 : 
 * 총점 : 
 * 평균 : 
 * 최대점수 : 
 * 최소점수 : 
 * 
 */

import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력 : ");
		String na = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sci = scn.nextInt();
		
		int tot = kor+eng+mat+sci;
		double ave = (int)(tot/4.*100+0.5)/100.;
		
		int max = kor;
		int min = kor;
		
		if(max<eng) {//최대
			max=eng;
		}else if(min>eng) {//최소
			max=eng;
		}
		if(max<mat) {
			max=mat;
		}else if(min>mat) {
			max=mat;
		}
		if(max<sci) {
			max=sci;
		}else if(min>sci) {
			max=sci;
		}
			
		System.out.println("이름 : " + na);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("최대점수 : " + max);
		System.out.println("최대점수 : " + min);
	}

}
