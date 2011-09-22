package com.seitenbau.android.sdcplanner;


import com.seitenbau.android.sdcplanner.beans.Talk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TalkDetailActivity extends Activity {



	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.talk_details);
		TextView titleTextView = (TextView) findViewById(R.id.talkdetail_title_text);
		TextView speakerTextView = (TextView) findViewById(R.id.talkdetail_speaker_text);
		TextView subtitleTextView = (TextView) findViewById(R.id.talkdetail_subtitle_text);
		TextView abstractTextView = (TextView) findViewById(R.id.talkdetail_abstract_text);

		Intent intent = getIntent();
		Talk talk = null;
		try {
			talk = (Talk) intent.getSerializableExtra("talk");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		titleTextView.setText(talk.getTitle());
		speakerTextView.setText(talk.getSpeakers());
		subtitleTextView.setText(talk.getRoom());
		abstractTextView.setText(talk.getTeaser());
                

	}
}
