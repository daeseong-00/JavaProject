package com.mnu.exam01;

import java.io.File;
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		try {
		Scanner scn = new Scanner(new File("src/data.txt"));
		String line = null;
		while(scn.hasNextLine()) { //hasnextline = 라인이 존재하면 
			line=scn.nextLine();// next로 하면 공백을 기준으로 읽어서 한줄 통으로 못읽어줌
		System.out.println(line);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
