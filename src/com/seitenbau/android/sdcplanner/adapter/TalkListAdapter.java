package com.seitenbau.android.sdcplanner.adapter;

import java.util.List;

import com.seitenbau.android.sdcplanner.R;
import com.seitenbau.android.sdcplanner.beans.Talk;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

public class TalkListAdapter extends ArrayAdapter<Talk> {

    List<Talk> talks;

    Context context;

    public TalkListAdapter(Context context, int resource,
            int textViewResourceId, List<Talk> objects) {
        super(context, resource, textViewResourceId, objects);
        this.talks = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);

        TextView title = (TextView) view.findViewById(R.id.talklist_item_title);
        TextView speaker = (TextView) view
                .findViewById(R.id.talklist_item_speaker);
        TextView subtitle = (TextView) view
                .findViewById(R.id.talklist_item_subtitle);

        Talk talk = talks.get(position);
        title.setText(talk.getTitle());
        speaker.setText(talk.getSpeakers());
        subtitle.setText(talk.getRoom());
        return view;
    }

}
