//화폐단위별 매수출력
//5만 1만 5천 1천 500 100 50 10 5 1
//176874 => 5만x3 -> 26874 ....
public class Exam_08 {

	public static void main(String[] args) {
		int pay = 176847;
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
			}
			
			
		}


}
}