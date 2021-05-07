package eTrade.business.abstracts;

import eTrade.core.Login;
import eTrade.entities.concretes.User;


public interface UserService {
	void register(User user);
	void login(Login login);
	

}
