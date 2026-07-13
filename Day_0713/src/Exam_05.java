
public class Exam_05 {

	public static void main(String[] args) {
		//1~10까지 정수 출력
		int s=0;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			s=s+i;
		}
		System.out.println("1~10합 : " + s);

		
		
		
		//1~10홀수 출력후 합
		int t=0;
		for(int j=1; j<=10; j+=2) {
			System.out.println(j);
			t+=j;
		}
		System.out.println("1~10 홀수 합: " + t);
		
		int tt = 0;
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
			tt += i;
		}
		System.out.print("1~10 짝수 합: " + t);
		
	}

}
