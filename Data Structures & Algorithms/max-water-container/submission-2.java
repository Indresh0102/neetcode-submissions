class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,ans=0,curr;
        while(i<j)
        {
            int h = Math.min(heights[i],heights[j]);
            int width = j-i;
            int curr_cap = h*width;
            ans = Math.max(curr_cap,ans);
            
            if(heights[i]<heights[j])
            {
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
