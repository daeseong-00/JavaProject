
public class Exam_08 {

	public static void main(String[] args) {
		int dec = 1234;
		String con = "";
		int mok = dec / 1000;
		con = mok + con;
		dec = dec % 1000;
		mok = dec / 100;
		con = mok + con;
		dec = dec % 100;
		mok = dec / 10;
		con = mok +con;
		dec = dec % 10;
		mok = dec / 1;
		con = mok +con;
		System.out.print(con);
		
	}

}
