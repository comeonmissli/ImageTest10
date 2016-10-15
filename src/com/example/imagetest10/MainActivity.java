package com.example.imagetest10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
   private boolean flag=true;
   private ImageButton myBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myBtn=(ImageButton) this.findViewById(R.id.myImg);
		myBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			if(flag){
				myBtn.setImageResource(R.drawable.green);
			}else{
				myBtn.setImageResource(R.drawable.blue);
			}
				flag=!flag;
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
