import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String na = scn.next();
		System.out.print("국어 : ");
		int kor = scn.nextInt();
		System.out.print("수학 : ");
		int mat = scn.nextInt();
		System.out.print("영어 : ");
		int eng = scn.nextInt();
		
		int tot = kor + mat + eng;
		double ave = tot / 3;
		
		System.out.println("이름\t총점\t평균");
		System.out.print(na + "\t" + tot + "\t" + ave);
		

	}

}
