class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //storing freq of each int in nums
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);

        HashMap<Integer, List<Integer>> map2 = new HashMap<>();

        int maxFreq = 0;

        for(int freq : map.values()){
            maxFreq = Math.max(freq, maxFreq);

            map2.put(freq, new ArrayList<>());
        }

        for(int num : map.keySet()){
            int freq = map.get(num);
            map2.get(freq).add(num);
        }

        int [] result = new int[k];
        int index = 0;
        
        for(int i = maxFreq; i > 0 && index < k; i--){
            List<Integer> addList = map2.get(i);

            if(addList != null){
                for(int n : addList){
                    result[index++] = n;
                    if(index == k)
                        break;
                }
            }
        }
        

        return result;
    }
}
