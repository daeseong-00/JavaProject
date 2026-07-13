import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력");
		
		int a = scn.nextInt();
		if(a<1 || a>15) {
			System.out.println("입력오류");
			System.exit(1);
		}
		
		int b = a/16;
		int c=a%16;
		
		String con= "";
		if(c==10) {
			con = "A";
		}else if(c==11) {
			con = "B";
		}else if(c==12) {
			con = "C";
		}else if(c==13) {
			con = "D";
		}else if(c==14) {
			con = "E";
		}else if(c==15) {
			con = "F";
		}else {
			con = c+"";
		}
		System.out.println("10진수 : " + a);
		System.out.print("16진수 : " + con);
		
		
		
		
		
	}

}
