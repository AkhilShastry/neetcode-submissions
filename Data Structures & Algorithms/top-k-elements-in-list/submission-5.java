class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length];
        for(int l = 0; l<nums.length; l++){
            bucket[l] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int freq = entry.getValue();
            int num = entry.getKey();
            bucket[freq-1].add(num);
        }

        int index = nums.length - 1;
        int outputIndex = 0;
        int [] output = new int[k];
        while(k > 0){
            ArrayList<Integer> arr = bucket[index];
            for(int i=0; i<arr.size(); i++){
                if(k != 0){
                    output[outputIndex++] = arr.get(i);
                }
                k--;
            }
            index--;
        }
        return output;
    }
}
