package model.entities;

public class Product {
	
	private String name;
	private Integer quantity;
	private Double price;
	
	
	public Product() {
	}
	
	public Product(String name, Integer quantity, Double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setQuantity(Integer quantity) {
		
		this.quantity = (quantity > 0) ? quantity : 0;
	}
	
	public Integer getQuantity() {
		
		return quantity;
	}
	
	public void setPrice(Double price) {
		
		this.price = (price > 0.0) ? price : 0.0;
	}
	
	public Double getPrice() {
		
		return price;
	}
	
	public Double total() {
		
		return getPrice() * getQuantity();
	}

}
