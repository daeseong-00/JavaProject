
public class Exam_04 {

	public static void main(String[] args) throws Exception {

		//표준 입력 : System.in.read(); -> 이거 쓰려면 throws Exception이 있어야함
		//system(클래스).in(속성).read()(메소드)
		System.out.print("문자를 입력하세요");
		System.out.println("입력된 글자는 " + (char)System.in.read());
		System.out.println("입력된 글자는 " + (char)System.in.read());
		System.out.println("입력된 글자는 " + (char)System.in.read());
	}

}
