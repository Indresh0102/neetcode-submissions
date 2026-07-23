class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] prefix_arr = new int[nums.length];
        int[] suffix_arr = new int[nums.length];
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length; i++)
        {
            int temp1 = nums[i];
            prefix_arr[i] = prefix;
            prefix = prefix*temp1;
        }
        for(int i=nums.length-1;i>=0; i--)
        {
            int temp2 = nums[i];
            suffix_arr[i] = suffix;
            suffix = suffix*temp2;
        }
        for(int i=0;i<nums.length; i++)
        {
            res[i] = prefix_arr[i]*suffix_arr[i];
        }
        return res;
        
    }
}  
