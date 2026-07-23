class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int longest=0; int streak=1;
        for(int i=0;i<nums.length;i++)
        {
            seen.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(seen.contains(nums[i]-1)==false)
            {
                int curr_num = nums[i]+1;
                while(seen.contains(curr_num))
                {
                    streak+=1;
                    curr_num+=1;
                }
                if(longest<streak)
                {
                    longest = streak;
                }
                streak = 1;
            }
        }
        return longest;
    }
}
