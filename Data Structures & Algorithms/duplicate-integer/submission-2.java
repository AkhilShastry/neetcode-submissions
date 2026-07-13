class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean run = true;
        int count = 0;
        while(run && count < nums.length){
            if(map.containsKey(nums[count])){
                run = false;
            }
            else{
                map.put(nums[count], 1);
                count++;
            }
        }

        return (!run);
    }
}