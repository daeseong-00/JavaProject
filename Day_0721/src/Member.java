
public class Member {
	//멤버변수
	String name;
	String id;
	String pass;
	String phone;
	
	public Member() {}
	
	public Member(String name, String id, String pass, String phone) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.phone=phone;
	}
	
	
	//회원가입
	boolean memberRegister() {
		
		return true;
	}
	
	//로그인
	boolean memberLogin() {
		
		return true;
	}
	//로그아웃
	void memberLogout() {
	
	}
	
}
