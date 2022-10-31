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
import android.widget.TextView;

public class Content extends Activity {
	TextView textView1, textView2, textView3, textView4, textView5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		textView1 = (TextView)findViewById(R.id.textView1);
		textView1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Content.this, Tip1.class);
				startActivity(i);
			}
			
		});
		
		textView2 = (TextView)findViewById(R.id.textView2);
		textView2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Content.this, Tip2.class);
				startActivity(i);
			}
			});
		
		textView3 = (TextView)findViewById(R.id.textView3);
		textView3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Content.this, Tip3.class);
				startActivity(i);
			}
			
	     });
		
		textView4 = (TextView)findViewById(R.id.textView4);
		textView4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Content.this, Tip4.class);
				startActivity(i);
			}
			
	     });
		
		textView5 = (TextView)findViewById(R.id.textView5);
		textView5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Content.this, Tip5.class);
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
			startActivity(new Intent(Content.this, About.class));
			return true;
		case R.id.action_Exit:
			AlertDialog.Builder builder = new AlertDialog.Builder(Content.this);
			builder.setMessage("Are you sure you want to exit");
			builder.setCancelable(false);
			builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Content.this.finish();
					
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
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(Content.this);
		builder.setMessage("Are you sure you want to exit");
		builder.setCancelable(false);
		builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
			System.exit(1);
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
	

	
}

	
}

