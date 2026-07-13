class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int currLength = 0;
        int l = 0;
        int r = 0;
        while(l <= r && r < s.length()){
            char value = s.charAt(r);
            if(!set.contains(value)){
                set.add(value);
                currLength++;
                r++;
            }
            else{
                if(currLength > max){
                    max = currLength;
                }
                while(s.charAt(l) != value){
                    set.remove(s.charAt(l));
                    currLength--;
                    l++;
                }
                set.remove(s.charAt(l));
                currLength--;
                l++;
            }
        }
        if(currLength > max){
            max = currLength;
        }
        return max;
    }
}
