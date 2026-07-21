package aaa;

import java.util.Scanner;

//이렇게하면 패키지의 모든 클래스 가져올 수 있음
import kr.ac.mnu.car;

public class Exam_07 {

	public static void main(String[] args) {
		Test t1 = new Test();
		car c1 = new car();//다른 패키지에 있는 클래스는 임포트 ctrl+shift+O
		Scanner scn = new Scanner(System.in);
	}

}
