package day09stringmanipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {

		 
        //15--substring() // to get a specific part of a string and it returns String
        
        String str = "Java is easy";
        
        System.out.println(str.substring(2,5)); // start index is inclusive ,end index is exclusive
        
        System.out.println(str.substring(1,7)); //ava is
        
        System.out.println(str.substring(8,12)); // there is no index 12 but Java will work...
                                                //it will use 11 at the end  and index 11 is existed
        
        System.out.println(str.substring(8)); //easy
        
        System.out.println(str.substring(5)); //is easy //beginIndex   the beginning index, inclusive.
        
//      System.out.println(str.substring(13)); //IndexOutOfBoundsException
//      System.out.println(str.substring(-2)); //IndexOutOfBoundsException
        
        System.out.println(str.substring(6,6)); //nothing
        
        
        /*
          Ask user to enter a String
          Print the first and the last character of the String on the console.
         */
        
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Enter a String");
//      String str2 = scan.nextLine();
      
//      String first = str2.substring(0, 1);
//      String last = str2.substring(str2.length()-1, str2.length());
//      String last = str2.substring(str2.length()-1);      
//      System.out.println(first +  "<=====>" + last);
        
        /*
         Ask user to enter SSN (9 digits) 
         Print the SSN on the console after converting first 5 digits to *
         Ex: 123456789 ==> *****6789
         */
        
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Enter your SSN");
//      String ssn = scan.nextLine();
//      
//      String convertedssn = ssn.substring(5);
//      
//      System.out.println("*****"+ convertedssn);
        
        //16-trim() ==> is used to remove space " " from the beginning and after end and it returns String
        
        String str3 = "    Ali     C  an         ";
        System.out.println(str3);
        String trimmedstr3 = str3.trim();
        System.out.println("trimmedstr3: "+trimmedstr3);
        
        
        //17- isBlank() ==> used to to check if a String has characters different from "" and " " and it returns boolean 
        
        String str4 = "";
        String str5 = " ";
        String str6 = "         ";
        
        
        System.out.println(str4.isBlank());//true
        
        System.out.println(str5.isBlank()); //true
        System.out.println(str6.isBlank()); //true
        
        
        //18--replaceAll() is used like replace() + Returns String
        
        /*
         replace() : you can use String and Char as parameter 
         replaceAll() : you can just use String
         
         in replaceAll() you can use Regular Expressions (regex) 
         regex is some syntaxes which represent multi characters
                 
         */
        
        //a)---> \\d ===> stands for all digits (0.1,2....)
        //--->   \\D ===> stands for characters different from digits
        String str7 = "AB_78965_jkJ02145./!";
        System.out.println(str7.replaceAll("\\d", "")); //ABjkJ
        System.out.println(str7.replaceAll("\\D", "")); //7896502145
        
        //b) \\w ==> stands for _ and a-z and A-Z and 0-9
        //   \\W ==> stands for all characters different from _ and a-z and A-Z and 0-9
        System.out.println(str7.replaceAll("\\w", ""));//   ./!
        System.out.println(str7.replaceAll("\\W", "")); //AB_78965_jkJ02145
        
        //c) \\s  stands for space
        //   \\S  stands for all characters different from space
        
        System.out.println(str3.replaceAll("\\s", "")); //AliCan
        
        System.out.println(str3.replaceAll("\\S", "*")); //    ***     *  **   
        
        // d) \\A ==> beginning of the string
        //	  \\z ==> end of the entire string	
        
        String str9= "25.99";
        System.out.println(str9.replaceAll("\\A","Dollar"));//Dollar25.99
        
        // f) [aby] ==> Stands for all a, b y
        //    [^aby] ==> all characters different from a b y
        
        String str10 = "ali bey is booked ";
        System.out.println(str10.replaceAll("[koy]", "e")); //ali bee is beeeed 
        System.out.println(str10.replaceAll("[^ab]", "*")); //a***b******b******
 
        
    }
}
