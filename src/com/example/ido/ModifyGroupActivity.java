package com.example.ido;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ModifyGroupActivity extends GeneralActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modify_group);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.modify_group, menu);
		return true;
	}

}
