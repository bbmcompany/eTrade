package eTrade.business.concretes;

import eTrade.business.abstracts.UserService;
import eTrade.core.CheckRegister;
import eTrade.dataAccess.abstracts.LoginDao;
import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;
import eTrade.core.LoggerService;
import eTrade.core.Login;
public class UserManager implements UserService{
	
	private UserDao userDao;
	private LoggerService loggerService;
	private CheckRegister checkRegister;
	private LoginDao loginDao;
	
	public UserManager(UserDao userDao, LoggerService loggerService, CheckRegister checkRegister, LoginDao loginDao) {
		super();
		this.userDao = userDao;
		this.loggerService = loggerService;
		this.checkRegister = checkRegister;
		this.loginDao = loginDao;
	}

	@Override
	public void register(User user) {
		if(checkRegister.checkMail(user)) {
			userDao.add(user);
			loggerService.sendMail(user);
		}
		
	}

	@Override
	public void login(Login login) {
		loginDao.checkLogin(login);
		
	}

	

}
