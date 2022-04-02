package application;

public class Food extends Item {
	
	public String foodType;
		
	public void setFoodType(String Type) {
		this.foodType = Type;
	}
	
	public String getFoodType() {
		return this.foodType;
	}
	
	
	public Food(String name, double price, String Description, int calories, String type) {
		this.setItemName(name);
		this.setItemPrice(price);
		this.setItemDescription(Description);
		this.setItemCalories(calories);
		this.setFoodType(type);
	}
	

}
