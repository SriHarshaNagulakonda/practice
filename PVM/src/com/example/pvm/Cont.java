package com.example.pvm;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cont extends Activity {
	private static final int PICK_CONTACT = 0;
	Button b1;
	EditText t1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cont);
		
		t1=(EditText)findViewById(R.id.editText1);
		
		b1=(Button)findViewById(R.id.button1);
		t1.setText("1111111111");
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				 Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                 startActivityForResult(intent, PICK_CONTACT);	
			}
		});
	}

	    	
	    public void onActivityResult(int reqCode, int resultCode, Intent data){ super.onActivityResult(reqCode, resultCode, data);

	    switch(reqCode)
	    {
	       case (PICK_CONTACT):
	         if (resultCode == Activity.RESULT_OK)
	         {
	             Uri contactData = data.getData();
	             Cursor c = managedQuery(contactData, null, null, null, null);
	          if (c.moveToFirst())
	          {
	          String id = c.getString(c.getColumnIndexOrThrow(ContactsContract.Contacts._ID));

	          String hasPhone =
	          c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));

	          if (hasPhone.equalsIgnoreCase("1")) 
	          {
	         Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null, 
	          ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = "+ id,null, null);
	            phones.moveToFirst();
	            String cNumber = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
	            Toast.makeText(getApplicationContext(), cNumber, Toast.LENGTH_SHORT).show();
	            t1.setText(cNumber.substring(3));
	          }
	          }
	         }
	    }
	    }
	    
	}

	    
	    
	   

		//private void setCn(String cNumber){
			//t1.setText(cNumber);
		//}

//}
