import java.util.Arrays;

public class MoveZeroes {
	    public static void moveZeroes(int[] nums) {
	    	int[] ans = new int[nums.length];
	    	int done = 0;
	    	for(int i = 0; i < nums.length && done <= nums.length; i++) {
	    		System.out.println("here");
	    		if(nums[i]==0) 
	    		{
	    			int j;
		    		for(j = i; j <nums.length-1;j++) {
		    			nums[j] = nums[j+1];
		    		}
		    		nums[j]=0;
		    		i--;	
	    		}
	    		done++;
	    	}
	    	System.out.println("ans="+ Arrays.toString(nums));
	    }
	    public static void main(String[] args) {
	    	int[] a = {0,1,0,0,0,9,9,0,0};
	    	moveZeroes(a);
			
		}
	
}
