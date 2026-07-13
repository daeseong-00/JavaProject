//1~10까지 홀수 합, 짝수 합
public class Exam_06 {

	public static void main(String[] args) {
		int s=0;
		int t=0;
		int tot =0;
		for(int i=1; i<11; i++) {
			System.out.println(i);
			if(i%2==1) {
				s+=i;
			}else {
				t+=i;
			}
			tot += i;	
			
		}

		System.out.println("1~10 합" + tot);
		System.out.println("1~10 홀수합" + s);
		System.out.println("1~10 짝수합" + t);
	}

}
