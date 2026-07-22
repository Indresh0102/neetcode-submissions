class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frq = new HashMap<>();
        for(int num:nums)
        {
            frq.put(num, frq.getOrDefault(num,0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(int n:frq.keySet())
        {
            arr.add(new int[] {frq.get(n),n});
        }
        arr.sort((a,b) -> b[0]-a[0]);
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=arr.get(i)[1];
        }
        return res;
    }
}
