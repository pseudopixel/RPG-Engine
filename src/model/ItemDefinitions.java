package model;

public class ItemDefinitions {
	private final String name;
	private final String description;
	private int buyPrice, sellPrice;
	
	public ItemDefinitions(String name, String description, int buyPrice, int sellPrice) {
		this.name = name;
		this.description = description;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	
	public ItemDefinitions() {
		name = "";
		description = "";
		buyPrice = 0;
		sellPrice = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getBuyPrice() {
		return buyPrice;
	}
	
	public int getSellPrice() {
		return sellPrice;
	}
	
	public void setBuyPrice(int newPrice) {
		this.buyPrice = newPrice;
	}
	
	public void setSellPrice(int newPrice) {
		this.sellPrice = newPrice;
	}
}
