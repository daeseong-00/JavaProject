
public class Exam_18 {
	//1~10 홀수 합을 반환하는 함수
	static int funcAdd(int num) {
		if(num%2==1) {
			if(num==1)
				return 1;
			return num + funcAdd(num-1);
		}else {
			return funcAdd(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.print(funcAdd(10));

	}

}
