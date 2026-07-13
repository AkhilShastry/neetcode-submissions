public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            map.put(numbers[i], i+1);
        }

        int [] result = new int[2];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        
        for(int n : numbers){
            i++;
            if(map.containsKey(target - n)){
                index1 = Math.min(i, map.get(target - n));
                index2 = Math.max(i, map.get(target - n));
            }
        }

        result[0] = index1;
        result[1] = index2;

        return result;
    }
}