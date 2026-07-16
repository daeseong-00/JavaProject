
public class Exam_11 {
	//메소드 오버로딩(메소드 이름은 동일, 매개변수 개수, 타입, 순서가 달라야함)
	static void add(int a, int b) {
		
	}
static void add(int a, int b, int c) {
		
	}
static void add(int a, int b, int c, int d) {
	
}
//가변인자는 연속으로 안됨. 배열으로 인식
static void sum(int ... a) {
	int s=0;
	for(int i=0; i<a.length; i++) {
		
	}
}
	public static void main(String[] args) {
		sum(1,2,3);
		sum(1,2,3,4,5,6,7,8,9);

	}

}
