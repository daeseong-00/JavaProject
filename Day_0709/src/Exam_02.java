//형변환 예제
public class Exam_02 {

	public static void main(String[] args) {
		char ch = 'A';//한문자'' 또는 정수(65000)
		int in1 = 65;
		double do1 = 3.14;
		
		int chInt = ch;//문자를 정수로 형 변환(자동)
		//문자 A에 해당하는 정수 65가 저장됨
		System.out.println("chInt = " + chInt);
		
		char intCh = (char)in1;//4byte -> 2byte는 강제로 형변환
		System.out.println("intCh = " + intCh);
		int a = 75000;
		char intCh1 = (char)a;
		System.out.println("intCh1 = " + intCh1);
		
		int intA = 100;
		double intDouble = intA;// 떠블이 더 크니까 자동형변환
		System.out.println("intdouble = " + intDouble);
		
		double doubleA = 3.14;
		int doubleInt = (int)doubleA;// 반대의 경우는 강제형변환
		System.out.println("doubleInt = " + doubleInt);//소숫점은 안나옴
		
	}

}
