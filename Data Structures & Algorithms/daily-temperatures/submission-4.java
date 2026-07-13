class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int[] output = new int[temperatures.length];
        temp.push(temperatures[0]);
        index.push(0);
        for(int i=1; i<temperatures.length; i++){
            while(!temp.isEmpty() && (temp.peek() < temperatures[i])){
                output[index.peek()] = i - index.peek();
                temp.pop();
                index.pop();
            }
            temp.push(temperatures[i]);
            index.push(i);
        }
        while(!index.isEmpty()){
            output[index.peek()] = 0;
            index.pop();
        }
        return output;
    }
}
