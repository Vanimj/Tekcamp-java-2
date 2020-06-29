package com.burger.items;

import java.util.HashMap;
import java.util.Map;

public class Drink extends Item {
	
	public static final int DIETCOKE = 1;
	public static final int SPRITE = 2;
	public static final int THUMSUP = 3;
	
	// private Map<Integer,Drink> drinkMap = null;
	// private static Drink drinkObj = null;
	
	/*public Drink(int type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public Drink(int type) {
		this.type = type;
		
	}*/
	
	public Drink(int type, String name,int price) {
		this.type = type;
		this.name=name;
		this.price = price;
	}
	
	public Drink() {
		super();
	}
	
	/*public static Drink getInstance() {
		if(drinkObj == null) {
			drinkObj = new Drink();
		}
		return drinkObj;
	}*/
	
	
	
}
