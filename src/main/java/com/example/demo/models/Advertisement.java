package com.example.demo.models;

public class Advertisement {

	private String title;
	private int id;

	public Advertisement(String title, int id) {
		super();
		this.title = title;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Advertisement() {
		super();
	}
	
}
