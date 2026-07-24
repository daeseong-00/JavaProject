package com.mnu.exam02;

public class Exam_09 {
	public static void main(String[] args) {
		int w=3,x=4,y=3,z=6;
		if((w==2 | w==y)& !(y>x)&(1==x^y !=z)) {
			//    t        !f=t     t      
			w=x+y;
		}else {
			w=y+z;
		}
		System.out.println(w);
	}

}
