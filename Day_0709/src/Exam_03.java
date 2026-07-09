//키보드 입력(Scanner 클래스)
/* 객체 생성
 * Scanner 변수명 = new Scanner(System.in);
 * 메소드 : next() -> 문자열 입력
 * 		  nextInt() -> 정수입력
 * 		  nextDouble, Boolean 
 *        but, char는 없음.
 */

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//키보드로 이름, 국어, 영어, 수학점수를 입력
		//총점, 평균(실수)을 구하여 출력
		//한줄에서 모두 입력시
		System.out.print("학생 입력 : ");
		String na = scn.next(); //이름
		int kor = scn.nextInt();//국어
		int eng = scn.nextInt();//영어
		int mat = scn.nextInt();//수학
		
		int tot = kor + eng + mat;//결과 정수
		double ave = tot/3.;//결과가 실수 3뒤에 . 안붙이면 정수로 나옴
		
		System.out.println("이름 : " + na);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		
		
		

	}

}
