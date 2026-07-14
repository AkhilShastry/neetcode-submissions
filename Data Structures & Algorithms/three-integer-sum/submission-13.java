public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    List<Integer> triplet1 = new ArrayList<>();
                    triplet1.add(nums[i]);
                    triplet1.add(nums[l]);
                    triplet1.add(nums[r]);
                    output.add(triplet1);

                    l++;
                    while(nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }
                else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return output;
    }
}