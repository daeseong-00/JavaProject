package com.mnu.sawon2;

public class SawonDAO {
	//싱글톤 패턴
	private SawonDAO() {}
	
	//자신의 객체를 자신이 생성
	private static SawonDAO instance = new SawonDAO();
	
	public static SawonDAO genInstance() {
		return instance;
	}//==싱글톤
	
	//1. 메소드 생성(객체 생성 후 반환)
	public SawonDTO getSawon(int sabun, String sana, int gen, int gra, int time) {
		SawonDTO sawon = new SawonDTO(sabun, sana, gen, gra, time);
		return sawon;
	}
	//2. 주간급여를 계산 후 반환하는 메소드
	
	public int wepaProcess(SawonDTO sa) {
		
		setwepa(sa);
		setgen(sa);
		
		//int wemo = sa.setWepay();
		int pay=0;//주급
		int overtime = 0;//초과근무시간
		int basetime = sa.getTime();//
		if(basetime>50)
			basetime=50;
		//초과근무시간
		if(basetime>36) {
			overtime = basetime-36;
			basetime = 36;
		}
		
		pay = basetime*sa.getWepay() + (int)(overtime*sa.getWepay()*1.5);
		return pay;
	}
	
	private void setwepa(SawonDTO sa) {
		sa.setWepay(2000);
		if(sa.getGra()==1)
		sa.setWepay(10000);
		else if(sa.getGra()==2)
		sa.setWepay(5000);
	}
	private void setgen(SawonDTO sa) {
		sa.setGenstr("여성");
		if(sa.getGen()==1 || sa.getGen()==3) {
			sa.setGenstr("남자");
		}
			
	}

}
