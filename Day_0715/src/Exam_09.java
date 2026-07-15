
public class Exam_09 {
	public static void main(String[] args) {
		int arr [][] = new int[5][5];
		
		int cnt=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.print("\n");
		}
	}

}
