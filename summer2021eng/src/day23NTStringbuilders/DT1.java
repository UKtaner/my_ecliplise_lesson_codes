package day23NTStringbuilders;

public class DT1 {

	public static void main(String[] args) {
 //String is immutable and Java create Stringbuilder to handle this
        
        //how to create a string builder
        
        //1st way
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println("the default value of the capacity is: "+sb.capacity());
        
        
        //to add sth into the stringbuilder
        sb.append("Selen");
        System.out.println(sb);
        
        sb.append(" Ucar");
        System.out.println(sb);
        System.out.println("the value of capacity after appending sth: "+sb.capacity());
        
        String name=  "Orhan";
        name.toUpperCase();
        System.out.println(name);
        
        //when we update stringbuilder we are gonna print the new version
        sb.append(" is one of the best qa Engineer");
        System.out.println(sb);
        
        
        //2nd way  with parameter
        StringBuilder sb1 = new StringBuilder("Muhammed");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        sb1.append(" and Mehmet will find a job in a short time");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        
        
        //3rd way  with capacity
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("Alper");
        System.out.println(sb3);
        sb3.append(" Yilmaz");
        System.out.println(sb3);
        
        
        //chaining with append method
        
        StringBuilder sb4 = new StringBuilder("Java");
        sb4.append("+").append("Selenium").append("+").append("SQL");
        System.out.println(sb4);//Java+Selenium+SQL
        
        //to append some chars between specific indexes
        sb4.append(sb4, 4, 13);
        System.out.println("sb4, 4, 13==> "+sb4);//Java+Selenium+SQL+Selenium
        
        
        StringBuilder sb5 = new StringBuilder("Ayse");
        System.out.println(sb5);
        sb5.append(" Ozipek",0,3);
        System.out.println(sb5);//Ayse Oz
        
        
        //to get the character from a specific index
        System.out.println(sb5.charAt(5));//O
        
        //to delete some characters between specific indexes
        System.out.println("sb4 before delete: "+sb4);
        sb4.delete(0, 5);
        System.out.println("sb4 after delete: "+sb4);//Selenium+SQL+Selenium
        
        //to delete a specific character from a specific index
        sb4.deleteCharAt(10);
        System.out.println(sb4);//Selenium+SL+Selenium==> Q is deleted
         
        
    }
}
