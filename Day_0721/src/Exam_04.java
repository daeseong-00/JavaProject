class AA{
	static int a=100;
	int b=200;
	
}
public class Exam_04 {
	public static void main(String[] args) {
	AA.a=1000;
	AA a1= new AA();
	System.out.println("a=" + a1.a);
	System.out.println("b=" + a1.b);
	
	System.out.println("a=" + AA.a); //=> static 을 쓰면 뉴 안만들고도 접근가능
	//System.out.println("b=" + AA.b);
	
	AA a2 = new AA();

	}

}
