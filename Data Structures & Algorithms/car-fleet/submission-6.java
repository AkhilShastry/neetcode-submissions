class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] pair = new int[position.length][2];
        for(int i=0; i<pair.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0], a[0]));

        Stack<Double> times = new Stack<>();
        int index = 0;
        double closer = 0;
        double farther = 0;
        while(index < position.length){
            if(!times.isEmpty()){
                closer = times.peek(); 
            }
            times.push((((double)target)-pair[index][0])/pair[index][1]);
            if(times.size() > 1){
                farther = times.peek();
                if(farther <= closer){
                    times.pop();
                }
            }
            index++;
        }

        return times.size();
    }
}
