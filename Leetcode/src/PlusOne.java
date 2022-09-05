import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PlusOne {
    public  static int[] plusOne(int[] digits) {
    	for (int i = digits.length-1; i>=0;i--) {
    		if(digits[i]!=9) {
    			digits[i] = digits[i]+1;
    			return digits;
    		}
    		else {
    			digits[i] = 0;
    		}
    	}
    	int[] arr = new int[digits.length+1];
    	arr[0] = 1;
    	return arr;
    }
    
    public static void main(String[] args) {
		//int[] a = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
    	int[] a = {1,9,9};
		int[] ans = plusOne(a);
		System.out.println("ans="+ Arrays.toString(ans));
	}
}
