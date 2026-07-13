class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];
        for(int i=0; i<prefix.length; i++){
            prefix[i] = 1;
            suffix[i] = 1;
        }

        for(int n=1; n<nums.length; n++){
            prefix[n] = prefix[n-1] * nums[n-1];
        }

        for(int n=nums.length-2; n>=0; n--){
            suffix[n] = suffix[n+1] * nums[n+1];
        }

        int [] output = new int[nums.length];
        for(int o = 0; o < output.length; o++){
            output[o] = prefix[o] * suffix[o];
        }

        return output;
    }
}  
