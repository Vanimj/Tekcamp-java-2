package com.burger.items;

import java.util.HashMap;
import java.util.Map;

public class Meat extends Item {
	
	public static final int CHICKEN = 1;
	public static final int BEEF = 2;
	public static final int STEAK = 3;
	
	//private Map<Integer,Meat> meatMap = null;
	// private static Meat meatObj = null;
	
	/*public Meat(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Meat(int type) {
		this.type = type;
		
	}*/
	
	
	public Meat(int type,String name,int price) {
		this.type=type;
		this.name = name;
		this.price = price;
	}
	
	public Meat() {
		super();
	}
	
	/*public static Meat getInstance() {
		if(meatObj == null) {
			meatObj = new Meat();
		}
		return meatObj;
	}*/
	
	
	
}
