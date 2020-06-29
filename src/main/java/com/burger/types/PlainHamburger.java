package com.burger.types;

import java.util.ArrayList;
import java.util.List;

import com.burger.items.Bread;
import com.burger.items.Meat;
import com.burger.items.Toppings;

public class PlainHamburger {
	
	Bread bread;
	Meat meat;
	Toppings toppings;
	List<Toppings> toppingsObjList = new ArrayList<Toppings>();
	
	public Bread getBread() {
		return bread;
	}

	public void setBread(Bread bread) {
		this.bread = bread;
	}

	public List<Toppings> getToppingsObjList() {
		return toppingsObjList;
	}

	public void setToppingsObjList(List<Toppings> toppingsObjList) {
		this.toppingsObjList = toppingsObjList;
	}

	public Toppings getToppings() {
		return toppings;
	}

	public void setToppings(Toppings toppings) {
		this.toppings = toppings;
	}

	public Meat getMeat() {
		return meat;
	}

	public void setMeat(Meat meat) {
		this.meat = meat;
	}

	public PlainHamburger(int bread,int meat) {
		
	}
	
	public PlainHamburger() {
		super();
	}
	
	public final int plainBurgerPrice() {
		int meatPrice = this.getMeat().getPrice();
		int breadPrice = this.getBread().getPrice();
		System.out.println(" Meat Type : "+this.getMeat().getName()+" Price : "+this.getMeat().getPrice());
		System.out.println(" Bread Type : "+this.getBread().getName()+" Price : "+this.getMeat().getPrice());
		
		int totalPriceWithOutToppings = meatPrice + breadPrice;
		
		System.out.println(" Total Price without toppings :: "+totalPriceWithOutToppings);
		return totalPriceWithOutToppings;
	}
	
	public int totalBurgerPrice() {
		int toppingsPrice = 0;
		if(toppingsObjList!=null && !toppingsObjList.isEmpty()) {
			for(Toppings toppings : toppingsObjList) {
				System.out.println(" Topping Type : "+toppings.getName()+" Price : "+toppings.getPrice());
				toppingsPrice = toppingsPrice + toppings.getPrice();
			}
		}
		
		int meatPrice = this.getMeat().getPrice();
		int breadPrice = this.getBread().getPrice();
		System.out.println(" Meat Type : "+this.getMeat().getName()+" Price : "+this.getMeat().getPrice());
		System.out.println(" Bread Type : "+this.getBread().getName()+" Price : "+this.getMeat().getPrice());
		System.out.println(" Toppings Total Price :: "+toppingsPrice);
		int totalPriceWithToppings = meatPrice + breadPrice + toppingsPrice;
		
		System.out.println(" Total Price with toppings :: "+totalPriceWithToppings);
		return totalPriceWithToppings;
	}
	
	public String toString() {
		return "PLAIN_BURGER";
	}
}