package com.seitenbau.android.sdcplanner.beans;

import java.util.Calendar;

public class TimeSlot {
	
	private Calendar fromTime;
	
	private Calendar toTime;
	
	public TimeSlot(Calendar fromTime, Calendar toTime) {
		super();
		this.fromTime = fromTime;
		this.toTime = toTime;
	}

	public Calendar getFromTime() {
		return fromTime;
	}

	public void setFromTime(Calendar fromTime) {
		this.fromTime = fromTime;
	}

	public Calendar getToTime() {
		return toTime;
	}

	public void setToTime(Calendar toTime) {
		this.toTime = toTime;
	}

	
	
}
