class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer && leftPointer <= s.length() && rightPointer >= 0){
            while(!isAlpha(s.charAt(leftPointer)) && leftPointer < rightPointer && leftPointer <= s.length() && rightPointer >= 0){
                leftPointer++;
            }

            while(!isAlpha(s.charAt(rightPointer)) && leftPointer < rightPointer && leftPointer <= s.length() && rightPointer >= 0){
                rightPointer--;
            }

            if(s.substring(leftPointer, leftPointer+1).toLowerCase().equals(s.substring(rightPointer, rightPointer+1).toLowerCase())){
                leftPointer++;
                rightPointer--;
            }
            else{
                return false;
            }

        }
        return true;
    }

    public static boolean isAlpha(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && '9' >= c);  
    }
}
