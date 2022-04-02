package application;

public class Drink extends Item{

	public int drinkType;
	public int drinkCalories;
	
	public void setDrinkType(int Type) {
		this.drinkType = Type;
	}
	
	public int getDrinkType() {
		return this.drinkType;
	}
	
	public void setDrinkCalories(int calories) {
		this.drinkCalories = calories;
	}
	
	public int getDrinkCalories() {
		return this.drinkCalories;
	}
	
	public Drink(String name, double price, String description, int calories, int Type) {
		this.setItemName(name);
		this.setItemPrice(price);
		this.setItemDescription(description);
		this.setDrinkCalories(calories);
		this.setDrinkType(Type);
	}
}
