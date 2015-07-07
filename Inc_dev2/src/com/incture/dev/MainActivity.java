package com.incture.dev;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText text=(EditText) findViewById(R.id.textfield);
		final EditText text1=(EditText) findViewById(R.id.textfield1);
		final EditText text2=(EditText) findViewById(R.id.textfield2);
		Button b1=(Button) findViewById(R.id.button1);
		Button b2=(Button) findViewById(R.id.button2);
		Button b3=(Button) findViewById(R.id.button3);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text1.setText(text.getText().toString());
				text.setText("");
				
				
			}
		});
		
		
b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text2.setText(text1.getText().toString());
				text1.setText("");
				
				
			}
		});



b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		text.setText(text2.getText().toString());
		text2.setText("");
		
		
	}
});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
