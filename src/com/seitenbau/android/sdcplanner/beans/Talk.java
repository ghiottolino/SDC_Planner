package com.seitenbau.android.sdcplanner.beans;

import java.io.Serializable;

public class Talk implements Serializable{
	
	private String title;
	
	private String description;
	
	private String speaker;

	private TimeSlot timeSlot;
	
	private Room room;
	
	public Talk()
	{
	    
	}
	
	public Talk(String title, String description, String speaker,
			TimeSlot timeSlot, Room room) {
		super();
		this.title = title;
		this.description = description;
		this.speaker = speaker;
		this.timeSlot = timeSlot;
		this.room = room;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
	

}
