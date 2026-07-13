class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }    
        ArrayList<Integer>[] arr = new ArrayList[nums.length];
        for(int l=0; l<arr.length; l++){
            arr[l] = new ArrayList<>();
        }
        for(int i=0; i<nums.length; i++){
            if(!arr[count.get(nums[i]) - 1].contains(nums[i])){
                arr[count.get(nums[i]) - 1].add(nums[i]);
            }
        }

        int [] output = new int[k];
        int index = 0;
        int curr = nums.length - 1;
        while(index < k){
            ArrayList<Integer> array = arr[curr];
            for(int a : array){
                output[index++] = a;
            }
            curr--;
        }
        return output;
    }
}


