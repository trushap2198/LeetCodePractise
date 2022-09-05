import java.util.Arrays;

class RotateArray {
    public static void rotate(int[] nums, int k) {
        k= k%nums.length;
        if(nums.length%2==0 || k==0)
        {
        	System.out.println("here");
            reverse(nums,0,k);
            System.out.println(Arrays.toString(nums));
            reverse(nums,k,nums.length);
            System.out.println(Arrays.toString(nums));
            reverse(nums,0,nums.length);
            System.out.println(Arrays.toString(nums));
            
        } 
        else{
        	System.out.println("oh no");

            reverse(nums, 0, k+1);
            reverse(nums,k+1,nums.length);
            reverse(nums, 0, nums.length);
        }
        
        System.out.println(Arrays.toString(nums));
}
    
    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end-1];
            nums[end-1] = nums[start];
            nums[start] = temp;
            end--;
            start++;
        }
    }
    
    public static void main(String[] args) {
    	int n[] = {1,2,3};
		rotate(n,2);
	}
}
