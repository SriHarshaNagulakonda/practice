package com.example.pvm;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {

	Button b1;
	EditText t1,t2;
	String user,pwd;
	TextView tv1;
    void clear()
	{
		t1.setText("");
		t2.setText("");
	}
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    t1=(EditText)findViewById(R.id.editText1);
    t2=(EditText)findViewById(R.id.editText2);
    tv1=(TextView)findViewById(R.id.textView1);
    b1=(Button)findViewById(R.id.button1);
    b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			user=t1.getText().toString();
			pwd=t2.getText().toString();
				
				if((user.equals("sms"))&&(pwd.equals("sms"))||(user.equals("student"))&&(pwd.equals("student"))||(user.equals("course"))&&(pwd.equals("course")))
			{	
				Intent a=new Intent(Login.this,Message.class);
				startActivity(a); 
				tv1.setText(String.valueOf(""));
				clear();
			}
			else
			{
				Intent a=new Intent(Login.this,Cont.class);
				startActivity(a); 
				tv1.setText(String.valueOf(""));
				clear();
				
			}
		}
				 
		
	});
    
    
    
    }
}


    
    

