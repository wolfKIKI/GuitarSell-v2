package com.guitarsell2.model;

public enum Builder {
	FENDER,MARTIN,GIBSON,COLLINGS,OLSN,RYAN,PRS,ANY;
	public String toString(){
		switch(this){
		case FENDER: 
			return "fender";
		case MARTIN: return "martin";
		case GIBSON: return "gibson";
		case COLLINGS: return "collings";
		case OLSN: return "olsn";
		case RYAN: return "ryan";
		case PRS: return "prs";
		case ANY: return "any";
		default:
			return null ;
		}
		 
	}

}
