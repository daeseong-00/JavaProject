import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력 : ");
		int pay = scn.nextInt();
		int mon = 50000;
		System.out.printf("급여 : %7d\n",pay);
		boolean flag = true;
		
		while(pay !=0) {
			System.out.printf("%5d : ",mon);
			int mok=pay/mon;
			System.out.printf("%3d : ",mok);
			pay=pay%mon;
			
			if(flag) {
				mon=mon/5;
				flag=false;
			}else {
				mon=mon/2;
				flag=true;
			}
		}

	}

}
