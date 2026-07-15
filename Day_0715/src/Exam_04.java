import java.util.Arrays;

public class Exam_04 {
	public static void main(String[] args) {
		int[] score= {90,60,80,70,55,88,77,65};
		
		//배열 데이터 확인
		System.out.println("Data 확인 : " + Arrays.toString(score));
		
		//배열 데이터 출력(기본 for())
		System.out.print("Data : ");
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		
		//배열 데이터 출력(확장 for())
				System.out.print("Data : ");
				for(int i : score) {
					System.out.print(i + " ");
				}
				System.out.print("\n");
				
		//합계,평균,최대,최소
		//int sum=0, max=0, min=0;
		int sum=score[0], max=score[0], min=score[0];
		for(int i=1; i<score.length; i++) {
			//합계
			sum += score[i];
			//최대값
			if(max<score[i]) {
				max=score[i];	
			}
			if(min>score[i]) {
				min=score[i];	
			}
			
			//출력
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ((double)sum/score.length));
			System.out.println("최대 : " + max);
			System.out.println("최소 : " + min);
		}
		
			//정렬
			int sccp[] = score.clone();//배열 복사
			for(int i=0; i<sccp.length-1; i++) {
				for(int j=i+1; j<sccp.length; j++) {
					if(sccp[i]>sccp[j]) {
						//교환
						int imsi = sccp[i];
						sccp[i] = sccp[j];
						sccp[j] = imsi;
					}
				}
			}
			System.out.println("정렬 전 : " + Arrays.toString(score));
			System.out.println("정렬 후 : " + Arrays.toString(sccp));
	}

}
