class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k = 0;
        int minSpeed = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;
        for(int j=0; j<piles.length; j++){
            if(piles[j] > max){
                max = piles[j];
            }
        }

        int left = 1;
        int right = max;

        while(left <= right){
            int hours = 0;
            int speed = left + (right-left)/2;
            for(int i=0; i<piles.length; i++){
                hours += Math.ceil((double)piles[i]/(double)speed);
            }
            if(hours <= h){
                minSpeed = speed;
                right = speed - 1;
            }
            else if(hours > h){
                left = speed + 1;
            }
        }
        return minSpeed;
    }
}
