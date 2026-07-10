import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기 : ");
		int a = scn.nextInt();//정수
		String op = scn.next();//연산자
		int b = scn.nextInt();//정수
		
		int result=0;
		switch(op) {
		case "+":
			result = a+b;
			break;// switch 에서는 브레이크 안넣으면 다음것까지 계산해버림;
		case "-":
			result = a-b;
			break;
		case "*":
			result = a*b;
			break;
		case "/":
			result = a/b;
			break;
		case "%":
			result = a%b;
			break;
		default:
			System.out.println("연산자 오류");
			//System.exit(0);//다음 처리할게 있는데 여기서 끝나면 안되는 경우는 exit 사용하면 X
			
		}
		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")
				 || op.equals("%")) {
		System.out.println(a + op + b + "=" + result);
		}
	}

}
