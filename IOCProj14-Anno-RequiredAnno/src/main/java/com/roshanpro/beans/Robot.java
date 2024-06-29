package com.roshanpro.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		System.out.println("Robot.setId()");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		System.out.println("Robot.setName()");
		this.name = name;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		System.out.println("Robot.setLab()");
		this.lab = lab;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", lab=" + lab + ", price=" + price + "]";
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		System.out.println("Robot.setPrice()");
		this.price = price;
	}
	private int id;
	private String name;
	private String lab;
	private double price;
}
