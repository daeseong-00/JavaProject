//행열
public class Exam_23 {
	public static void main(String[] args) {
		// 5*5 행열
		for(int i=1; i<=5; i++) {//줄(row)
			System.out.print(i+" : ");
			for(int j=1; j<=6-i; j++) {//칸(col)
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for(int i=5; i>=1; i--) {//줄(row)

			for(int j=1; j<=i; j++) {//칸(col)
				System.out.print("*");
			}
			System.out.print("\n");
		}

		
	}	
}
