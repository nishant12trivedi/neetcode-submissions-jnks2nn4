class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
        map.put(i, map.getOrDefault(i,0) +1);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) ->(
                map.get(b)-map.get(a)
        ));

        pq.addAll(map.keySet());

        int [] r = new int[k];
        for(int i=0; i<k; i++)
        {
                r[i] = pq.poll(); 
        }

        return r;
    }
}
