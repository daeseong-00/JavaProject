
/* 키보드 입력 Scanner 클래서 도움으로 입력
 * 정수, 실수, 문자열 구분하여 입력 가능
 */
import java.util.Scanner; // 임포트는 클래스 위에 있어야 적용 ctrl + shift + o 
public class Exam_05 {

	public static void main(String[] args) {
		//개체 생성(클래스를 이용하여 객체 생성)
		Scanner scn; // => 스캐너만 저장가능
		scn = new Scanner(System.in);//객체 생성
		
		Scanner scn2 = new Scanner(System.in); //위에거 한문장으로 가능
	
		System.out.print("이름 국어 영어 수학 입력하시오");
		String name = scn.next();
		int k = scn.nextInt();
		int e = scn.nextInt();
		int m = scn.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + k);
		System.out.println("수학 : " + m);
		System.out.println("영어 : " + e);
		System.out.println("총점 : " + (k+m+e));
		System.out.println("평균 : " + (k+m+e)/3);
		


}

}
