package com.java.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	private String booknames;
	private String bookprices;

public String getBooknames() {
		return booknames;
	}

	public void setBooknames(String booknames) {
		this.booknames = booknames;
	}

	public String getBookprices() {
		return bookprices;
	}

	public void setBookprices(String bookprices) {
		this.bookprices = bookprices;
	}

	//no-argument constructor
	protected LimitConfiguration() {
	}

//generating getters
	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}

//Generating constructor using fields
	public LimitConfiguration(int maximum, int minimum) {
		//super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public LimitConfiguration(String booknames, String bookprices) {
		//super();
		this.booknames = booknames;
		this.bookprices = bookprices;		
	}
	
	public LimitConfiguration(int maximum, int minimum, String booknames, String bookprices) {
		//super();
		this.maximum = maximum;
		this.minimum = minimum;
		this.booknames = booknames;
		this.bookprices = bookprices;
	}
	
}