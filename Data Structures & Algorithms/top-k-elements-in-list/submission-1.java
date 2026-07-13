class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] arr = new List[nums.length+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }
        for(HashMap.Entry<Integer, Integer> en : map.entrySet()){
            arr[en.getValue()].add(en.getKey());
        }

        int [] result = new int[k];
        int index = 0;
        for(int s=arr.length-1; s>0 && index < k; s--){
            for(int add : arr[s]){
                if(index < k){
                    result[index++] = add;
                }
                else{
                    return result;
                }
            }
        }
        return result;
    }
}
