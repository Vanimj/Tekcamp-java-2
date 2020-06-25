package com.burgerExercise;

public class PlainHamburger {

	String meat;
	String breadRollType;
	String toppingName;
	double price;

	String additionalTopping1;
	double additionalPrice1;

	String additionalTopping2;
	double additionalPrice2;

	String additionalTopping3;
	double additionalPrice3;

	String additionalTopping4;
	double additionalPrice4;

	String additionalTopping5;
	double additionalPrice5;

	String additionalTopping6;
	double additionalPrice6;

	public PlainHamburger(String meat, String breadRollType, String toppingName, double price) {
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.toppingName = toppingName;
		this.price = price;
	}

	public String getMeat() {
		return meat;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public double getPrice() {
		return price;
	}

	public void addHamburgerAddition1(String name, double price) {
		
		this.additionalTopping1=name;
		this.additionalPrice1=price;
		
	}
	
public void addHamburgerAddition2(String name, double price) {
		
		this.additionalTopping2=name;
		this.additionalPrice2=price;
		
	}
public void addHamburgerAddition3(String name, double price) {
	
	this.additionalTopping3=name;
	this.additionalPrice3=price;
	
}

public void addHamburgerAddition4(String name, double price) {
	
	this.additionalTopping4=name;
	this.additionalPrice4=price;
	
}

public void addHamburgerAddition5(String name, double price) {
	
	this.additionalTopping5=name;
	this.additionalPrice5=price;
	
}

public void addHamburgerAddition6(String name, double price) {
	
	this.additionalTopping6=name;
	this.additionalPrice6=price;
	
}
public double itemizeHamburger() {
	double hamburgerPrice=this.price;
	if(this.additionalTopping1 !=null || this.additionalTopping2!=null) {
	//double hamburgerPrice=this.price;
	System.out.println("The price is"+this.price);
}

	if(this.additionalTopping3!=null) {
		 hamburgerPrice += this.additionalPrice3;
		System.out.println("the price for 3rd topping"+this.additionalPrice3);
	}
	if(this.additionalTopping4!=null) {
		 hamburgerPrice += this.additionalPrice4;
		System.out.println("the price for 4th topping"+this.additionalPrice4);
	}
	if(this.additionalTopping5!=null) {
		 hamburgerPrice += this.additionalPrice5;
		System.out.println("the price for 5th topping"+this.additionalPrice5);
	}
	if(this.additionalTopping6!=null) {
		 hamburgerPrice += this.additionalPrice6;
		System.out.println("the price for 6th topping"+this.additionalPrice6);
	}
	return hamburgerPrice;
}

}
