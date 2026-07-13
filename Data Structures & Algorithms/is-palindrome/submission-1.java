class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        String pal = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int r = pal.length()-1;
       while(l < r){
        if(pal.charAt(l) == pal.charAt(r)){
            l++;
            r--;
        }
        else{
            return false;
        }
       } 
       return true;
    }
}
