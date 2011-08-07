package com.seitenbau.android.sdcplanner;

import java.util.List;

import com.seitenbau.android.sdcplanner.adapter.TalkListAdapter;
import com.seitenbau.android.sdcplanner.beans.Talk;
import com.seitenbau.android.sdcplanner.data.TestData;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class TalkListActivity extends Activity {
	
    private ListView mListView;

	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.talklist);
        mListView = (ListView) findViewById(R.id.talklist_list);

        List<Talk> talks = TestData.getAllTalks();
        TalkListAdapter talkListAdapter = new TalkListAdapter(this, R.layout.talklist_item,  R.id.talklist_item_text, talks);
        mListView.setAdapter(talkListAdapter);
        
        
        
    }
}