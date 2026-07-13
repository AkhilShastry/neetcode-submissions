class Solution {
    public boolean isPalindrome(String s) {
        String check = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char [] text = check.toCharArray();
        for(int i=0; i<text.length/2; i++){
            if(text[i] != text[text.length-i-1]){
                return false;
            }
        }

        return true;
    }
}
