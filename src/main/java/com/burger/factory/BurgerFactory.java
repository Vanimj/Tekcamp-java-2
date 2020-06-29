package com.burger.factory;

import com.burger.constants.Burger;
import com.burger.types.DeluxeBurger;
import com.burger.types.HealthyBurger;
import com.burger.types.PlainHamburger;

public class BurgerFactory {

	public PlainHamburger getBurgerType(int burgerType) {
		System.out.println("Burger Type DAO Factory :: "+burgerType);
		if(burgerType<1 && burgerType>3) {
			System.out.println("Invalid Burger Type");
			return null;
		}
		PlainHamburger plainHamBurgerObj = null;
		switch(burgerType) {
		
		case Burger.PLAIN :
			plainHamBurgerObj = new PlainHamburger();
			break;
		case Burger.HEALTHY :
			plainHamBurgerObj = new HealthyBurger();
			break;
		case Burger.DELUX :
			plainHamBurgerObj = new DeluxeBurger();
			break;
		default :
			plainHamBurgerObj = new PlainHamburger(); // Default PlainHamBurger
			break;
		}
		
		System.out.println("Which Burger Object :"+ plainHamBurgerObj.toString());
		
		/*if(Burger.PLAIN==burgerType)
			return new PlainHamburger();
		else if (Burger.HEALTHY==burgerType)
			return new HealthyBurger();
		else if (Burger.DELUX==burgerType)
			return new DeluxeBurger();
		else 
			return new PlainHamburger();*/  // Default PlainHamburger
		return plainHamBurgerObj;
	}
	
}
