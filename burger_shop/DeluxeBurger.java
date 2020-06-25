package com.burgerExercise;

public class DeluxeBurger extends PlainHamburger {

	public DeluxeBurger(String meat, String breadRollType, String toppingName, double price) {
		super(meat, breadRollType, toppingName, price);
	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
		if (this.additionalTopping1 != null || this.additionalTopping2 != null || this.additionalTopping3 != null
				|| this.additionalTopping4 != null || this.additionalTopping5 != null || this.additionalTopping1 != null
				|| this.additionalTopping6 != null) {
			// double hamburgerPrice=this.price;
			System.out.println("The price for six toppings is same adn you need to pay: " + this.price);
		}
		return hamburgerPrice;
	}
