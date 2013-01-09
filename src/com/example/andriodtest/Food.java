package com.example.andriodtest;
import java.util.*;
import android.location.Address;

import android.widget.Button;
public class Food {

	public static String[] all = {"Market", "Market ToGo","Union" ,"Cathy","Pete","Taco Bell","Perch","Einsteins","Mcdonalds","Five Guys","Hello Bistro","Chipotle","Subway","Taiwan Cafe","Qdoba","Quaker Stake"
        ,"Noodles and Company", "Red Oak","Papa D's","Antoon's","Sorento's","Primanti Bros.","Uncle Sam's","Burma Tokyo","Oishii Bento","Eat Unique","Sushi Boat","Piazz Sola","Szechuan Express","Popeye's","The O","Campus Deli","Jimmy John's","Black Bean","LuLu's Noodels",
        "Spice Island Tea House","Fuel & Fuddle","Union Grill","Legume Bistro","The Porch","Mad Mex","Tamarind","Ali Baba","Pamelas","India Garden","Hemingways" };
	public static String[] onC =  {"Market", "Market ToGo","Union" ,"Cathy","Pete","Taco Bell","Perch","Einsteins"};
	public static String[] fast = {"Chipotle","Subway","Antoon's","Sorento's","Primanti Bros.","Noodles and Company","Mcdonalds","Five Guys","Qdoba","Quaker Stake","Papa D's","Popeye's","The O","Jimmy John's"};
    public static String[] eth ={"Taiwan Cafe","Burma Tokyo","Oishii Bento","Eat Unique","Sushi Boat","Szechuan Express","Black Bean","LuLu's Noodels","Spice Island Tea House","Ali Baba","India Garden"};
    public static String[] ten = {"Chipotle","Subway","Antoon's","Sorento's","Primanti Bros.","Noodles and Company","Mcdonalds","Five Guys","Qdoba","Quaker Stake","Papa D's","Popeye's","The O","Jimmy John's","Red Oak","Uncle Sam's","Taiwan Cafe","Campus Deli","Hello Bistro"};
    public static String[] twenty= {"Mcdonalds","Five Guys","Hello Bistro","Chipotle","Subway","Taiwan Cafe","Qdoba","Quaker Stake"
        ,"Noodles and Company", "Red Oak","Papa D's","Antoon's","Sorento's","Primanti Bros.","Uncle Sam's","Burma Tokyo","Oishii Bento","Eat Unique","Sushi Boat","Piazz Sola","Szechuan Express","Popeye's","The O","Campus Deli","Jimmy John's","Black Bean","LuLu's Noodels",
        "Spice Island Tea House","Fuel & Fuddle","Legume Bistro","Mad Mex","Ali Baba","Pamelas","India Garden","Hemingways" };
    public static String[] sit= {"Hello Bistro","Taiwan Cafe",
        "Primanti Bros.","Uncle Sam's","Burma Tokyo","Oishii Bento","Eat Unique","Piazz Sola","Szechuan Express","Black Bean","LuLu's Noodels",
        "Spice Island Tea House","Fuel & Fuddle","Union Grill","Legume Bistro","The Porch","Mad Mex","Tamarind","Ali Baba","Pamelas","India Garden","Hemingways" };
    
    public static String get(int i){
    	Random r = new Random();
		String[] temp = all ;
    	
		switch(i){
		case 7:
			temp = all;
			break;
		case 6:
			temp = twenty;
			break;
		case 5:
			temp = ten;
			break;
		case 4:
			temp = eth;
			break;
		case 3:
			temp = sit;
			break;
		case 2:
			temp = onC;
			break;
		case 1:
			temp = fast;
			break;
		}
		
    	
    	
    	
    	
    	int a = r.nextInt(temp.length);
    	return temp[a];
		
    }
}
