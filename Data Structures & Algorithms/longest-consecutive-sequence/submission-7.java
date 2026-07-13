class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        int output = 0;
        for(int i=0; i<nums.length; i++){
            int curr = 0;
            if(!list.contains(nums[i]-1)){
                curr++;
                int temp = nums[i] + 1;
                while(list.contains(temp)){
                    temp++;
                    curr++;
                }
                output = Math.max(output, curr);
            }
        }
        return output;
    }
}
