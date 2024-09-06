package com.contabil.demand.contract.enums.login;

public enum MethodLogin {
	
	EMAIL("usernameLoginStrategy"),
	GMAIL("gmailLoginStrategy"),
	FACEBOOK("facebookLoginStrategy");
	
	private String method;
	
	MethodLogin(String method){
		this.method = method;
	}
	
	public String getMethod() {
		return method;
	}
}
