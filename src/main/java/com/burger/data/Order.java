package com.burger.data;

import com.burger.constants.Burger;
import com.burger.constants.BusinessConstants;
import com.burger.setups.ConfigurationSetup;
import com.burger.exceptions.BurgerException;
import com.burger.items.Side;
import com.burger.items.Toppings;
import com.burger.types.DeluxeBurger;
import com.burger.types.HealthyBurger;
import com.burger.types.PlainHamburger;
import com.burger.validations.BurgerBusinessValidations;
import com.burger.validations.BurgerMandatoryValidations;

public class Order {
	
	private Meal mealObj = null;
	int sideCount = 0;
	int toppingsCount = 0;
	ConfigurationSetup configSetup = new ConfigurationSetup();
	BurgerMandatoryValidations validations = new BurgerMandatoryValidations();
	
	public Meal getMealObj() {
		return mealObj;
	}


	public void setMealObj(Meal mealObj) {
		this.mealObj = mealObj;
	}


	public int getSideCount() {
		return sideCount;
	}


	public void setSideCount(int sideCount) {
		this.sideCount = sideCount;
	}


	public int getToppingsCount() {
		return toppingsCount;
	}


	public void setToppingsCount(int toppingsCount) {
		this.toppingsCount = toppingsCount;
	}


	public int getBurgerType() {
		return burgerType;
	}


	public void setBurgerType(int burgerType) {
		this.burgerType = burgerType;
	}


	public int getBreadType() {
		return breadType;
	}


	public void setBreadType(int breadType) {
		this.breadType = breadType;
	}


	public int getMeatType() {
		return meatType;
	}


	public void setMeatType(int meatType) {
		this.meatType = meatType;
	}


	int burgerType = 0;
	int breadType = 0;
	int meatType = 0;
	
	
	public Order(int burgerType, int breadType, int meatType) {
		this.burgerType = burgerType;
		this.breadType = breadType;
		this.meatType = meatType;
	}

	
	public Meal createMealObject(int burgerType,int breadType, int meatType) throws BurgerException{
			mealObj = new Meal();

			PlainHamburger plainBurgerObj = mealObj.getBurgerObject(burgerType); // Factory Design Pattern
			plainBurgerObj.setMeat(configSetup.getAllMeatTypesWithPrices().get(meatType));
			plainBurgerObj.setBread(configSetup.getAllBreadTypesWithPrices().get(breadType));
			mealObj.setPlainBurgerObj(plainBurgerObj);
			
		return mealObj;
	}
	
	public void addDrink(int drinkType) {
		if(mealObj!=null) {
			mealObj.setDrinkObj(configSetup.getAllDrinkTypesWithPrices().get(drinkType));
		}
	}
	
	public void addSide(int sideType) throws BurgerException{
		if(mealObj!=null) {
		BurgerBusinessValidations validations = new BurgerBusinessValidations();
		 // if(sideCount<3) {
		 if(validations.checkForMaximumSides(sideCount)) {
			 //mealObj.setSideObj(new Side(sideType,null,0));
			 mealObj.getSideObjLst().add(configSetup.getAllSidesTypesWithPrices().get(sideType));
			 sideCount = mealObj.getSideObjLst().size();
			 //sideCount+=1;
		 }
		// mealObj.setSideObj(sideObj);
		 else {
			throw new BurgerException("Maximum side options limit :"+sideCount+" exceeded");
		 }
		}
	}
	
	
	public void addToppings(int toppingType) throws BurgerException{
		if(mealObj!=null) {
			PlainHamburger plainBurgerObj = mealObj.getPlainBurgerObj();
			BurgerBusinessValidations validations = new BurgerBusinessValidations();
			if(plainBurgerObj!=null && "PLAIN_BURGER".equals(plainBurgerObj.toString())) {
				System.out.println(" Plain Burger Type :: "+Burger.PLAIN);
				if(validations.checkForMaximumToppings(toppingsCount, BusinessConstants.MAX_ALLOWED_PLAIN_TOPPINGS)) {
					plainBurgerObj.getToppingsObjList().add(configSetup.getAllToppingsWithPrices().get(toppingType));
					toppingsCount = plainBurgerObj.getToppingsObjList().size();
				}
				else {
					throw new BurgerException("Maximum Toppings :"+toppingsCount+" exceeded for Plain Burger");
				}
			} else if(plainBurgerObj!=null && "HEALTHY_BURGER".equals(plainBurgerObj.toString())) {
				System.out.println(" Healthy Burger Type :: "+Burger.HEALTHY);
				if(validations.checkForMaximumToppings(toppingsCount, BusinessConstants.MAX_ALLOWED_HEALTHY_TOPPINGS)) {
					if(validations.isValidHealthTopping(toppingType)) {
						throw new BurgerException("Should not add UnHealthy Toppings for Healthy Burger");
					} else {
						plainBurgerObj.getToppingsObjList().add(configSetup.getAllToppingsWithPrices().get(toppingType));
						toppingsCount = plainBurgerObj.getToppingsObjList().size();
					}
				} else {
					System.out.println("Toppings Size exceeded for Healthy burger and cannot be added");
					throw new BurgerException("Maximum Toppings :"+toppingsCount+" exceeded for Healthy Burger");
				}
			} else if(plainBurgerObj!=null && "DELUX_BURGER".equals(plainBurgerObj.toString())) {
				System.out.println(" Delux Burger Type :: "+Burger.DELUX);
				// if (toppingsCount < DeluxeBurger.MAX_ALLOWED_DELUX_TOPPINGS) {
				if(validations.checkForMaximumToppings(toppingsCount, BusinessConstants.MAX_ALLOWED_DELUX_TOPPINGS)) {
					plainBurgerObj.getToppingsObjList().add(configSetup.getAllToppingsWithPrices().get(toppingType));
					toppingsCount = plainBurgerObj.getToppingsObjList().size();
				} else {
					System.out.println("Toppings Size exceeded for Delux burger and cannot be added");
					throw new BurgerException("Maximum Toppings :"+toppingsCount+" exceeded for Delux Burger");
				}
			}
			System.out.println("====> Toppings Size :: "+plainBurgerObj.getToppingsObjList().size());
			mealObj.setPlainBurgerObj(plainBurgerObj);
		}
	}
	
