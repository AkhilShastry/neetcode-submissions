class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int output = -1;
        while(start <= end){
            if(nums[start + (end-start)/2] == target){
                output = start + (end-start)/2;
                break;
            }
            else if(target < nums[start + (end-start)/2]){
                end = start + (end-start)/2 - 1;
            }
            else{
                start = start + (end-start)/2 + 1;
            }
        }
        return output;
    }
}
