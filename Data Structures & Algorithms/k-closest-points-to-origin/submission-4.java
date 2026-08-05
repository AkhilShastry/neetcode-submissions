class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int [][] output = new int[k][2];
        PriorityQueue<double[]> distance = new PriorityQueue<>(
            (a,b) -> Double.compare(b[0], a[0])
        );
        int x = 0;
        int y = 0;
        for(int [] point : points){
            x = point[0];
            y = point[1];
            double x_dis = Math.pow(x - 0, 2);
            double y_dis = Math.pow(y - 0, 2);
            double total_distance = Math.sqrt(x_dis + y_dis);
            if(distance.size() < k){
                distance.add(new double[]{total_distance, x, y});
            }
            else{
                double [] temp = distance.poll();
                double max_dis = temp[0];
                if(max_dis > total_distance){
                    distance.add(new double[]{total_distance, x, y});
                }
                else{
                    distance.add(temp);
                }
            }
        }
        int curr = 0;
        while(distance.size() > 0){
            double [] temp = new double[3];
            temp = distance.poll();
            output[curr][0] = (int) temp[1];
            output[curr++][1] = (int) temp[2];
        }
        return output;

    }
}
