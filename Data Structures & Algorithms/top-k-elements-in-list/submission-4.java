class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int [] output = new int[k];
        for(int j=0; j<nums.length; j++){
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            int minOccur = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int i=0; i<output.length; i++){
                int temp = count.getOrDefault(output[i], 0);
                if(temp < minOccur){
                    minOccur = temp;
                    minIndex = i;
                }
            }
            if(minOccur < count.get(nums[j]) && !contains(output, nums[j])){
                output[minIndex] = nums[j];
            }
        }
        return output;

    }

    private boolean contains(int [] arr, int a){
        for(int t : arr){
            if(t == a){
                return true;
            }
        }
        return false;
    }
}
