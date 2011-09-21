package com.seitenbau.android.sdcplanner.adapter;

import java.util.List;

import com.seitenbau.android.sdcplanner.R;
import com.seitenbau.android.sdcplanner.beans.Session;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SessionListAdapter extends ArrayAdapter<Session> {

	private Context context;

	private List<Session> sessions;

	public SessionListAdapter(Context context, int resource, int textViewResourceId,
			List<Session> sessions) {
		super(context,resource, textViewResourceId, sessions);
		this.context = context;
		this.sessions = sessions;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = super.getView(position, convertView, parent);

		TextView title = (TextView) view.findViewById(R.id.talklist_item_title);
		TextView speakers = (TextView) view
				.findViewById(R.id.talklist_item_speaker);
		TextView subtitle = (TextView) view
				.findViewById(R.id.talklist_item_subtitle);

		Session session = sessions.get(position);

		title.setText(session.getTitle());
		speakers.setText(session.getSpeakers());
		subtitle.setText(session.getSubtitle());

		return view;

	}

	@Override
	public boolean isEnabled(int position) {
		return true;
	}

}
