class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] array = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++){
            if(map.containsKey(target-nums[j]) && map.get(target-nums[j])!=j){
                array[0] = j;
                array[1] = map.get(target-nums[j]);
                return array;
            }
        }

        return array;
    }
}
