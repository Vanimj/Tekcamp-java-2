package com.burger.data;

import java.util.ArrayList;
import java.util.List;

import com.burger.factory.BurgerFactory;
import com.burger.items.Drink;
import com.burger.items.Side;
import com.burger.types.PlainHamburger;

public class Meal {

	/*int burgerType = 0;
	int breadType = 0;
	int meatType = 0;*/
	
	PlainHamburger plainBurgerObj = null;
	Drink drinkObj = null;
	Side sideObj = null;
	
	public Drink getDrinkObj() {
		return drinkObj;
	}
	public void setDrinkObj(Drink drinkObj) {
		this.drinkObj = drinkObj;
	}

	
	public Side getSideObj() {
		return sideObj;
	}
	public void setSideObj(Side sideObj) {
		this.sideObj = sideObj;
	}

	List<Side> sideObjLst = new ArrayList<Side>();
	
	public List<Side> getSideObjLst() {
		return sideObjLst;
	}
	public void setSideObjLst(List<Side> sideObjLst) {
		this.sideObjLst = sideObjLst;
	}
	public PlainHamburger getPlainBurgerObj() {
		return plainBurgerObj;
	}
	public void setPlainBurgerObj(PlainHamburger plainBurgerObj) {
		this.plainBurgerObj = plainBurgerObj;
	}
	public PlainHamburger getBurgerObject(int burgerType) {
		return new BurgerFactory().getBurgerType(burgerType);
	}
	
	public Meal() {
		super();
	}
	
	/*public Meal(int burgerType,int breadType, int mealType) {
		this.burgerType=burgerType;
		this.breadType = breadType;
		this.meatType=meatType;
	}*/
	
	
	
	
	/*public int getBurgerType() {
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
	}*/

	
	
}
