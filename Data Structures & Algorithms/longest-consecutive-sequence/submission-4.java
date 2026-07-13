class Solution {
    public int longestConsecutive(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int consecutive = 0;
        int consecutiveMax = 0;
        
        for(int i=min; i<= max; i++){
            if(map.containsKey(i))
                consecutive++;
            else{
                consecutiveMax = Math.max(consecutiveMax, consecutive);
                consecutive = 0;
            }
        }

        return Math.max(consecutiveMax, consecutive);
        
    }
}
