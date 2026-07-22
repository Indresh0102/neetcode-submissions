class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frq_count = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(int n:nums)
        {
            frq_count.put(n,frq_count.getOrDefault(n,0)+1);
        }
        for(int n:frq_count.keySet())
        {
            heap.offer(new int[] {frq_count.get(n), n});
            if(heap.size()>k)
            {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0; i<k;i++)
        {
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
