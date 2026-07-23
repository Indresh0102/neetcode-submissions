class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int longest=1; int count=1; int last = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            while(i < nums.length && nums[i]==last)
            {
                i++;
            }
            if(i>=nums.length)
            {
                break;
            }
            if(nums[i]-1==last)
            {
                count+=1;
                last = nums[i];
            }
            else
            {
                if(longest<count)
                {
                    longest = count;
                }
                count = 1;
                last = nums[i];
            }
        }
        if(longest<count)
        {
            longest = count;
        }
        return longest;
    }
}
