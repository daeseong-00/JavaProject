import java.util.Scanner;

public class Exam_02 {

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
		
		switch(c) {
			case 10:
				con="A";
				break;
			case 11:
				con="B";
				break;
			case 12:
				con="C";
				break;
				
			case 13:
				con="D";
				break;
			case 14:
				con="E";
				break;
			case 15:
				con="F";
				break;
		}
		System.out.println("10진수 : " + a);
		System.out.print("16진수 : " + con);
		
		
		
		
		
	}

}
