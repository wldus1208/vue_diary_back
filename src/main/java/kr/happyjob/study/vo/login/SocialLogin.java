package kr.happyjob.study.vo.login;

public class SocialLogin {
	
	private String code;
	private String state;
	
	public SocialLogin() {
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "SocialLogin [code=" + code + ", state=" + state + "]";
	}
	
	
	
	

	
	
	
}
