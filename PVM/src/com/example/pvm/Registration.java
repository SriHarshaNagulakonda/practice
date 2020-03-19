package com.example.pvm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends Activity {
	Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		 b2=(Button)findViewById(R.id.button2); 
		 b2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				Intent a=new Intent(Registration.this,Faculty.class);
				startActivity(a);
			}	
		    });
		 b1=(Button)findViewById(R.id.button1);
		 b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent b=new Intent(Registration.this,Student.class);
				startActivity(b);
			}				
			}); 
	}
}
