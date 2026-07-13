class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> holder = new HashSet<>();
        for(int a : nums){
            if(holder.contains(a)){
                return true;
            }
            else{
                holder.add(a);
            }
        }
        return false;
    }
}