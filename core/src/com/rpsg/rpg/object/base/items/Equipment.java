package com.rpsg.rpg.object.base.items;

import java.io.Serializable;


public class Equipment extends BaseItem implements Serializable{
	private static final long serialVersionUID = 1L;

	//public Class<? extends Hero> onlyFor;
	//There is no Class differecnce
	public String onlyFor;
	
	public String description2;
	
	public String equipType;
	
	public int animation;
	
	public static String EQUIP_SHOES="EQUIP_SHOES";
	public static String EQUIP_CLOTHES="EQUIP_CLOTHES";
	public static String EQUIP_WEAPON="EQUIP_WEAPON";
	public static String EQUIP_ORNAMENT1="EQUIP_ORNAMENT1";
	public static String EQUIP_ORNAMENT2="EQUIP_ORNAMENT2";
	
}
