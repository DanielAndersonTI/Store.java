package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item {
	private String compositor;
	private String [] performaces = new String [5];
	private String recordingLocation;
	private Date releaseDate;
	private int performace_count = 0;
	/**
	 * @return the compositor
	 */
	
	public ClassicalCD(String titulo, double preco, int quantidade, String compositor, String[] performaces, String recordinglocation, Date releaseDate) {
		super(titulo, preco, quantidade);
		this.setCompositor(compositor);
		this.setRecordingLocation(recordinglocation);
		this.setReleaseDate(releaseDate);
		
	for(int i=0; i<performaces.length; i++) {
		if(performaces[i] != null) {
			addPerformace(performaces[i]);
		}
	}
	
	this.performaces = performaces;
	}
	
	public String getCompositor() {
		return compositor;
	}
	/**
	 * @param compositor the compositor to set
	 */
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	/**
	 * @return the recordingLocation
	 */
	public String getRecordingLocation() {
		return recordingLocation;
	}
	/**
	 * @param recordingLocation the recordingLocation to set
	 */
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void addPerformace (String performace) {
		if(performace_count >= performaces.length) 
			System.out.println("The performer Array is full! Cannot add");
		else { 
			performaces[performace_count] = performace;
			performace_count++;
		}
		
	}
	
	public void showPerformaces () {
		if(performace_count == 0)
			System.out.println("No performers have been added for this CD");
		for(int i = 0; i < performace_count; i++)
			System.out.println("Performer: " + performaces[i]);
	}
}