class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr_set = new ArrayList<>();
        findSubsets(nums,0,ans,curr_set);
        return ans;
    }
    public void findSubsets(int[] nums, int idx, List<List<Integer>> ans, List<Integer> curr_set){
        if(nums.length-1<idx){
            ans.add(new ArrayList<>(curr_set));
            return;
        }
        curr_set.add(nums[idx]);
        findSubsets(nums,idx+1,ans,curr_set);
        curr_set.remove(curr_set.size()-1);
        findSubsets(nums,idx+1,ans,curr_set);
    }
}
