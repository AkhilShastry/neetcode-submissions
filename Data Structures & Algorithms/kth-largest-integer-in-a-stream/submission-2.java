class KthLargest {

    int largest;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int [] temp;

    public KthLargest(int k, int[] nums) {
        largest = k;
        temp = new int[k];
        for(int n : nums){
            maxHeap.add(n);
        }
    }
    
    public int add(int val) {
        maxHeap.add(val);
        for(int i=0; i<largest; i++){
            temp[i] = maxHeap.poll();
        }
        int output = temp[largest-1];
        for(int i=0; i<largest; i++){
            maxHeap.add(temp[i]);
        }
        return output;   
    }
}
