import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력 : ");
		
		int pay = scn.nextInt();
		int mon = 50000;
		
		for(int i=1; i<=10; i++) {
			System.out.print(mon + "원 : ");
			int mok = pay/mon;
			System.out.println(mok);
			pay=pay%mon;
			if(i%2==1) {
				mon/=5;//mon=mon/5	
			}else {
				mon/=2;//mon=mon/2
			}if(pay==0) {
				break;
			}
			
			
		}


	}

}
