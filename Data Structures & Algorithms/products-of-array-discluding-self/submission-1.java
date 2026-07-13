class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];

        for(int i=0; i<prefix.length; i++){
            if(i==0){
                prefix[0] = 1;
            }
            else{
                prefix[i] = (nums[i-1] * prefix[i-1]);
            }
        }

        for(int i=suffix.length-1; i>=0; i--){
            if(i==suffix.length-1){
                suffix[suffix.length-1] = 1;
            }
            else{
                suffix[i] = (nums[i+1] * suffix[i+1]);
            }
        }
        int [] output = new int[nums.length];
        for(int j=0; j<output.length; j++){
            output[j] = prefix[j] * suffix[j];
        }

        return output;
    }
}  
