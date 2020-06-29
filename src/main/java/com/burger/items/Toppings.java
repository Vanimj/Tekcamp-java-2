package com.burger.items;

import java.util.HashMap;
import java.util.Map;

public class Toppings extends Item {
	
	public static final int lettuce = 1;
	public static final int tomatoes = 2;
	public static final int carrots = 3;
	
	public static final int cheese = 4;
	public static final int bacon = 5;
	public static final int ketchup = 6;
	
	
	// private Map<Integer,Toppings> toppingsMap = null;
	// private static Toppings sideObj = null;
	
	public Toppings(int type, String name, int price) {
		this.type = type;
		this.name = name;
		this.price = price;
	}
	
	/*public Toppings(int type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public Toppings(int type) {
		this.type = type;
		
	}*/
	
	public Toppings() {
		super();
	}
	
	/*public static Toppings getInstance() {
		if(sideObj == null) {
			sideObj = new Toppings();
		}
		return sideObj;
	}*/
	
	
	
}
