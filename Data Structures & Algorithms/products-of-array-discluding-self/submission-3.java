class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr_div=1;
        int zeros = 0;
        int idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zeros+=1;
                idx = i;
                if (zeros==2)
                {
                    break;
                }
            }
            else
            {
                arr_div=arr_div*nums[i];
            }
        }
        if (zeros == 2)
        {
            int[] res = new int[nums.length];
            return res;
        }
        else if(zeros==1)
        {
            int[] res = new int[nums.length];
            res[idx] = arr_div;
            return res;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = (arr_div/nums[i]);
        }
        return nums;
    }
}  
