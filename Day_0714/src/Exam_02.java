import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int pay = scn.nextInt();
		int mon = 50000;
		System.out.printf("급여 : %7d\n",pay);
		for(int i=1; i<=10; i++) {
			System.out.printf("%5d : ",mon);
			int mok = pay/mon;
			System.out.printf("%3d\n",mok);
			pay%=mon;
			if(i%2==1) {
				mon = mon/5;
			}else {
				mon = mon/2;
			}
			if(pay==0)
				break;
		}

	}

}
