import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력");
		int val = scn.nextInt();
		
		String str = "";
		if(val>=80) {
			if(val<=90) {
				str = "80~90 Pass";			
			}else {
				str = "80이상 90 초과 No";
			}
		}else {
			str = "80미만 No";
		}
		System.out.print(val + "점수의 결과는 " + str);
				

	}

}
