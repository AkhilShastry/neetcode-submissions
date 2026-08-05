class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> holder = new PriorityQueue<>(Collections.reverseOrder());
        

        for(int stone : stones){
            holder.add(stone);
        }

        while(holder.size() > 1){
            int stoneOne = holder.poll();
            int stoneTwo = holder.poll();
            if(stoneOne > stoneTwo){
                holder.add(stoneOne - stoneTwo);
            }
            else if(stoneTwo > stoneOne){
                holder.add(stoneTwo - stoneOne);
            }
        }
        int output = 0;
        if(holder.size() == 0){
            output = 0;
        }
        else{
            output = holder.poll();
        }
        return output;

    }
}
