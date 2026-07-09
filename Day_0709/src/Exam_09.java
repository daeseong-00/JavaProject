
public class Exam_09 {

	public static void main(String[] args) {
		double tmp = 365.2422;
		int day = 0, hour = 0, min = 0, sec = 0;
		System.out.printf("1년은 %.4f일 이다.\n", tmp);
		
		//(int)tmp = 365를 대입한다.
		day = (int)tmp;
		tmp -= day;//day는 365일, tmp에 나머지 값인 0.2422일을 대입해준다.
		hour =(int)(tmp * 24);//1일은 24시간이므로tmp(0.2422일)에 '24(시간)/1(일)'을 곱하여준다.
		
		tmp = (tmp *24) - hour;
		min = (int)(tmp * 60);
		
		tmp = (tmp * 60) - min;
		sec = (int)(tmp * 60);
		
		System.out.printf("%d일 %d시 %d분 %d초\n",day, hour, min, sec);

	}

}
