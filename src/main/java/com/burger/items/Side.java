package com.burger.items;

import java.util.HashMap;
import java.util.Map;

public class Side extends Item {
	
	public static final int FRIES = 1;
	public static final int CHIPS = 2;
	public static final int ICE_CREAM = 3;
	
	//private Map<Integer,Side> sideMap = null;
	// private static Side sideObj = null;
	
	/*public Side(int type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public Side(int type) {
		this.type = type;
		
	}*/
	
	public Side(int type, String name, int price) {
		this.type = type;
		this.name=name;
		this.price = price;
	}
	
	public Side() {
		super();
	}
	
	/*public static Side getInstance() {
		if(sideObj == null) {
			sideObj = new Side();
		}
		return sideObj;
	}*/
	
	
	
}
