package com.burger.items;

import java.util.HashMap;
import java.util.Map;

public class Bread extends Item {
	
	public static final int ITALIAN = 1;
	public static final int BAKE = 2;
	public static final int FRIED = 3;
	
	//private Map<Integer,Bread> breadMap = null;
	// private static Bread breadObj = null;
	
	/*public Bread(int type, int price) {
		this.type = type;
		this.price = price;
	}
	
	public Bread(int type) {
		this.type=type;
	}*/
	
	public Bread(int type, String name,int price) {
		this.type=type;
		this.name=name;
		this.price=price;
	}
	public Bread() {
		super();
	}
	
	/*public static Bread getInstance() {
		if(breadObj == null) {
			breadObj = new Bread();
		}
		return breadObj;
	}*/
	
}
