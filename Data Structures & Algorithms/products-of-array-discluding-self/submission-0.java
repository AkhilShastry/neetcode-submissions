class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            prefix[i] = 1;
            suffix[i] = 1;
        }
        for(int i=1; i<nums.length; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }
        for(int j=nums.length-2; j>=0; j-- ){
            suffix[j] = nums[j+1] * suffix[j+1];
        }
        
        for(int n=0; n<nums.length; n++){
            nums[n] = prefix[n]  * suffix[n];
        }

        return nums;
    }
}  


