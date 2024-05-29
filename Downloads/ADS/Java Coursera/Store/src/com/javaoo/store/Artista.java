package com.javaoo.store;

public class Artista {
	private String name;
	private String [] memberNames = new String [20];
	private String [] memberInstruments = new String [20];
	/**
	 * @return the name
	 */
	public Artista (String name) {
		super();
		this.setName(name);	
	}
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
