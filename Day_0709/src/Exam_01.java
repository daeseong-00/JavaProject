/*자바 기본타입 : 8가지
 * 논리 : boolean(1byte)
 * 정수 : byte(1),short(2),char(2),int(4),long(8)
 * 실수 : float(4),double(8)
 * 형변환(자동, 강제) 큰거->작은거로 넣을 때는 강제로
 * 참조타입 : 클래스(String), 배열
 */

	

public class Exam_01 {

	public static void main(String[] args) {
		boolean bool = true;// True 는 안됨
		byte by = 120;//-128 ~ 127
		short sh = 12345;//-32000 ~ 32000
		char ch1 = 65;// 음수는 저장안됨
		char CH2 = 'A';// 정수는 0 ~ 65000까지, 문자도 가능
		
		
		int in1 = 700000;// -20억 ~ 20억
		int in2 = 'A'; //자동 형변환
		
		//float f11 = 3.14;// 실수의 기본은 double
		float f12 = 3.14f;
		float f13 = (float)3.14;//강제 형변환
		
		double do1 = 3.14;
		
		System.out.println("bool = " + bool);
		System.out.println("by = " + by);
		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + CH2);
		System.out.println("in1 = " + in1);
		System.out.println("in2 = " + in2);
		System.out.println("f12 = " + f12);
		System.out.println("f13 = " + f13);
		System.out.println("do1 = " + do1);
				
		

	}

}
