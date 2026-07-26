class Solution {
    public int maxArea(int[] heights) {
        int ans=0,curr;
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights.length;j++)
            {
                curr = heights[i];
                if(heights[i]>heights[j])
                {
                    curr = heights[j];
                }
                if(heights[i]<heights[j])
                {
                    curr = heights[i];
                }
                if(ans<curr*(j-i))
                {
                    ans = curr*(j-i);
                }
            }
        }
        return ans;
    }
}
