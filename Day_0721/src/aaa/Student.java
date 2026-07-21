package aaa;
//학번, 이름, 성별,나이,국,영,수
public class Student {
	private int hak;
	private String na;
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	private int age;
	private boolean gender;
	private int kor;
	private int eng;
	private int mat;
	private int tot = kor+eng+mat;
	private double ave = tot/3.;
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
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAve() {
		return ave;
	}
	public void setAve(double ave) {
		this.ave = ave;
	}
}
