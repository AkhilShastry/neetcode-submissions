class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        int[] output = new int[2];
        for(int j=0; j<nums.length; j++){
            if(map.containsKey(target-nums[j]) && map.get(target-nums[j]) != j){
                output[1] = map.get(target-nums[j]);
                output[0] = j;
                return output;
            }
        }
        return output;
    }
}
