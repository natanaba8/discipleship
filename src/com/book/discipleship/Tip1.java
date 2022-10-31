package com.book.discipleship;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tip1 extends Activity {
  Button  t1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tip1);
		t1 = (Button)findViewById(R.id.t1);
		t1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Tip1.this, Content.class);
				startActivity(i);
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater awsome = getMenuInflater();
		awsome.inflate(R.menu.about,menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
		case R.id.action_about:
			startActivity(new Intent(Tip1.this, About.class));
			return true;
		case R.id.action_Exit:
			AlertDialog.Builder builder = new AlertDialog.Builder(Tip1.this);
			builder.setMessage("Are you sure you want to exit");
			builder.setCancelable(false);
			builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
				
			@Override
				public void onClick(DialogInterface dialog, int which) {
					Tip1.this.finish();
					
				}
			});
			builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.cancel();
					
				}
			});
			AlertDialog alert = builder.create();
			alert.show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
