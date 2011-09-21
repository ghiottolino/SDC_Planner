package com.seitenbau.android.sdcplanner;


import java.util.List;

import com.seitenbau.android.sdcplanner.adapter.SessionListAdapter;
import com.seitenbau.android.sdcplanner.beans.Session;
import com.seitenbau.android.sdcplanner.data.TestData;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class SessionListActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talklist);
        
        ListView listView = (ListView) findViewById(R.id.talklist_list);
        
        final List<Session> sessions = TestData.getAllSessions();
        
        SessionListAdapter adapter = new SessionListAdapter(this, R.layout.talklist_item, R.id.talklist_item_title, sessions);
        
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				Intent talkDetailIntent = new Intent(getBaseContext(),SessionDetailActivity.class);
				Session session = sessions.get(arg2);
				talkDetailIntent.putExtra("session", session);
				startActivity(talkDetailIntent);
			
				
			}
		});
        
        
    }
}