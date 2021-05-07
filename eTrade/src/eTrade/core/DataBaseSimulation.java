package eTrade.core;

import java.util.ArrayList;


import eTrade.entities.concretes.User;

public class DataBaseSimulation{
	
	public static ArrayList<User> userData(){
		ArrayList<User> users = new ArrayList<User>();
		
		User baris = new User();
		baris.setEmail("baris@gmail.com");
		baris.setName("Baris");
		baris.setLastName("Malkoc");
		baris.setPassword("qwert34534/");
		users.add(baris);
		
		User cagri = new User();
		cagri.setEmail("cagri@gmail.com");
		cagri.setName("Cagri");
		cagri.setLastName("Koca");
		cagri.setPassword("vblkdfmbgk3657");
		users.add(cagri);
		
		User zeynep = new User();
		zeynep.setEmail("zeynep@gmail.com");
		zeynep.setName("Zeynep");
		zeynep.setLastName("Güclü");
		zeynep.setPassword("nlmlö34324mkfm");
		users.add(zeynep);
		
		return users;
		
	}
	
	
	
	
	
	

}
