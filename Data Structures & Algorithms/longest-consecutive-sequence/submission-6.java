class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> sequence = new HashSet<>();
        for(int n : nums){
            sequence.add(n);
        }
        int longest = 0;
        int curr = 0;
        for(int i=0; i<nums.length; i++){
            int index = 1;
            if(!sequence.contains(nums[i]-1)){
                curr = 1;
                while(sequence.contains(nums[i]+index)){
                    curr += 1;
                    index += 1;
                }
            }
            if(curr > longest){
                longest = curr;
            }
        }

        return longest;
    }
}
