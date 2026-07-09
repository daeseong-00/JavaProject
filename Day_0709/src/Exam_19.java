/* 키보드로 이름 국어 영어 수학 점수를 입력. 총점, 평균, 판정을 구하여 출력
 * 1.입력은 한줄로 입력
 * 입력 이학생 00 00 00
 * 2.평균은 소수점3자리에서 반올림
 * 3.판정은 3과목 모두 60점 이상, 평균 80점이상 "합격", "불합격"
 * 4.불합격 사유 출력
 *   - 한과목 이라도 60미만인 경우 "과락"
 *   - 3과목 모두 60 이상이나 평균이 80미만이라면 "평균미만"
 *   
 * 5.출력
 *   이름   총점   평균   판정  불합격사유
 *   ㅇㅇㅇ  222   77   합격
 */

import java.util.Scanner;

public class Exam_19 {

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
		
		String pass = "";
		String no = "";
		
		if(p>=80 && kr>=60 && en>=60 && ma>=60) {
			pass="합격";
		}else{
			pass="불합격";
			if(kr<60 || en<60 || ma<60) {
				no = "과락";}
			if(p<80) {
				no="평균미만";}		
		}
		
		System.out.println("이름\t총점\t평균\t판정\t불합격사유");
		System.out.println(na + "\t" + tot + "\t" + String.format("%.3f",p)+ "\t" + pass + "\t" + no );

	}

}
