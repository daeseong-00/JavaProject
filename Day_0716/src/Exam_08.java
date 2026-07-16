
public class Exam_08 {
//1~n 까지 정수 출력하는 메소드
	static void add() {
		int s=0;
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
			s+=i;
		}
		System.out.println("=" + s);
	}
	//1~n 까지 정수합 반환
		static void addSum(int n) {
			int s=0;
			for(int i=1; i<=10; i++) {
				System.out.print(i + " ");
				s+=i;
			}
		
		}	
	public static void main(String[] args) {
		add();
		
		
		addSum(100);
		

	}

}
