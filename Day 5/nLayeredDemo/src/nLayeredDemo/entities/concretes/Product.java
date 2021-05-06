// github.com/hdayanir

package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity{
	private int id;
	private int cetegoryId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
	public Product() {
		//super();
	}
	public Product(int id, int cetegoryId, String name, double unitPrice, int unitsInStock) {
		//super();
		this.id = id;
		this.cetegoryId = cetegoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCetegoryId() {
		return cetegoryId;
	}
	public void setCetegoryId(int cetegoryId) {
		this.cetegoryId = cetegoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
