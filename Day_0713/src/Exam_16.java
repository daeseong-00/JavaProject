import java.util.Scanner;

public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max=0, min=101;
		System.out.print("점수입력 : ");
		while(true) {
			int score = scn.nextInt();
			if(score==-99) {
				break;
			}
			if(max<score) {
				max=score;
			}
			if(min>score) {
				min=score;
			}
		}
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);

	}

}
