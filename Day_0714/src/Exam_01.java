import java.util.Scanner;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = scn.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.printf("%4d",i);
			if(i%10==0) {
				System.out.print("\n");
			}
			if(i%2==1) {
				sum += i;
			}
		}
			System.out.println("홀수 합 : " + sum);

	}

}
