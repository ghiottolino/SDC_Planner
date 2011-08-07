package com.seitenbau.android.sdcplanner.data;

import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import com.seitenbau.android.sdcplanner.beans.Room;
import com.seitenbau.android.sdcplanner.beans.Talk;
import com.seitenbau.android.sdcplanner.beans.TimeSlot;

public class TestData {

	private static Room ROOM1 = new Room("BIG_ROOM");
	
	private static Room ROOM2 = new Room("SMALL_ROOM");
	
	private static TimeSlot TIMESLOT_1 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	private static TimeSlot TIMESLOT_2 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	private static TimeSlot TIMESLOT_3 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	private static TimeSlot TIMESLOT_4 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	private static TimeSlot TIMESLOT_5 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	private static TimeSlot TIMESLOT_6 = new TimeSlot(Calendar.getInstance(),Calendar.getInstance());
	
	private static String TITLE_1 = "a Title";
	
	private static String DESCRIPTION_1 = "a Description";
	
	private static String SPEAKER_1 = "a cool Speaker";
	
	
	private static Talk TALK_1 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_1, ROOM1);
	private static Talk TALK_2 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_1, ROOM2);

	private static Talk TALK_3 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_2, ROOM1);
	private static Talk TALK_4 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_2, ROOM2);

	private static Talk TALK_5 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_3, ROOM1);
	private static Talk TALK_6 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_3, ROOM2);

	private static Talk TALK_7 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_4, ROOM1);
	private static Talk TALK_8 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_4, ROOM2);
	
	private static Talk TALK_9 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_5, ROOM1);
	private static Talk TALK_10 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_5, ROOM2);
	
	private static Talk TALK_11 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_6, ROOM1);
	private static Talk TALK_12 = new Talk(TITLE_1, DESCRIPTION_1, SPEAKER_1, TIMESLOT_6, ROOM2);
	
	
	
	public static List<Talk> getAllTalks()
	{
		List<Talk> talks = new Vector<Talk>();
		talks.add(TALK_1);
		talks.add(TALK_2);
		talks.add(TALK_3);
		talks.add(TALK_4);
		talks.add(TALK_5);
		talks.add(TALK_6);
		talks.add(TALK_7);
		talks.add(TALK_8);
		talks.add(TALK_9);
		talks.add(TALK_10);
		talks.add(TALK_11);
		talks.add(TALK_12);
		return talks;
	}
	
	
}
