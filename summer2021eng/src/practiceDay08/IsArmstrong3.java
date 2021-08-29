package practiceDay08;

import java.util.ArrayList;

public class IsArmstrong3 {
	/**
     * @param num
     * @return the number of digits
     */
    static int numOfDigits(int num){
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }
    static boolean isArmstrong(int num){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int each = Integer.parseInt(str.substring(i, i + 1));
            sum += Math.pow(each, numOfDigits(num));
        }
        return sum == num;
    }
    static ArrayList<Integer> listOfArmstrong(int num){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i <= num; i++){
            if(isArmstrong(i))
                al.add(i);
        }
		return al;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
