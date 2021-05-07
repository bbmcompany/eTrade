package eTrade.dataAccess.concretes;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class DatabaseUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getName() + " sisteme eklendi.");
		
	}
	

}
