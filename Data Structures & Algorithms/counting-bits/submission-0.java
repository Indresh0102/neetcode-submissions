class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int bits = 0;
        for(int i=0; i<=n; i++){
            int num = i;
            while(num!=0){
                if((num&1)==1){
                    bits+=1;
                }
                num=num>>>1;
            }
            ans[i]=bits;
            bits=0;
        }
        return ans;
    }
}
