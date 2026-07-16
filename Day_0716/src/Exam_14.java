
public class Exam_14 {
	//총점을 구하는 메소드
	static void arrTot(int [][] vvv) {
		for(int i=0; i<vvv.length; i++) {
			vvv[i][4]=vvv[i][1]+vvv[i][2]+vvv[i][3];
		}
	}
	//석차계산 메소드
	static void arrRank(int [][] a) {
		for(int i=0; i<a.length; i++) {
			a[i][5]=1;
			for(int j=0; j<a.length; j++) {
				if(a[i][4]<a[j][4])
					a[i][5]++;
			}
		}
	}
	//Sort 메소드
	
	//출력 메소드
	static void arrPrint(int [][] a) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(a[i][j] + "\t");	
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		//번호, 국어, 영어, 수학, 총점, 석차
		int[][] arr= {{1,90,70,50,0,0},{5,90,70,50,0,0},
				{2,90,70,50,0,0},{3,90,70,50,0,0},{4,90,70,50,0,0}};
		//총점을 구하는 메소드 호출
		arrTot(arr);
		arrPrint(arr);
		//순위를 구하는 메소드 호출
		arrRank(arr);
		arrPrint(arr);
		//순위를 기준으로 오름차순하는 메소드
		
		//출력메소드
		arrPrint(arr);
		
		}

	}


