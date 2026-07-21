
public class Student {

	int hakbun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	String grade;
	
	Student(){}
	
	Student(int hakbun,String name,int kor,int eng,int mat){
		this.hakbun=hakbun;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
	}
	//총점,평균,학점을 구하는 메소드 구현
	void totAve() {
		tot = kor+eng+mat;
		ave = (double)tot/3.;
	}
	
	//학점을 구하여 반환하는 메소드
	String studentGrade() {
		String grade="F";
		
		
		return grade;
	}
	 
}
