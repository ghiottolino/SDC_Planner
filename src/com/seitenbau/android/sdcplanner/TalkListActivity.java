package com.seitenbau.android.sdcplanner;

import java.util.List;

import com.seitenbau.android.sdcplanner.adapter.TalkListAdapter;
import com.seitenbau.android.sdcplanner.beans.Talk;
import com.seitenbau.android.sdcplanner.data.TestData;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class TalkListActivity extends Activity {
	
    private ListView mListView;

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talklist);
        mListView = (ListView) findViewById(R.id.talklist_list);

        final List<Talk> talks = TestData.getAllTalks();
        TalkListAdapter talkListAdapter = new TalkListAdapter(this, R.layout.talklist_item,  R.id.talklist_item_title, talks);
        mListView.setAdapter(talkListAdapter);
        // clicking on a talk
        
        OnItemClickListener itemClickListener = new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
		    	Intent talkActivity = new Intent(getBaseContext(),TalkDetailActivity.class);
		    	Talk talk = talks.get(arg2);
		        talkActivity.putExtra("talk", talk);
		    	startActivityForResult(talkActivity, 0);
							
		        
			}
        	
		};
		mListView.setOnItemClickListener(itemClickListener );
        
        
    }
}