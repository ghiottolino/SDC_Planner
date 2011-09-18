package com.seitenbau.android.sdcplanner.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class TimeSlot implements Serializable{
	
	private Calendar fromTime = Calendar.getInstance();
	
	private Calendar toTime =Calendar.getInstance();
	
	public TimeSlot(long fromTime, long toTime) {
            super();
            this.fromTime.setTimeInMillis(fromTime);
            this.toTime.setTimeInMillis(toTime);
    }
	
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
