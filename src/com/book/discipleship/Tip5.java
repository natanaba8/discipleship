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

public class Tip5 extends Activity {
 Button  t5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tip5);
		t5 = (Button)findViewById(R.id.t5);
		t5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Tip5.this, Content.class);
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
			startActivity(new Intent(Tip5.this, About.class));
			return true;
		case R.id.action_Exit:
			AlertDialog.Builder builder = new AlertDialog.Builder(Tip5.this);
			builder.setMessage(Messages.getString("Tip5.0")); //$NON-NLS-1$
			builder.setCancelable(false);
			builder.setPositiveButton(Messages.getString("Tip5.1"), new DialogInterface.OnClickListener() { //$NON-NLS-1$
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Tip5.this.finish();
					
				}
			});
			builder.setNegativeButton(Messages.getString("Tip5.2"), new DialogInterface.OnClickListener() { //$NON-NLS-1$
				
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
