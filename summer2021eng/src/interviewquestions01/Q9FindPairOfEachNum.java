package interviewquestions01;

public class Q9FindPairOfEachNum {

	public static void main(String[] args) {
		/*
		  From a given array find all pairs whose sum is a given number
		  {4, 6, 5, -10, 8, 5, 20} ==>target num= 10
		  For example;	4+6=10, 5+5=10, -10+20=10 
		 */

	
			findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
			
			System.out.println("===========");
			
			findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

		}
		
		public static void findPairs(int nums[], int target) {
			
			for(int i=0; i<nums.length; i++) {
				
				for(int j=i+1; j<nums.length; j++) {
					
					if(nums[i]+nums[j]==target) {
						System.out.println(nums[i] + " + " + nums[j] + " = " + target );
					}
					
				}
				
			}
			
		}

	}