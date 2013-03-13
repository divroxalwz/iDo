package com.example.ido.view;

import com.example.ido.R;
import com.example.ido.R.id;
import com.example.ido.R.layout;
import com.example.ido.R.menu;
import com.example.ido.controller.ApplicationNavigationHandler;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class ViewAllTasksActivity extends GeneralActivity {

	private ListView allTasksListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_all_tasks);
		
		// set action listener for allTasksListView
		allTasksListView = (ListView) findViewById(R.id.activity_view_all_tasks_Listview_all_tasks);
		allTasksListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				allTaskListViewItemClickHandler(arg0, arg1, arg2);
			}
		});
	}
	
	// Handle the item clicked event of allTasksListView
	private void allTaskListViewItemClickHandler(AdapterView<?> adapterView, View listView, int selectedItemId){
		ApplicationNavigationHandler.viewTaskDetail(this);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
		case R.id.activity_view_all_tasks_Menu_actionbar_Item_add_task:
			ApplicationNavigationHandler.addNewTask(this);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_all_tasks, menu);
		return true;
	}

}
