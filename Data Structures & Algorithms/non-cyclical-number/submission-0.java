class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1){
            n = squareSum(n, 0);
            if(seen.contains(n))return false;
            seen.add(n);
        }
        return true;
    }
    public int squareSum(int n, int sum){
        if(n==0) return sum;
        int digit = n%10;
        sum += digit*digit;
        return squareSum(n/10,sum);
    }
}
