/* 키보드로 7개의 점수를 입력 최대, 최소, 합계(합계-최대-최소)
 * 출력하는 프로그램 작성
 * 입력 : 9 5 8 6 3 7 6
 * 최대 : 
 * 최소 : 
 * 합계(합계-최대-최소) : (44-9-3) = 32
 * for(), while()
 */

import java.util.Scanner;

public class Exam_20 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력");
		int sc = scn.nextInt();
		int max = sc;
		int min = sc;
		int sum = sc;
		
		for(int i=1; i<=6; i++) {
			sc = scn.nextInt();
			if(max<sc) {
				max=sc;
			}else if(min>sc) {
				min=sc;
			}
			sum+=sc;
		}
		
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합계(합계-최대-최소) : " + (sum-max-min));

}
}
