package com.seitenbau.android.sdcplanner;


import com.seitenbau.android.sdcplanner.beans.Talk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TalkActivity extends Activity {

	private TextView titleTextView;
	private TextView speakerTextView;
        private TextView subtitleTextView;
        private TextView abstractTextView;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.talk_details);
		titleTextView = (TextView) findViewById(R.id.talkdetail_title_text);
		speakerTextView = (TextView) findViewById(R.id.talkdetail_speaker_text);
		subtitleTextView = (TextView) findViewById(R.id.talkdetail_subtitle_text);
		abstractTextView = (TextView) findViewById(R.id.talkdetail_abstract_text);

		Intent intent = getIntent();
		Talk talk = null;
		try {
			talk = (Talk) intent.getSerializableExtra("talk");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		titleTextView.setText(talk.getTitle());
		speakerTextView.setText(talk.getSpeaker());
		subtitleTextView.setText(talk.getSubtitle(this));
		abstractTextView.setText(talk.getDescription());
                

	}
}
