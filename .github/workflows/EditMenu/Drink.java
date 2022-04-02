package editMenu;

public class Drink extends Item{

	public int drinkType;
	
	public void setDrinkType(int Type) {
		this.drinkType = Type;
	}
	
	public int getDrinkType() {
		return this.drinkType;
	}
	
	
	public Drink(String name, double price, String description, int calories, int Type, String img_addr) {
		this.setItemName(name);
		this.setItemPrice(price);
		this.setItemDescription(description);
		this.setItemCalories(calories);
		this.setDrinkType(Type);
		this.setItemPictureAddress(img_addr);
	}
}
