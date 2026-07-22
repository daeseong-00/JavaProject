package com.mnu.sawon2;

public class SawonDTO {
	private int sabun;//사원번호
	private String sana;//사원이름
	private int gen;//성별(1,3:남/2,4:여)
	private int gra;//사원등급
	private int time;//근무시간
	private int wepay;//등급에 따른 시급
	private String genstr;//성별 이름
	private int wemo;//주급
	
	public SawonDTO() {}
	
	public SawonDTO(int sabun, String sana, int gen, int gra, int time) {
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

	public int getWepay() {
		return wepay;
	}

	public void setWepay(int wepay) {
		this.wepay = wepay;
	}

	public String getGenstr() {
		return genstr;
	}

	public void setGenstr(String genstr) {
		this.genstr = genstr;
	}

	public int getWemo() {
		return wemo;
	}

	public void setWemo(int wemo) {
		this.wemo = wemo;
	}
	
	
	

}
