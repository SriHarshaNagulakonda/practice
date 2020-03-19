package com.example.pvm;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;
public class Message extends Activity {
	EditText number,message,t3;
	Button b,b1;
	String sent="SMS_SENT";
	String deliver="SMS_DELIVERED";
	int n;
	int send_count=0,deliver_count=0;
	private static final int PICK_CONTACT = 0;
	
	SeekBar seekBar;
	
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
	            number.setText(cNumber.substring(3));
	          }
	          }
	         
	         }}}

	
	
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_message);
	//	t3=(EditText)findViewById(R.id.editText3);
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		number=(EditText)findViewById(R.id.editText1);
		message=(EditText)findViewById(R.id.editText2);
		
		  seekBar=(SeekBar)findViewById(R.id.seekBar1);  
	      seekBar.setMax(10);
	      
		
	      seekBar=(SeekBar)findViewById(R.id.seekBar1);  
	        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {  
	            @Override  
	            public void onProgressChanged(SeekBar seekBar, int progress,  
	                                          boolean fromUser) {  
	                //Toast.makeText(getApplicationContext(),"seekbar progress: "+progress, Toast.LENGTH_SHORT).show();  
	            }  
	  
	            @Override  
	            public void onStartTrackingTouch(SeekBar seekBar) {  
	               // Toast.makeText(getApplicationContext(),"", Toast.LENGTH_SHORT).show();  
	            }  
	  
	            @Override  
	            public void onStopTrackingTouch(SeekBar seekBar) {  
	                Toast.makeText(getApplicationContext(),String.valueOf(seekBar.getProgress()), Toast.LENGTH_SHORT).show();  
	            }  
	        });  
		
b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		 Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
         startActivityForResult(intent, PICK_CONTACT);	
	
	}
});
	        
	        
	        b.setOnClickListener(new OnClickListener()
		
		{

			@Override
			public void onClick(View arg0) {
				b.setVisibility(0);
				//n=Integer.parseInt(t3.getText().toString());
				for (int i = 0; i < seekBar.getProgress(); i++) {
				send();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			} 
		
	});

	}
	public void send()
	{
		PendingIntent p1=PendingIntent.getBroadcast(this,0,new Intent(sent),0);
		PendingIntent p2=PendingIntent.getBroadcast(this,0,new Intent(deliver),0);
		
		registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context context,Intent intent) {
				switch(getResultCode()) {
				case Activity.RESULT_OK:
					Toast.makeText(getApplicationContext(),"sent",Toast.LENGTH_LONG).show();
					send_count++;
					if(send_count==seekBar.getProgress()){
						//b.setVisibility(1);
					}
					break;
				case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
					Toast.makeText(getApplicationContext(),"failure error",Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_NO_SERVICE:
					Toast.makeText(getApplicationContext(),"no_service",Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_NULL_PDU:
					Toast.makeText(getApplicationContext(),"null_error",Toast.LENGTH_LONG).show();
					break;
				case SmsManager.RESULT_ERROR_RADIO_OFF:
					Toast.makeText(getApplicationContext(),"radio_error",Toast.LENGTH_LONG).show();
					break;
					
				}
				
			}
		},new IntentFilter(sent));
		
		registerReceiver(new BroadcastReceiver() {
			
			@Override
			public void onReceive(Context context,Intent intent) {
				switch(getResultCode()) {
				case Activity.RESULT_OK:
					Toast.makeText(getApplicationContext(),"delivered",Toast.LENGTH_LONG).show();
					deliver_count++;
					if(deliver_count==seekBar.getProgress())
					{
						b.setVisibility(1);
					}
					break;
				case Activity.RESULT_CANCELED:
					Toast.makeText(getApplicationContext(),"not delivered",Toast.LENGTH_LONG).show();
					break;
				}	
			}
		},new IntentFilter(deliver));
		
	    
		
		
		
		SmsManager sms=SmsManager.getDefault();
		sms.sendTextMessage(number.getText().toString(),null,message.getText().toString(), p1,p2);
		Toast.makeText(getApplicationContext(),"sent",Toast.LENGTH_LONG).show();
		
		
		
	}
}

