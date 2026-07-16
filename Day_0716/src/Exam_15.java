//재귀(Recursion) 함수
public class Exam_15 {
	static void test(int n) {
		if(n==0)
			return;
		System.out.println("Hello World!");
		test(n-1);// 이대로 하면 무한으로 호출해서 무한굴레
	}
	
	public static void main(String[] args) {
		
		test(5);
	}

}
