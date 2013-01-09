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

public class HomeScreen extends Activity {
	public static 	SharedPreferences sett;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		sett = getPreferences(0);
		setContentView(R.layout.open);
		  Button set = (Button)findViewById(R.id.set);        
		 set.setOnClickListener(setListener); 
		 Button start = (Button)findViewById(R.id.sta);        
		 start.setOnClickListener(staListener); 
		 Button load = (Button)findViewById(R.id.load);        
		load.setOnClickListener(loadListener); 
		 
	}
	
	private OnClickListener setListener = new OnClickListener() {
        public void onClick(View v){
          
        	Intent next = new Intent(getBaseContext(), SettingActivity.class);
       	    startActivity(next);
        	
        }
    };
    
    private OnClickListener staListener = new OnClickListener() {
        public void onClick(View v){
        	Intent main = new Intent(getBaseContext(), MainActivity.class);
       	    startActivity(main);
        	
        	
        	
        }
    };
    
    private OnClickListener loadListener = new OnClickListener() {
        public void onClick(View v){
          
        	
        	
        }
    };
}