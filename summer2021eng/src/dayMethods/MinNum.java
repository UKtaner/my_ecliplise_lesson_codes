package dayMethods;

public class MinNum {
	/*
	 Here is the source code of the above defined method called min(). 
	 This method takes two parameters num1 and num2 and returns the maximum between the two −
	 */
	
	   public static void main(String[] args) {
		      int a = 10;
		      int b = 2;
		      int c = minNum(a, b);
		      System.out.println("Minimum Value = " + c);
		   }

		   /** returns the minimum of two numbers */
		   public static int minNum(int n1, int n2) {
		      int min;
		      if (n1 > n2)
		         min = n2;
		      else
		         min = n1;

		      return min; 
		   }
/*
 Scanner scan=new Scanner(System.in);
//create a scanner object for input


System.out.print("Enter the first number\n");
int num1=scan.nextInt();//reads num1 from user

System.out.print("Enter the second number\n");
int num2=scan.nextInt();;//reads num2 from user

System.out.print("Enter the Third number\n");
int num3=scan.nextInt();;//reads num3 from user

//calling the method
findSmallest(num1,num2,num3);
}


static void findSmallest(int num1,int num2, int num3){//method definition
    if(num1<=num2 && num1<=num3){
        System.out.println(num1+" is the smallest number");
        
    }
    else if(num2<=num1 && num2<=num3){
        System.out.println(num2+" is the smallest number");
        
    }
    else{
        System.out.println(num3+" is the smallest number");
        
    }
    
}
}
 */
		   
		   
}
