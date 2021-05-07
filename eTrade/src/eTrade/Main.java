package eTrade;

import eTrade.business.concretes.UserManager;
import eTrade.core.CheckRegister;
import eTrade.core.Login;
import eTrade.core.SendMail;
import eTrade.dataAccess.concretes.DatabaseLoginDao;
import eTrade.dataAccess.concretes.DatabaseUserDao;
import eTrade.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		User newUser = new User();
		newUser.setEmail("axyz@gmail.com");
		newUser.setName("Ege");
		newUser.setLastName("Malkoc");
		newUser.setPassword("4ewrlls");
		
		User baris = new User();
		baris.setEmail("baris@gmail.com");
		baris.setPassword("flkalreqwe");
		baris.setName("baris");
		baris.setLastName("Malkoc");
		
		User lessPassword = new User();
		lessPassword.setEmail("lessPassword@gmail.com");
		lessPassword.setName("pass");
		lessPassword.setLastName("word");
		lessPassword.setPassword("sad1");
		
		Login loginTrue = new Login("baris@gmail.com", "qwert34534/");
		Login loginFalse = new Login("ahmet@gmail.com", "fdsfgwr3");
		
		UserManager userManager = new UserManager(new DatabaseUserDao(), new SendMail(), new CheckRegister(), new DatabaseLoginDao());
			
			
		
		userManager.register(newUser);
		System.out.println("**********************************************");
		userManager.register(baris);
		System.out.println("**********************************************");
		userManager.register(lessPassword);
		System.out.println("**********************************************");
		userManager.login(loginTrue);
		System.out.println("**********************************************");
		userManager.login(loginFalse);
		System.out.println("**********************************************");
		
		
	}

}
