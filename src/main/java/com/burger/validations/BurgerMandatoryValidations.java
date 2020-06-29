package com.burger.validations;

import com.burger.constants.Burger;
import com.burger.setups.ConfigurationSetup;

public class BurgerMandatoryValidations {

	ConfigurationSetup configurationSetup = new ConfigurationSetup();
	
	public boolean isBurgerTypeValid(int burgerType) {
		/*if(Burger.PLAIN == burgerType || Burger.HEALTHY == burgerType || Burger.DELUX == burgerType)
			return true;
		else
			return false;*/
		return (Burger.PLAIN == burgerType || Burger.HEALTHY == burgerType || Burger.DELUX == burgerType) ? true : false;
	}
	
	public boolean isMeatTypeValid(int meatType) {
		/*if(configurationSetup.getAllMeatTypesWithPrices().containsKey(meatType))
			return true;
		else
			return false;*/
		return (configurationSetup.getAllMeatTypesWithPrices().containsKey(meatType) ? true : false);
	}
	
	public boolean isBreadTypeValid(int breadType) {
		/*if(configurationSetup.getAllBreadTypesWithPrices().containsKey(breadType))
			return true;
		else
			return false;*/
		return (configurationSetup.getAllBreadTypesWithPrices().containsKey(breadType) ? true : false);
	}
	
	public boolean isDrinkTypeValid(int drinkType) {
		
		return (configurationSetup.getAllDrinkTypesWithPrices().containsKey(drinkType) ? true : false);
	}
	
	public boolean isSideTypeValid(int sideType) {
		
		return (configurationSetup.getAllSidesTypesWithPrices().containsKey(sideType) ? true : false);
	}
	
	public boolean isToppingTypeValid(int toppingType) {
		
		return (configurationSetup.getAllToppingsWithPrices().containsKey(toppingType) ? true : false);
	}
	
	

}
