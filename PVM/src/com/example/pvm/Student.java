package com.example.pvm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Student extends Activity {
	Button b1;
	EditText t1,t2,t3,t4;
	String s1,s2,s3,s4;
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student);
	t1=(EditText)findViewById(R.id.editText1);
	t2=(EditText)findViewById(R.id.editText2);
	t3=(EditText)findViewById(R.id.editText3);
	t4=(EditText)findViewById(R.id.editText4);
	db=openOrCreateDatabase("ss", Context.MODE_PRIVATE,null);
	db.execSQL("create table if not exists students(name varchar(10),course varchar(10),email varchar(10),password varchar(10))");
    b1=(Button)findViewById(R.id.button1);
	b1.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			s1=t1.getText().toString();
			s2=t2.getText().toString();
			s3=t3.getText().toString();
			s4=t4.getText().toString();
			if(s1.trim().length()==0||s2.trim().length()==0||s3.trim().length()==0||s4.trim().length()==0)
			{
				Toast.makeText(Student.this, "Incorrect Details",Toast.LENGTH_LONG).show();
			}
			else
			{
				db.execSQL("insert into students values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
				Toast.makeText(Student.this,"Successfully Registered",Toast.LENGTH_LONG).show();
			}
			
		}
});

}
}

