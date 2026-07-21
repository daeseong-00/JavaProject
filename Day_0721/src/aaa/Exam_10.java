package aaa;

class Exam_10 {

	public static void main(String[] args) {
		//키보드 입력
		int hak = 1101;
		String na="홍길동";
		boolean gen = true;
		int age = 22;
		int kor = 90;
		int eng = 80;
		int mat = 70;
		
		Student stu1 = new Student();
		stu1.setHak(hak);
		stu1.setNa(na);
		stu1.setGen(gen);
		stu1.setAge(age);
		stu1.setKor(kor);
		stu1.setEng(eng);
		stu1.setMat(mat);
		
		//초기화
		Student stu2 = new Student(1102,"이이이",false,30,77,88,99);
		//출력
		//학번 이름 성별 나이 국 영 수 총점 평균
		System.out.println("학번\t이름\t성별\t나이\t국\t영\t수\t총점\t평균");
		String str="여성";
		if(stu1.isGen())
			str="남성";
		
		int tot = stu1.getKor()+stu1.getEng()+stu1.getMat();
		double ave = tot/3.;
		System.out.print(stu1.getHak()+"\t"+stu1.getNa()+"\t");
		System.out.print(stu1.getAge()+"\t"+str+"\t");
		System.out.print(stu1.getKor()+"\t"+stu1.getEng()+"\t");
		System.out.print(stu1.getMat()+"\t"+tot+"\t");
		System.out.print(ave + "\n");
		
		String str2="여성";
		if(stu1.isGen())
			str2="남성";
		
		int tot2 = stu2.getKor()+stu2.getEng()+stu2.getMat();
		double ave2 = tot2/3.;
		System.out.print(stu2.getHak()+"\t"+stu2.getNa()+"\t");
		System.out.print(stu2.getAge()+"\t"+str2+"\t");
		System.out.print(stu2.getKor()+"\t"+stu2.getEng()+"\t");
		System.out.print(stu2.getMat()+"\t"+tot2+"\t");
		System.out.print(ave2 + "\n");
	}

}
