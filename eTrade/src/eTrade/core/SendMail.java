package eTrade.core;

import eTrade.entities.concretes.User;

public class SendMail implements LoggerService{

	@Override
	public void sendMail(User user) {
		System.out.println(user.getEmail() + " adresine dogrulama linki yollandi.");
		
	}
	

}
