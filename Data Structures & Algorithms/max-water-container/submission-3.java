class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        while(left < right){
            int width = right - left;
            int height = Math.min(heights[left], heights[right]);
            temp = width * height;
            if(temp > max){
                max = temp;
            }
            if(heights[left] <= heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
