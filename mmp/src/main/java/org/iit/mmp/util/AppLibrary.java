package org.iit.mmp.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class AppLibrary {

	public static String getfutureDate(int days) {
		Calendar cal= Calendar.getInstance();
			cal.add(Calendar.DATE, days);
			Date d=cal.getTime();
			System.out.println(d);
			
			SimpleDateFormat sdf=new SimpleDateFormat("MM/DD/YYYY");
			String date=sdf.format(d);
			System.out.println(date);
			return date;
			
			}

 public static String getfutureYear(int n,String format) {

		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.YEAR, n);
		Date d=cal.getTime();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String date=sdf.format(d);
		System.out.println(date);
		return date.toString();
		
		}

 public static String getRandomChars(int count) {
		
		Random rnd=new Random();
		String s="";
		
		for(int i =0;i<5;i++) {
			
			s=s+(char)(97+ rnd.nextInt(26));
		}
					return s;
		}
	  
		public static long getRandomDigits(int count) {
				
				int j=10;
				for(int i=0;i<count;i++)
				{
					j=j*10;
				}
				return Calendar.getInstance().getTimeInMillis()%j;
								
			}
		
public static String[] stateArr() {
			
			String stateArr[]= {"Georgia","Texas","Michigan"};
			return stateArr;
		}
		
public static String[] cityArr() {
			
			String cityArr[]= {"Atlanta","dallas","Madison"};
			return cityArr;
		}
		
public static String[][] readxls(String filepath){
	  
	  String str[][]=new String[10][10];
	  return str;
	   
}
	
public static String[][] readxlsx(String filepath){
	  
	  String str[][]=new String[10][10];
	  return str;
	   
}
}
