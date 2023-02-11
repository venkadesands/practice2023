package com.partialabsract;

public class LoginUsingPhoneNo extends FaceBook{

	@Override
	public void loginFunctiionality() {
		System.out.println("Phone No ----093632440867");
	}
	
	@Override
	public void login() {
 	System.out.println("Login with Email -----Venkadesands1992@gmail.com");
 	super.login();
	}
	public static void main(String[] args) {
		LoginUsingPhoneNo no = new LoginUsingPhoneNo();
		no.login();
		no.loginFunctiionality();
	}

}
