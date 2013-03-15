package com.example.ido.view;

import com.example.ido.R;
import com.example.ido.R.id;
import com.example.ido.R.layout;
import com.example.ido.R.menu;
import com.example.ido.R.string;
import com.example.ido.controller.ApplicationNavigationHandler;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
		case R.id.action_settings:
			// click on setting button wil navigate to SettingActivity
			ApplicationNavigationHandler.showSetting(this);
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private ListView mainListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// set action listener for mainListView
		mainListView = (ListView) findViewById(R.id.activity_main_Listview_main_option);
		mainListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View listView, int selectedItemId,
					long arg4) {
				// TODO Auto-generated method stub
				mainListViewOnItemClickHandler(adapterView, listView, selectedItemId, arg4);
			}
		});
	}

	// handler for mainListView item click event
	private void mainListViewOnItemClickHandler(AdapterView<?> adapterView, View listView, int selectedItemId,
			long arg4) {
		//get selected item
		String selectedItem = (String) mainListView.getItemAtPosition(selectedItemId);
		
		// check which one the user want to navigate to
		if(selectedItem.equals(getString(R.string.activity_main_Listview_main_option_Item_show_all_groups_String_title))){
			ApplicationNavigationHandler.showAllGroups(this);
		}
		if(selectedItem.equals(getString(R.string.activity_main_Listview_main_option_Item_show_all_tasks_String_title))){
			ApplicationNavigationHandler.showAllTasks(this);
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
