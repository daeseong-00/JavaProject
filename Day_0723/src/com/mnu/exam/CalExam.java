package com.mnu.exam;

public class CalExam {
	public static void main(String[] args) {
		Cal c1 = new Cal();
		c1.add();
		c1.add(1,2);
		
		Cal c2 = new Cal(6);
		c2.add();
		c2.add(1,2);
		
		Cal c3 = new Cal(5,10);
		c3.add();
		c3.add(1,2);
	}

}
