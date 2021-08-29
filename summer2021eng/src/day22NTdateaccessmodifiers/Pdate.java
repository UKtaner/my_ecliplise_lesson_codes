package day22NTdateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pdate {

	public static void main(String[] args) {
		
	LocalDate currentDate=LocalDate.now();
	System.out.println(currentDate);//2021-07-15
	
	System.out.println(currentDate.plusDays(2));//2021-07-17
	
	System.out.println(currentDate.plusMonths(5));//2021-12-15
	
	System.out.println(currentDate.plusYears(3));//2024-07-15
	
	System.out.println(currentDate.minusDays(5));//2021-07-10
	
	LocalDate yesterday=LocalDate.now();
	System.out.println(yesterday.minusDays(1));
	
	LocalDate tomorrow=LocalDate.now();
	System.out.println(tomorrow.plusDays(1));
	
	System.out.println(currentDate.plusYears(2).plusMonths(3).plusDays(15));
	
	System.out.println(currentDate.minusMonths(5).minusDays(27));
	
	System.out.println(currentDate.getYear());
	System.out.println(currentDate.getMonth());//JULY
	System.out.println(currentDate.getMonthValue());//7
	
	System.out.println(currentDate.getDayOfMonth());//15
	System.out.println(currentDate.getDayOfWeek());//THURSDAY
	System.out.println(currentDate.getDayOfYear());
	
	
	LocalDate date1=LocalDate.of(1995, 3,3);
	System.out.println(date1);//1995-03-03
	
	System.out.println(date1.getDayOfWeek());
	
	System.out.println(currentDate.isAfter(date1));
	System.out.println(currentDate.isBefore(date1));
	
	
	
	LocalDate currentdate1=LocalDate.now();
	System.out.println(currentdate1);
	
	DateTimeFormatter dtformat1=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
	System.out.println(dtformat1.format(currentdate1));
	
	System.out.println(dtformat1.format(currentdate1.plusMonths(3)));//15/October/2021
	
	System.out.println(dtformat1.format(currentdate1.plusDays(5)));//20/July/2021
	
	LocalTime currentTime=LocalTime.now();
	
	System.out.println(currentTime);//16:05:42.328439
	
	DateTimeFormatter timeformmatter=DateTimeFormatter.ofPattern("HH:mm");
	
	System.out.println(timeformmatter.format(currentTime));//04:07
	
DateTimeFormatter timeformmatter1=DateTimeFormatter.ofPattern("HH:mm a");
	
	System.out.println(timeformmatter1.format(currentTime));
	
	LocalDate d1=LocalDate.now();
	LocalDate d2=LocalDate.of(1987, 12, 24);
	
	int myAge=Period.between(d2, d1).getYears();
	
	System.out.println(myAge);
	
	
	
	
	}

}
