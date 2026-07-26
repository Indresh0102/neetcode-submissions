class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int a,b,c,target;
        List<List<Integer>> ans = new ArrayList<>();
        for(a=0;a<nums.length;a++)
        {
            if(a>0 && nums[a]==nums[a-1])
            {
                continue;
            }
            target = -nums[a];
            b=a+1;c=nums.length-1;
            while(b<c)
            {
                if(nums[b]+nums[c] > target)
                {
                    c--;
                }
                else if(nums[b]+nums[c] < target)
                {
                    b++;
                }
                else
                {
                    ans.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    b++;c--;
                    while(b<c && nums[b]==nums[b-1])
                    {
                        b++;
                    }
                    while(c>b && nums[c]==nums[c+1])
                    {
                        c--;
                    }
                }
            }
        }
        return ans;
    }
}
