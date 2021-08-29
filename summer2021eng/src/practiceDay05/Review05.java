package practiceDay05;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Review05 {

	public static void main(String[] args) {
	     for (int i = 2000; i < 2018; i++) {
	         Calendar calendar = new GregorianCalendar(i, Calendar.FEBRUARY, 1);
	         int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	         System.out.println("February " + i + ": " + numberOfDays + " days");
	      }
	   }
	}