package aaa;
//학번, 이름, 성별,나이,국,영,수
public class Student {
	private int hak;
	private String na;
	private boolean gen;
	private int age;
	private int kor;
	private int eng;
	private int mat;
	
	
	public Student() {}
	
	public Student(int hak, String na, boolean gen, int age, int kor, int eng, int mat) {
		this.hak=hak;
		this.na=na;
		this.gen=gen;
		this.age=age;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}

	public boolean isGen() {
		return gen;
	}

	public void setGen(boolean gen) {
		this.gen = gen;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
}
