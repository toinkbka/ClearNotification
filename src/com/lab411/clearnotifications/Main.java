package com.lab411.clearnotifications;

import android.app.Activity;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
//	EditText txt;
	NotiListener notiLi;
	StatusBarNotification sbn;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn=(Button)findViewById(R.id.button1);
//		txt=(EditText)findViewById(R.id.txt);
		btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				String a;
//				a=txt.toString();
				notiLi.clearNotificationExample(sbn);
			}
		});
	}
}
