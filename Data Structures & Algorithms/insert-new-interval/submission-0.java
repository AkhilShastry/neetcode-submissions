class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];
        
        List<int[]> output = new ArrayList<>();
        int i = 0;

        while(i < intervals.length && intervals[i][1] < start){ 
            //ending interval is before start of newInterval, so no overlap
            output.add(intervals[i]);
            i++;
        }
        while(i < intervals.length &&  intervals[i][0] <= end){
            //need to check if end of newIterval is before start of interval, if it is no overlap
            start = Math.min(intervals[i][0], start);
            end = Math.max(intervals[i][1], end);
            i++;
        }
        int [] temp = new int[2];
        temp[0] = start;
        temp[1] = end;
        output.add(temp);
        while(i < intervals.length){
            output.add(intervals[i]);
            i++;
        }
        return output.toArray(new int[output.size()][]);

    }
}
