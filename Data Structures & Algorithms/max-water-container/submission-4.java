class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(l < r){
            if(Math.min(heights[l], heights[r]) * (r-l) > max){
                max = Math.min(heights[l], heights[r]) * (r-l);
            }
            if(heights[l] > heights[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}
