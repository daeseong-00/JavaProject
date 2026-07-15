
public class Exam_08 {
	public static void main(String[] args) {
		int[][] score = {{1,90,80,70,0},{2,90,90,90,0},
				{3,80,80,70,0},{4,78,88,95,0},{5,90,95,85,0}};
		//5*5 
		//총점 
		
		/*score[0][4]=score[0][1]+score[0][2]+score[0][3];
		score[1][4]=score[0][1]+score[0][2]+score[0][3];
		score[2][4]=score[0][1]+score[0][2]+score[0][3];
		score[3][4]=score[0][1]+score[0][2]+score[0][3];
		score[4][4]=score[0][1]+score[0][2]+score[0][3];
		>>>for 문으로 돌리면 끝;
		*/ 
		
		for(int i=0; i<score.length; i++) {
			for(int j=1; j<4; j++) {
				score[i][4]+=score[i][j];
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(score[i][4]/3.);
			System.out.print("\n");
		}
	}

}
