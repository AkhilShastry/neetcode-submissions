class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array = new HashMap<>();
        int [] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(array.containsKey(target - nums[i])){
                output[0] = array.get(target - nums[i]);
                output[1] = i;
            }
            else{
                array.put(nums[i], i);
            }

        }

        return output;
    }
}
