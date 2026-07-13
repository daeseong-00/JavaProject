//while(),do~while()차이점
public class Exam_13 {

	public static void main(String[] args) {
		int a=0,b=0;
		while(a>5) {
			a++;
			System.out.println(a);
		}
		
		do {
			b++;
			System.out.println(b);
		}while(b>5);

	}//while은 조건검사에서 컷
	//do while은 한번은 돌고 조건검사해서 한번은 동작

}
