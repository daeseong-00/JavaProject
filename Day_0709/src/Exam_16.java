/* 키보드로 이름 국어 영어 수학 점수를 입력. 총점, 평균, 판정을 구하여 출력
 * 1.입력은 한줄로 입력
 * 입력 이학생 00 00 00
 * 2.평균은 소수점3자리에서 반올림
 * 3.판정은 3과목 모두 60점 이상, 평균 80점이상 "합격", "불합격"
 * 4.출력
 *   이름   총점   평균   판정
 *   ㅇㅇㅇ  222   77   합격
 */

import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력");
		String na = scn.next();
		int kr = scn.nextInt();
		int en = scn.nextInt();
		int ma = scn.nextInt();
		int tot = kr + en + ma;
		//double p = (int)(tot /3. * 100+0.5)/100.;//이것도 소숫점 3자리에서 반올림;
		double p = tot/3.;
		String str = "";
		if(p>=80 && kr>=60 && en>=60 && ma>=60) {
			str="합격";
		}else {
			str="불합격";
		}
		
		System.out.println("이름\t총점\t평균\t판정");
		System.out.println(na + "\t" + tot + "\t" + String.format("%.3f",p)+ "\t" + str);
		
		
		
		

	}

}
