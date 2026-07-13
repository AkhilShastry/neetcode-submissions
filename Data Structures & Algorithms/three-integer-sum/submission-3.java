class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int firstIndex = 0;
        int secondIndex = 1;
        int thirdIndex = nums.length-1;
        List<List<Integer>> returnList = new ArrayList<>();
        Arrays.sort(nums);
        while(firstIndex < nums.length-2){
            secondIndex = firstIndex+1;
            thirdIndex = nums.length-1;
            while(secondIndex < thirdIndex){
                int tempSecond = 0;
                int tempThird = 0;
                if((nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]) == 0){
                    List<Integer> inner1 = new ArrayList<>();
                    inner1.add(nums[firstIndex]);
                    inner1.add(nums[secondIndex]);
                    inner1.add(nums[thirdIndex]);
                    returnList.add(inner1);

                    tempSecond = nums[secondIndex];
                    secondIndex += 1;
                    while(tempSecond == nums[secondIndex] && secondIndex < thirdIndex){
                        secondIndex++;
                    }
                }
                else if((nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]) < 0){
                    secondIndex++;
                }
                else{
                    thirdIndex--;
                }
            }
            int temp = nums[firstIndex];
            while(firstIndex < nums.length-2 && nums[firstIndex] == temp){
                firstIndex++;
            }
        }
        return returnList;
    }
}
