class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>();
        for(int n : nums){
            values.add(n);
        }

        int length = 0;
        for(int n : nums){
            int temp = 0;
            if(!values.contains(n-1)){
                temp++;
                int index = 1;
                while(values.contains(n+index)){
                    temp++;
                    index++;
                }
                length = Math.max(length, temp);
            }
        }

        return length;
    }
}