	public void purchaseOrder() {
		
		if(mealObj!=null) {
			int totalPrice = 0;
			PlainHamburger plainBurgerObj = mealObj.getPlainBurgerObj();
			/*if(plainBurgerObj instanceof PlainHamburger) {
				if(plainBurgerObj.getToppingsObjList().size()==0)
					burgerPrice = plainBurgerObj.plainBurgerPrice();
				 else
				burgerPrice = plainBurgerObj.totalBurgerPrice();
			} else if(plainBurgerObj instanceof HealthyBurger) {
				burgerPrice = plainBurgerObj.totalBurgerPrice();
			} else if(plainBurgerObj instanceof DeluxeBurger) {
				burgerPrice = plainBurgerObj.totalBurgerPrice();
			}*/
			
			if(plainBurgerObj!=null && "PLAIN_BURGER".equals(plainBurgerObj.toString())) {
				if(plainBurgerObj.getToppingsObjList().size()==0) {
					totalPrice = plainBurgerObj.plainBurgerPrice();
					System.out.println("PLAIN BURGER PRICE WITHOUT TOPPINGS :: "+totalPrice);
				}
				 else {
					 totalPrice = plainBurgerObj.totalBurgerPrice();
					 System.out.println("PLAIN BURGER PRICE WITH TOPPINGS :: "+totalPrice);
				 }
			} else if(plainBurgerObj!=null && "HEALTHY_BURGER".equals(plainBurgerObj.toString())) {
				if(plainBurgerObj.getToppingsObjList().size()==0) {
					totalPrice = plainBurgerObj.plainBurgerPrice();
					System.out.println("HEALTHY BURGER PRICE WITHOUT TOPPINGS :: "+totalPrice);
				}
				 else {
					 totalPrice = plainBurgerObj.totalBurgerPrice();
					 System.out.println("HEALTHY BURGER PRICE WITH TOPPINGS :: "+totalPrice);
				 }
			}
			else if(plainBurgerObj!=null && "DELUX_BURGER".equals(plainBurgerObj.toString())) {
				if(plainBurgerObj.getToppingsObjList().size()==0) {
					totalPrice = plainBurgerObj.plainBurgerPrice();
					System.out.println("DELUX BURGER PRICE WITHOUT TOPPINGS :: "+totalPrice);
				}
				 else {
					 totalPrice = plainBurgerObj.totalBurgerPrice();
					 System.out.println("DELUX BURGER PRICE WITH TOPPINGS :: "+totalPrice);
				 }
			}
			
			//System.out.println("BURGER PRICE :: "+burgerPrice);
			//totalPrice = burgerPrice;
			
			int sidePrice = 0;
			if(mealObj.getSideObjLst()!=null && !mealObj.getSideObjLst().isEmpty()) {
				for(Side sideObj : mealObj.getSideObjLst()) {
				System.out.println(" Side Type : "+sideObj.getName()+" Price : "+sideObj.getPrice());
				sidePrice = sidePrice + sideObj.getPrice();
				}
			}
			totalPrice = totalPrice + sidePrice;
			System.out.println("BURGER + SIDE PRICE :: "+totalPrice);
			
			System.out.println(" Drink Type : "+mealObj.getDrinkObj().getName()+" Price : "+mealObj.getDrinkObj().getPrice());
			totalPrice = totalPrice + mealObj.getDrinkObj().getPrice();
			System.out.println("BURGER + SIDE + DRINK PRICE :: "+totalPrice);
			
			/*int toppingPrice = 0;
			
			if(plainBurgerObj.getToppingsObjList()!=null && !plainBurgerObj.getToppingsObjList().isEmpty()) {
				for(Toppings toppingObj : plainBurgerObj.getToppingsObjList()) {
				System.out.println(" Side Type : "+toppingObj.getName()+" Price : "+toppingObj.getPrice());
				toppingPrice = toppingPrice + toppingObj.getPrice();
				}
			}
			totalPrice = totalPrice + toppingPrice;
			
			System.out.println("BURGER + SIDE + DRINK PRICE + TOPPINGS:: "+totalPrice);*/
			System.out.println("Final Price :: "+totalPrice);
		}
	}
	
}
