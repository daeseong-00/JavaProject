//행열
public class Exam_26 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
				
			}
		for(int k=1; k<=(6-i)*2-1; k++) {
			System.out.print("*");
		}
		System.out.print("\n");
		}
		
	}	
}
