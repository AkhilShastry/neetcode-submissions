class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] arr = new List[nums.length+1];
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i=0; i < arr.length; i++){
            arr[i] = new ArrayList<>();
        }

        for(HashMap.Entry<Integer, Integer> en : map.entrySet()){
            arr[en.getValue()].add(en.getKey());
        }

        int [] result = new int[k];
        int indexR = 0;
        int arrIndex = arr.length-1;
        for(int s=arr.length-1; s > 0 && indexR < k; s--){
            for(int a : arr[s]){
                if(indexR < k){
                    result[indexR++] = a;
                }
            }
        }
        return result;

    
    }
}


