class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Set<Integer>[] occur = new HashSet[nums.length+1];
        for(int n=0; n<occur.length; n++){
            occur[n] = new HashSet<>();
        }

        for(int n=0; n<nums.length; n++){
            occur[count.get(nums[n])].add(nums[n]);
        }

        int index = occur.length-1;
        int [] output = new int[k];
        int outputIndex = k-1;

        while(outputIndex >= 0 && index >= 0){
            Set<Integer> temp = occur[index--];
            int[] arr = new int[temp.size()];
            int i = 0;
            for (int val : temp) {
                arr[i++] = val;
            }
            int tempIndex = arr.length-1;
            while(tempIndex>=0 && k >0){
                output[outputIndex--] = arr[tempIndex--];
                k--;
            }
            
        }

        return output;


    }
}
