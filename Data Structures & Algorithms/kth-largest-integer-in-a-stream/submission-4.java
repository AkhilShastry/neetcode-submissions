class KthLargest {

    int largest;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        largest = k;
        for(int n : nums){
            minHeap.add(n);
        }
        while(minHeap.size() > k){
            minHeap.poll();
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        while(minHeap.size() > largest){
            minHeap.poll();
        }
        return minHeap.peek();   
    }
}
