//행열
public class Exam_22 {
	public static void main(String[] args) {
		// 5*5 행열
		for(int i=1; i<=5; i++) {//줄(row)
			
			for(int j=1; j<=5; j++) {//칸(col)
				System.out.print("*"+j);
			}
			System.out.print("\n");
		}

		
		
		System.out.println("_____________________");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
	}

		
	}	
}
