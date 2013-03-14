package com.example.ido.view;

import com.example.ido.R;
import com.example.ido.R.layout;
import com.example.ido.R.menu;
import com.example.ido.controller.ConfirmCancelDialogHandler;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class ModifyGroupActivity extends GeneralActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modify_group);
	}

	@Override
	public void onBackPressed() {
		// Show the confirmation dialog
		// The rest (leave activity or not), the function ApplicationDialogHandler.showConfirmCancelDialog() will handle
		ConfirmCancelDialogHandler.showConfirmCancelDialog(this);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){

		// When user select Cancel or Home button, show a confirmation dialog
		case R.id.activity_modify_group_Menu_actionbar_Item_cancel:
		case android.R.id.home:
			// Show the confirmation dialog
			// The rest (leave activity or not), the function ApplicationDialogHandler.showConfirmCancelDialog() will handle
			ConfirmCancelDialogHandler.showConfirmCancelDialog(this);
			return true;

		// default case, return the base class function
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.modify_group, menu);
		return true;
	}

}
