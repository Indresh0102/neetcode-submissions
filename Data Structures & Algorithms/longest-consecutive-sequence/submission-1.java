class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            seen.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            int curr_len = 1;int last_val = nums[i]+1;
            while(seen.contains(last_val))
            {
                curr_len += 1;
                last_val+=1;
            }
            if(longest<curr_len)
            {
                longest = curr_len;
            }
        }
        return longest;
    }
}
