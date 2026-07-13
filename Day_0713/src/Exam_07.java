import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 입력 : ");
		int dec = scn.nextInt();
		
		for(int x=1; x<=dec; x++) {
			if(dec % x ==0) {
				System.out.println(x);
			}
		}
		
		System.out.println(dec + "의 약수 : ");
		for(int y=1; y<=dec; y++) {
			if(dec % y==0) {
				System.out.print(y + ",");
			}
		}
		

	}

}
