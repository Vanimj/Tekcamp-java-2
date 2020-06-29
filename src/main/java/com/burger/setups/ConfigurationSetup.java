package com.burger.setups;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.burger.items.Bread;
import com.burger.items.Drink;
import com.burger.items.Meat;
import com.burger.items.Side;
import com.burger.items.Toppings;

public class ConfigurationSetup {

	/**
	 * getAllMeatTypesWithPrices method setup defined for accessing all Meat Types. This method returns all
	 * meat objects in the form of Map.
	 * @return Map
	 */
	public  Map<Integer,Meat> getAllMeatTypesWithPrices() {
		Map<Integer,Meat> meatMap = new HashMap<Integer,Meat>();
			meatMap.put(Meat.CHICKEN,new Meat(Meat.CHICKEN,"CHICKEN",2));
			meatMap.put(Meat.BEEF,new Meat(Meat.BEEF,"BEEF",12));
			meatMap.put(Meat.STEAK,new Meat(Meat.STEAK,"STEAK",8));
		return meatMap;
	}
	
	public  Map<Integer,Bread> getAllBreadTypesWithPrices() {
		Map<Integer,Bread> breadMap = new HashMap<Integer,Bread>();
			breadMap.put(Bread.ITALIAN,new Bread(Bread.ITALIAN,"ITALIAN",1));
			breadMap.put(Bread.BAKE,new Bread(Bread.BAKE,"BAKE",2));
			breadMap.put(Bread.FRIED,new Bread(Bread.FRIED,"FRIED",3));
		return breadMap;
	}
	
	public  Map<Integer,Drink> getAllDrinkTypesWithPrices() {
		Map<Integer,Drink> drinkMap  = new HashMap<Integer,Drink>();
			drinkMap.put(Drink.DIETCOKE,new Drink(Drink.DIETCOKE,"DIETCOKE",5));
			drinkMap.put(Drink.SPRITE,new Drink(Drink.SPRITE,"SPRITE",5));
			drinkMap.put(Drink.THUMSUP,new Drink(Drink.THUMSUP,"THUMSUP",5));
		return drinkMap;
	}

	public  Map<Integer,Side> getAllSidesTypesWithPrices() {
		Map<Integer,Side> sideMap = new HashMap<Integer,Side>();
		sideMap.put(Side.FRIES,new Side(Side.FRIES,"FRIES",5));
		sideMap.put(Side.CHIPS,new Side(Side.CHIPS,"CHIPS",3));
		sideMap.put(Side.ICE_CREAM,new Side(Side.ICE_CREAM,"ICE_CREAM",5));
	return sideMap;
	}
	
	public  Map<Integer,Toppings> getAllToppingsWithPrices() {
		Map<Integer,Toppings> toppingsMap = new HashMap<Integer,Toppings>();
			toppingsMap.put(Toppings.lettuce,new Toppings(Toppings.lettuce,"lettuce",1));
			toppingsMap.put(Toppings.tomatoes,new Toppings(Toppings.tomatoes,"tomatoes",2));
			toppingsMap.put(Toppings.carrots,new Toppings(Toppings.carrots,"carrots",3));
			
			toppingsMap.put(Toppings.cheese,new Toppings(Toppings.cheese,"cheese",4));
			toppingsMap.put(Toppings.bacon,new Toppings(Toppings.bacon,"bacon",3));
			toppingsMap.put(Toppings.ketchup,new Toppings(Toppings.ketchup,"ketchup",2));
		
		return toppingsMap;
	}
	
	public Set<Integer> getUnHealthyMappingList() {
		Set<Integer> unHealthyToppingsSet = new HashSet<Integer>();
		unHealthyToppingsSet.add(Toppings.bacon);
		unHealthyToppingsSet.add(Toppings.cheese);
		return unHealthyToppingsSet;
		
		
	}
}
