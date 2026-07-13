class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min = nums[0];
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[l] <= nums[r]){
                min = Math.min(min, nums[l]);
                return min;
            }
            if(nums[mid] >= nums[l]){
                l = mid + 1;
            }
            else{
                min = Math.min(min, nums[mid]);
                r = mid -1;
            }
        }
        return min;
    }
}
