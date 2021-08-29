package dayLoops;

public class HcmOfTwoNumber {

	public static void main(String[] args) {
		/*
		HCF==>Highest Common Factor 
		LCM==>Least Common Multiple	
		GCD==>Greatest Common Divisor 
		GCF==>Greatest Common Factor


				 */
				
		int n1=8;// 1,2,4,8
		int n2=12;//1,2,3,4,12
		int hcm=0;
			for(int i=1;i<=n1 && i<=n2;i++) {// why both (||) and (&&) are applicable in for loop?
				
					if(n1%i==0 && n2%i==0) {
						hcm=i;
					}}
				System.out.println("HCM: "+hcm);
				
				
				
			}}
					

					
				
