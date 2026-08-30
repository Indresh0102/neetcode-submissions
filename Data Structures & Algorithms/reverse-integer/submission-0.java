class Solution {
    public int reverse(int x) {
        long ans = rev(Math.abs(x),0);
        ans = x<0?-ans:ans;
        if(ans>Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int) ans;

    }
    public long rev(int x, long ans){
        if(x==0){
            return ans;
        }
        ans = (ans*10)+x%10;
        return rev(x/10,ans);
    }
}
