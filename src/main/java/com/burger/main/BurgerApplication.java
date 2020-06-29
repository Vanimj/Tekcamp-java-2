package com.burger.main;

import java.util.Scanner;

import com.burger.constants.Burger;
import com.burger.constants.BusinessConstants;
import com.burger.data.Order;
import com.burger.exceptions.BurgerException;
import com.burger.items.Bread;
import com.burger.items.Drink;
import com.burger.items.Meat;
import com.burger.items.Side;
import com.burger.items.Toppings;
import com.burger.validations.BurgerMandatoryValidations;

public class BurgerApplication {

	public static void main(String[] args) {
		
		// Order order = new Order(Burger.PLAIN, Bread.BAKE, Meat.CHICKEN);
		
		BurgerMandatoryValidations mandatoryValidations = new BurgerMandatoryValidations();

		try {
		Scanner scan = new Scanner(System.in);
		//String s = scan.next();
		
		// Validate Burger Type
		System.out.println("Burger Types available are : \n 1) Plain Burger \n 2) Healty Burger \n 3) Delux Burger \n");
		System.out.println("Enter Valid Burger Option : \t\t\t");
		int burgerType = scan.nextInt();
		if(!mandatoryValidations.isBurgerTypeValid(burgerType))
			throw new BurgerException("Invalid Burger Type Entered, Please enter valid Burger Option ");
		
		// Validate Meat Type
		System.out.println("Meat Types available are : \n 1) Chicken \n 2) Beaf \n 3) Steaf \n Enter Valid Meat Option : \n");
		int meatType = scan.nextInt();
		if(!mandatoryValidations.isMeatTypeValid(meatType))
			throw new BurgerException("Invalid Meat Type Entered, Please enter valid Meat Option ");

		// Validate Bread Type
		System.out.println("Bread Types available are : \n 1) Italian \n 2) Beak \n 3) Fried \n Enter Valid Bread Option : ");
		int breadType = scan.nextInt();
		if(!mandatoryValidations.isBreadTypeValid(breadType))
			throw new BurgerException("Invalid Bread Type Entered, Please enter valid Bread Option ");
		
		Order order = new Order(burgerType, breadType, meatType);
		order.createMealObject(order.getBurgerType(), order.getBreadType(), order.getMeatType());
		
		// Validate Drink Type
		System.out.println("Drink Types available are : \n 1) Dite Coke \n 2) Sprite \n 3) ThumbsUp \n Enter Valid Drink Option : \t\t\t");
		int drinkType = scan.nextInt();
		if(!mandatoryValidations.isDrinkTypeValid(drinkType))
			throw new BurgerException("Invalid Drink Type Entered, Please enter valid Drink Option ");
		else
		order.addDrink(drinkType);
		
		String sideOption = "Y";
		do {
			// Validate Side Type
			System.out.println("Side Types available are : \n 1) Fries \n 2) Chips \n 3) IceCream \n Enter Valid Side Option : \t\t\t");
			int sideType = scan.nextInt();
			if(!mandatoryValidations.isSideTypeValid(sideType))
				throw new BurgerException("Invalid Side Type Entered, Please enter valid Side Option ");
			else {
			order.addSide(sideType);
			System.out.println("\n \n Do you want to add another SIDE (Y|N) : ");
			sideOption = scan.next();
			}
		} while (BusinessConstants.YES.equals(sideOption.toUpperCase()));
		
		
		
		String toppingOption = "N";
		boolean checkPlainBurgerFlag = true;
		System.out.println("Application BURGER :: "+order.getMealObj().getPlainBurgerObj().toString());
		do {
			if(order.getMealObj().getPlainBurgerObj().toString().equals("PLAIN_BURGER") && checkPlainBurgerFlag) {
				System.out.println("Do you want to add toppings for Plain Burger (Y|N) : ");
				String tempFlag = scan.next();
				if(BusinessConstants.YES.equals(tempFlag.toUpperCase())) {
					checkPlainBurgerFlag = false;
				}else {
					break;
				}
			}
			
			// Validate Toppings Type
			System.out.println("Toppings Types available are : \n 1) lettuce \n 2) Tomatoes \n 3) Carrots \n 4) Cheese \n 5) Bacon \n 6) Ketchup \n Enter Valid Topping Option : \t\t\t");
			int toppingType = scan.nextInt();
			if(!mandatoryValidations.isToppingTypeValid(toppingType))
				throw new BurgerException("Invalid Topping Type Entered, Please enter valid Topping Option ");
			else {
			order.addToppings(toppingType);
			System.out.println("\n \n Do you want to add another TOPPING (Y|N) : ");
			toppingOption = scan.next(); 
			}
		} while (BusinessConstants.YES.equals(toppingOption.toUpperCase()));
		
		
		order.purchaseOrder();
		
		} catch(BurgerException bgEx) {
			System.out.println("Exception is :: "+bgEx);
		}
	}
}
