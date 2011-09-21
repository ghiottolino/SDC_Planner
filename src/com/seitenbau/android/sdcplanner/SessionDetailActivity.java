package com.seitenbau.android.sdcplanner;


import java.io.Serializable;

import com.seitenbau.android.sdcplanner.beans.Session;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SessionDetailActivity extends Activity{

	
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talk_details);
        
        // find views
        TextView titleTextView = (TextView) findViewById(R.id.talkdetail_title_text);
        TextView speakerTextView = (TextView) findViewById(R.id.talkdetail_speaker_text);
        TextView subtitleTextView = (TextView) findViewById(R.id.talkdetail_subtitle_text);
        TextView abstractTextView = (TextView) findViewById(R.id.talkdetail_abstract_text);

        //retrieve a Session
        Intent intent = getIntent();
        Session session = (Session) intent.getSerializableExtra("session");
        
        

        
        titleTextView.setText(session.getTitle());
        speakerTextView.setText(session.getSpeakers());
        subtitleTextView.setText(session.getSubtitle());
        abstractTextView.setText(session.getTeaser());
        
      
        
    }
	
	
}
