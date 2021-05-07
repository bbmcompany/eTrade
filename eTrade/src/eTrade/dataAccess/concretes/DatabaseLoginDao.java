package eTrade.dataAccess.concretes;

import eTrade.core.DataBaseSimulation;
import eTrade.core.Login;
import eTrade.dataAccess.abstracts.LoginDao;
import eTrade.entities.concretes.User;

public class DatabaseLoginDao implements LoginDao{


	@Override
	public void checkLogin(Login login) {
		for(User userCheck : DataBaseSimulation.userData()) {
			if(login.getEmail().equals(userCheck.getEmail())) {
				if(login.getPassword().equals(userCheck.getPassword())) {
					System.out.println("Sisteme giris basarili.");
					break;
				}
				
			}else {
				System.out.println("Lütfen sifre ve e-posta adresinizi kontrol ediniz.");
				break;
			}
			
		}
		
	}
	

}
