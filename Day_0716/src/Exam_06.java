//2차원 배열의 정렬 5*6
//번호, 국어, 영어, 수학, 총점, 석차
//0    1    2    3    4    5
public class Exam_06 {
	public static void main(String[] args) {
		//int st[][] = new int[5][6]
		int st[][]= {{1,90,80,70,0,0},{5,70,86,75,0,0},
				{3,95,88,77,0,0},{4,70,78,97,0,0},
				{2,87,85,75,0,0}};
		
		//총점 계산
		for(int i=0; i<st.length; i++) {
			st[i][4] = st[i][1] + st[i][2] + st[i][3];
		}
		/* 과목수가 많은 경우는 for문으로 하는게 나음
		 * for(int i=0; i<st.length; i++) {
			for(int j=1; j<4; j++) {
				st[i][4] = st[i][4] + st[i][j];	
				*/						
		//순위 계산
		for(int i=0; i<st.length; i++) {
			st[i][5]=1;
			for(int j=0; j<st.length; j++) {
				if(st[i][4]<st[j][4]) //총점기준
					st[i][5]++;
			}
		}
		
		//출력(입력자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<st.length; i++) {//줄
			for(int j=0; j<st[i].length; j++) {//칸
				System.out.print(st[i][j] + "\t");
			}
			System.out.print("\n");
		}
		//석차순으로 || 번호순
		for(int i=0; i<st.length-1; i++) {
			for(int j=i+1; j<st.length; j++) {
				if(st[i][0]>st[j][0]) {
					//번호기준 오름차순	
						int imsi[] = st[i];
						st[i] = st[j];
						st[j] = imsi;
					}
					}
			}
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<st.length; i++) {//줄
			for(int j=0; j<st[i].length; j++) {//칸
				System.out.print(st[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		}
		}

	


