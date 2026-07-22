package com.mnu.sawon;

public class Sawon {
	private int sabun;//사원번호
	private String sana;//사원이름
	private int gen;//성별(1,3:남/2,4:여)
	private int gra;//사원등급
	private int time;//근무시간
	
	public Sawon() {}
	
	public Sawon(int sabun, String sana, int gen, int gra, int time) {
		this.sabun=sabun;
		this.sana=sana;
		this.gen=gen;
		this.gra=gra;
		this.time=time;
		
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getSana() {
		return sana;
	}

	public void setSana(String sana) {
		this.sana = sana;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public int getGra() {
		return gra;
	}

	public void setGra(int gra) {
		this.gra = gra;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	

}
