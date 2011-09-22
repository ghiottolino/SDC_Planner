package com.seitenbau.android.sdcplanner.beans;

import java.io.Serializable;
import java.util.Calendar;

import android.content.Context;
import android.text.format.DateUtils;

public class Talk implements Serializable{
	
	private String title;
	
	private String room;
	
	private String speakers;
	
	private String teaser;

	public String getTitle() {
		return title;
	}
	
	public String getSubtitle() {
		return room;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getSpeakers() {
		return speakers;
	}

	public void setSpeakers(String speakers) {
		this.speakers = speakers;
	}

	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

}
