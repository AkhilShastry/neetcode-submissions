class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int curr = 1;
        int l = 0;
        int r = 1;
        if(s.length() < 2){
            return s.length();
        }
        Set<String> maxSet = new HashSet<>();
        String sub = s.substring(l,l+1);
        maxSet.add(sub);
        while(l <= r && r < s.length()){
            if(!maxSet.contains(s.substring(r,r+1))){
                maxSet.add(s.substring(r,r+1));
                curr++;
                max = Math.max(curr, max);
                r++;
            }
            else{
                while(!s.substring(l,l+1).equals(s.substring(r,r+1))){
                    maxSet.remove(s.substring(l,l+1));
                    l++;
                    curr--;
                }
                maxSet.remove(s.substring(l,l+1));
                l++;
                curr--;
            }
        }
        return max;
    }
}


