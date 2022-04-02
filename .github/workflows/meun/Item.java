package application;

import java.io.FileInputStream;

import java.io.InputStream;

public abstract class Item {

	public String itemName = "";
	public double itemPrice = 0;
	public String itemDescription = "";
	public int itemCalories;
	public String itemPictureAddress;
	
	
	public String getItemName() { 
		return this.itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemPrice() {
		return this.itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public String getItemDescription() {
		return this.itemDescription;
	}
	
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	public String getItemPictureAddress() {
		return this.getItemPictureAddress();
	}
	
	public void setItemPictureAddress(String Address) {
		this.itemPictureAddress = Address;
	}
	
	public void setItemCalories(int calories) {
		this.itemCalories = calories;
	}
	
	public int getItemCalories() {
		return this.itemCalories;
	}
	
}



