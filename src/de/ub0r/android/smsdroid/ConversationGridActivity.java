package de.ub0r.android.smsdroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import de.ub0r.android.smsdroid.grid.R;

public class ConversationGridActivity extends Activity {
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.conversationgrid);
		GridView v = (GridView) this.findViewById(android.R.id.list);
		v.setAdapter(new ConversationAdapter(this));
	}
}
