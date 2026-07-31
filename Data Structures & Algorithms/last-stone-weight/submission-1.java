class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0){
            return 0;
        }
        if(stones.length==1){
            return stones[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        int s1,s2;
        for(int n:stones){
            maxHeap.offer(n);
        }
        while(!maxHeap.isEmpty()){
            s1 = maxHeap.poll();
            if(!maxHeap.isEmpty()){
                s2 = maxHeap.poll();
                if(s1==s2){
                    continue;
                }
                else if(s1<s2){
                    maxHeap.offer(s2-s1);
                }
                else{
                    maxHeap.offer(s1-s2);
                }
            }else{
                return s1;
            }

        }
        return 0;
    }
}
