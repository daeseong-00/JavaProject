import java.util.Scanner;

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수입력 : ");
		int score = scn.nextInt();
		int max = score;
		int min = score;
		while(true) {
			score = scn.nextInt();
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
