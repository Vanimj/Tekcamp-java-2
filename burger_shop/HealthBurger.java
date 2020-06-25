package com.burgerExercise;

public class HealthyBurger extends PlainHamburger {
	public String healthyAdditional1;
	public double healthyAdditionalPrice;

	public HealthyBurger(String meat, double price) {
		super(meat, "wheat", "brown rye", price);
	}

	public void healthyAddition(String name, double price) {
		this.healthyAdditional1 = name;
		this.healthyAdditionalPrice = price;

	}

	public double itemizeHamburger() {
		double hamburgerPrice = this.price;
//		if( (this.additionalTopping1 == "cheese" || this.additionalTopping2 == "bacon"
//				|| this.additionalTopping3 == "cheese" || this.additionalTopping4 == "cheese"
//				|| this.additionalTopping5 == "cheese" || this.additionalTopping6 == "cheese") && (this.additionalTopping1 == "bacon" || this.additionalTopping2 == "bacon"
//				|| this.additionalTopping3 == "bacon" || this.additionalTopping4 == "bacon"
//				|| this.additionalTopping5 == "bacon" || this.additionalTopping6 == "bacon")) {
//
//			System.out.println("choose healthy");
			// hamburgerPrice +=this.healthyAdditionalPrice;
			// System.out.println("The price is"+this.price);
		//}
		if ((this.additionalTopping1 != null && this.additionalTopping1!="cheese") || (this.additionalTopping2 != null && this.additionalTopping2 !="cheese") || (this.additionalTopping3 != null
				&& this.additionalTopping3!="cheese")	|| (this.additionalTopping4 != null && this.additionalTopping4 !="cheese")) {
			  hamburgerPrice=this.price;
			System.out.println("The price for four toppings is same and you need to pay: " + this.price);
		}
		if (this.additionalTopping5 != null &&  this.additionalTopping5!="cheese") {
			hamburgerPrice += this.additionalPrice5;
			System.out.println("the price for 5th topping" + this.additionalPrice5);
		}
		if (this.additionalTopping6 != null &&  this.additionalTopping6!="cheese") {
			hamburgerPrice += this.additionalPrice6;
			System.out.println("the price for 6th topping" + this.additionalPrice6);
		}
		return hamburgerPrice;

	}
}
