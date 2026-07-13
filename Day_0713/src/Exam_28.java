/*	1  2  3  4  5
 * 	6  7  8  9  10
 * 	11 12 13 14 15
 * 
 */
public class Exam_28 {
	public static void main(String[] args) {
		int cnt=0;
		
		for(int i=1; i<=5; i++) {
			int sum=0;//여기서 초기화하고 다시 계산 for문 밖에 만들면 누적계산됨.
			for(int j=1; j<=5; j++) {
				cnt++;
				sum +=cnt;
				System.out.printf("%5d",cnt);
				
			}
			System.out.printf("%5d",sum);
			System.out.print("\n");
		}

	}

}
