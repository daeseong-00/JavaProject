/* 반복문 : for(), while(), do~while()
 * 조건식이 참이면 반복
 * 
 *  이름을 5번 출력하시오
 */
public class Exam_04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
		System.out.println("백대성");
		}
		
		/// i 변수는 for문이 끝나면 소멸
		/// System.out.println("i=" +i); = 오류남
		/// 
		/// 
		int i;
		for( i=1; i<=5; i++) {
			System.out.println("백대성");
			}///이건 됨
		System.out.println("i="+i);//for문에서 5까지 하고 6은 거짓이라 밑으로 나옴
		
		int j;
		for( j=0; j<5; j+=2) {
			System.out.println(j);//j=0,2,4
			}
		System.out.println(j);//6
		
	}
	

}
