package eTrade.core;

import eTrade.googleAcount.GoogleLogin;

public class GoogleLoginAdapter implements LoginService{
	public void loginWithGoogle(String message) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.Login();
		
	}

}
