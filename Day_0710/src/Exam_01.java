import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 2개 입력");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		/*
		if(a>b) {
			System.out.println(a + ">" + b);
		}
		if(a<b) {
			System.out.println(a + "<" + b);
		}else {
			System.out.println(a + "==" + b);
		}
		*/
		
		if(a>b) {
			System.out.println(a + ">" + b);
		}else {
			if(a<b) {
				System.out.println(a + "<" + b);
			}else {
				System.out.println(a + "==" + b);
			}
		}

 }
}