package com.seitenbau.android.sdcplanner;

import java.io.Serializable;

import com.seitenbau.android.sdcplanner.beans.Talk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TalkActivity extends Activity {

	private TextView titleTextView;
	private TextView speakerTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.talk_details);
		titleTextView = (TextView) findViewById(R.id.talkdetail_title_text);
		speakerTextView = (TextView) findViewById(R.id.talkdetail_speaker_text);

		Intent intent = getIntent();
		Talk talk = null;
		try {
			talk = (Talk) intent.getSerializableExtra("talk");
		} catch (Exception e) {
			// TODO: handle exception
		}

		titleTextView.setText(talk.getTitle());
		speakerTextView.setText(talk.getSpeaker());

	}
}
