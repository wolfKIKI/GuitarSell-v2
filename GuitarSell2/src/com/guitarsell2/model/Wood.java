package com.guitarsell2.model;

public enum Wood {
	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;
	public String toString(){
		switch(this){
		case INDIAN_ROSEWOOD:return "Indian RoseWood";
		case BRAZILIAN_ROSEWOOD:return "Brazilian_RoseWood";
		case MAHOGANY:return "mahogany";
		case MAPLE :return "maple";
		case COCOBOLO:return "cocobolo";
		case CEDAR:return "cedar";
		case  ADIRONDACK:return "adirondack" ;
		case  ALDER:return "alder";
		case SITKA:return "sitka";
		default:
			return null;
		}
	}




}
