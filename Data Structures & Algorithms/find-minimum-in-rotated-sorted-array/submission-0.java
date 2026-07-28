class Solution {
    public int findMin(int[] nums) {
        int i=0,j=nums.length-1,mid, min_val=Integer.MAX_VALUE;
        while(i<=j){
            mid = (i+j)/2;
            min_val = Math.min(min_val,nums[mid]);
            if(!(nums[mid]<=nums[j])){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return min_val;
    }
}
