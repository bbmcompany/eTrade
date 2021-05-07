package eTrade.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.entities.concretes.User;

public class CheckRegister {
	
	public boolean checkMail(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher marcher = pattern.matcher(user.getEmail());
		
		if(marcher.matches()) {
			return checkName(user);
		}else {
			System.out.println("E-posta adresinizi kontrol ediniz.");
			return false;
		}
	}
	
	public boolean checkName(User user) {
		if(user.getName().length() > 2 && user.getLastName().length() > 2) {
			return checkPassword(user);
		}else {
			System.out.println("Ad ve soyad en  az iki karakterden olusmalidir.");
			return false;
		}
		
	}
	
	public boolean checkPassword(User user) {
		if(user.getPassword().length() > 6) {
			return checkDatabase(user);
		}else {
			System.out.println("Sifre en az 6 karakterden olusabilir.");
			return false;
		}
	}
	
	public boolean checkDatabase(User user) {
		for(User userCheck : DataBaseSimulation.userData()) {
			if(user.getEmail().equals(userCheck.getEmail())) {
				System.out.println("Girdiginiz e-postaya ait kayit bulunmaktadir. " + user.getEmail());
				return false;
			}
		}
		return true;
		
	}

}
