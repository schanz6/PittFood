package com.example.andriodtest;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import java.util.*;

public class MainActivity extends Activity {
	 private static String logtag = "pittfood";
	 private static TextView out;
	 private static Food food;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		int total = 0;
		Button hold[] = new Button[7];
		
		SharedPreferences sett= HomeScreen.sett; 
	
		
		
		switch(sett.getInt("total", 0)){
		case 7:
			setContentView(R.layout.sevenbutton);
			break;
		case 6:
			setContentView(R.layout.sixbutton);
			break;
		case 5:
			setContentView(R.layout.fivbutton);
			break;
		case 4:
			setContentView(R.layout.fourbutton);
			break;
		case 3:
			setContentView(R.layout.activity_main);
			break;
		case 2:
			setContentView(R.layout.twobutton);
			break;
		case 1:
			setContentView(R.layout.onebutton);
			break;
		case 0:
			setContentView(R.layout.nobutton);
			break;
		}
		
		
		
		
		
		switch(sett.getInt("total", 0)){
		case 7:
			Button sev = (Button)findViewById(R.id.seven); 
			hold[6]=sev;
		case 6:
			Button six = (Button)findViewById(R.id.six); 
			hold[5]=six;
		case 5:
			Button five = (Button)findViewById(R.id.five); 
			hold[4]=five;
		case 4:
			Button four = (Button)findViewById(R.id.four); 
			hold[3]= four;
		case 3:
			Button three = (Button)findViewById(R.id.three); 
			hold[2] = three;
		case 2:
			Button two = (Button)findViewById(R.id.two);
			hold[1]= two;
		case 1:
			Button one = (Button)findViewById(R.id.one); 
			hold[0]=one;
			
		}
		
		
		int count = 0;
		if(sett.getBoolean("fast", false)){
			hold[count].setText("Fast Food");
			hold[count++].setOnClickListener(fastListener);
		}
		if(sett.getBoolean("sit", false)){
			hold[count].setText("Sit Down");
			hold[count++].setOnClickListener(sitListener);
		}
		if(sett.getBoolean("ten", false)){
			hold[count].setText("Under 10");
			hold[count++].setOnClickListener(tenListener);
		}
		if(sett.getBoolean("twenty", false)){
			hold[count].setText("Under 20");
			hold[count++].setOnClickListener(twentyListener);
		}
		if(sett.getBoolean("eth", false)){
			hold[count].setText("Ethnic");
			hold[count++].setOnClickListener(ethListener);
		}
		if(sett.getBoolean("onC", false)){
			hold[count].setText("On Campus");
			hold[count++].setOnClickListener(onCListener);
		}
		if(sett.getBoolean("all", false)){
			hold[count].setText("All");
			hold[count++].setOnClickListener(allListener);
		}
			
	
		
	      out =  (TextView) findViewById(R.id.textView1);
		 
		  Button set = (Button)findViewById(R.id.set); 
		  set.setOnClickListener(setListener); 
	}
	
	 private OnClickListener fastListener = new OnClickListener() {
	        public void onClick(View v){
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        
	        	out.setText(food.get(1));
	        	
	        }
	    };
	    private OnClickListener sitListener = new OnClickListener() {
	        public void onClick(View v){
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        
	        	out.setText(food.get(3));
	        	
	        }
	    };
	    
	    private OnClickListener tenListener = new OnClickListener() {
	        public void onClick(View v){
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        
	        	out.setText(food.get(5));
	        	
	        }
	    };
	    private OnClickListener twentyListener = new OnClickListener() {
	        public void onClick(View v){
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        
	        	out.setText(food.get(6));
	        	
	        }
	    };
	    private OnClickListener ethListener = new OnClickListener() {
	        public void onClick(View v){
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        
	        	out.setText(food.get(4));
	        	
	        }
	    };
	    
	    private OnClickListener allListener = new OnClickListener() {
	        public void onClick(View v) {
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        	out.setText(food.get(7));
	        }
	    };
	    
	    private OnClickListener onCListener = new OnClickListener() {
	        public void onClick(View v) {
	          //Log.d(logtag,"onClick() called - start button");              
	          //Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
	          //Log.d(logtag,"onClick() ended - start button");
	        	out.setText(food.get(2));
	        }
	   };
	   
	   private OnClickListener setListener = new OnClickListener() {
	        public void onClick(View v) {
	         
	        	 //Intent next = new Intent(getBaseContext(), SettingActivity.class);
	        	 //startActivity(next);
	        	finish();
	        }
	    };
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	  @Override
	  protected void onStart() {//activity is started and visible to the user
	   Log.d(logtag,"onStart() called");
	   super.onStart();  
	  }
	  @Override
	  protected void onResume() {//activity was resumed and is visible again
	   Log.d(logtag,"onResume() called");
	   super.onResume();
	    
	  }
	  @Override
	  protected void onPause() { //device goes to sleep or another activity appears
	   Log.d(logtag,"onPause() called");//another activity is currently running (or user has pressed Home)
	   super.onPause();
	    
	  }
	  @Override
	  protected void onStop() { //the activity is not visible anymore
	   Log.d(logtag,"onStop() called");
	   super.onStop();
	    
	  }
	  @Override
	  protected void onDestroy() {//android has killed this activity
	    Log.d(logtag,"onDestroy() called");
	    super.onDestroy();
	  } 
	 //  public class 
	  
	  
		  
	  

}
