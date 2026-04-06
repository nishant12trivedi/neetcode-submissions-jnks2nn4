class Solution {
    public int lastStoneWeight(int[] stones) {
                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all stones to heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        
        // Smash stones
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll(); // largest
            int x = maxHeap.poll(); // second largest
            
            if (y != x) {
                maxHeap.add(y - x);
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
