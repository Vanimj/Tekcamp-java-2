package com.burger.validations;

import com.burger.constants.Burger;
import com.burger.constants.BusinessConstants;
import com.burger.setups.ConfigurationSetup;

public class BurgerBusinessValidations {

	public boolean checkForMaximumSides(int noOfSides) {
		if(noOfSides<BusinessConstants.MAX_SIDES)
			return true;
		else 
			return false;
	}
	
	/*public boolean checkForMaximumToppings(int burgerType, int noOfToppings) {
		if(Burger.PLAIN==burgerType && noOfToppings < BusinessConstants.MAX_ALLOWED_PLAIN_TOPPINGS) {
			return true;
		}
		else if(Burger.HEALTHY==burgerType && noOfToppings < BusinessConstants.MAX_ALLOWED_HEALTHY_TOPPINGS) {
			return true;
		}
		else if(Burger.DELUX==burgerType && noOfToppings < BusinessConstants.MAX_ALLOWED_DELUX_TOPPINGS) {
			return true;
		}
		else {
			return false;
		}
	}*/
	
	public boolean checkForMaximumToppings(int noOfToppings, int maxToppingAllowed) {
		if(noOfToppings < maxToppingAllowed)
			return true;
		else 
			return false;
	}
	
	public boolean isValidHealthTopping(int toppingType) {
		return new ConfigurationSetup().getUnHealthyMappingList().contains(toppingType);
	}
}
