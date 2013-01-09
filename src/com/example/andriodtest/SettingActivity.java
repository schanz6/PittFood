package com.example.andriodtest;

import android.app.Activity;

import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import java.util.*;
import android.content.*;


public class SettingActivity extends Activity{
    private  CheckBox fast, eth, sit, twenty, ten,all, onC;
    private RadioGroup rad;
   // private SharedPreferences settings; 
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		SharedPreferences settings = HomeScreen.sett;
		 fast =(CheckBox)  findViewById(R.id.Cfast);
		 eth =(CheckBox)  findViewById(R.id.Cethnic);
		 sit =(CheckBox)  findViewById(R.id.Csit);
		 twenty =(CheckBox)  findViewById(R.id.C20);
		 ten =(CheckBox)  findViewById(R.id.C10);
		 all =(CheckBox)  findViewById(R.id.Call);
		 onC =(CheckBox)  findViewById(R.id.Con);
		 
		 all.setChecked(settings.getBoolean("all", false));
		 fast.setChecked(settings.getBoolean("fast", false));
		 eth.setChecked(settings.getBoolean("eth", false));
		 sit.setChecked(settings.getBoolean("sit", false));
		 ten.setChecked(settings.getBoolean("ten", false));
		 twenty.setChecked(settings.getBoolean("twenty", false));
		 onC.setChecked(settings.getBoolean("onC", false));
		 
		 Button back =  (Button)findViewById(R.id.back); 
		  back.setOnClickListener(backListener); 
		  
		  rad = (RadioGroup) findViewById(R.id.randome);
		rad.check(settings.getInt("rad", rad.getCheckedRadioButtonId()));
		  
		     
	}
	
	 
		
	 private OnClickListener backListener = new OnClickListener() {
	        public void onClick(View v) {
	        	
	        	
	        	SharedPreferences settings = HomeScreen.sett;
	             SharedPreferences.Editor e = settings.edit();
	        	
	             e.putBoolean("fast",fast.isChecked());
	        	 e.putBoolean("eth",eth.isChecked());
	        	 e.putBoolean("sit",sit.isChecked());
	        	 e.putBoolean("twenty",twenty.isChecked());
	        	 e.putBoolean("ten",ten.isChecked());
	        	 e.putBoolean("all",all.isChecked());
	        	 e.putBoolean("onC",onC.isChecked());
	        	 e.putInt("rad", rad.getCheckedRadioButtonId());
	        	 
	        	  int total = 0;
	        	  if(fast.isChecked()) total++;
	        	  if(eth.isChecked()) total++;
	        	  if(sit.isChecked()) total++; 
	        	  if(twenty.isChecked()) total++;
	        	  if(ten.isChecked()) total++;
	        	  if(all.isChecked()) total++;
	        	  if(onC.isChecked()) total++;
	        	  
	        	  e.putInt("total", total);
	        	
	        	 e.commit();
	        	finish();
	        	
	        }
	    };
	
}
