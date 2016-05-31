package com.guitarsell2.dao;

import java.util.List;
import com.guitarsell2.model.Guitar;




public class GuitarMgr {
	private static GuitarMgr mgr = null;
	
	private static GuitarDAO dao = new GuitarMySQLDAO(); 
	
	private GuitarMgr() {}
	
	public static GuitarMgr getInstance() {
		if(mgr == null) {
			mgr = new GuitarMgr();
		}
		return mgr;
	}
	public List<Guitar> getGuitars() {
		return dao.getGuitars();
	}

}
