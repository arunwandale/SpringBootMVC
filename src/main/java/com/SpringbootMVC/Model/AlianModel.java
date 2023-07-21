package com.SpringbootMVC.Model;

public class AlianModel {
	private int id;
	private String name;
	
	public AlianModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "AlianModel [id=" + id + ", name=" + name + "]";
	}
	
}
