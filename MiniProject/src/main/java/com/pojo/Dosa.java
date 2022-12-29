package com.pojo;

public class Dosa {
	private int id;
	private String Name;
	private int price;
	
	
	public Dosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dosa(int id, String name, int price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
