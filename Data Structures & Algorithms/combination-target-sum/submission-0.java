class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr_set = new ArrayList<>();
        dfs(nums,curr_set,0,0,target,ans);
        return ans;
    }
    public void dfs(int[] nums,List<Integer> curr_set,int sum, int idx, int tgt, List<List<Integer>> ans){
        if(sum==tgt){
            ans.add(new ArrayList<>(curr_set));
            return;
        }
        if(idx>=nums.length || sum>tgt){
            return;
        }
        curr_set.add(nums[idx]);
        dfs(nums,curr_set,sum+nums[idx],idx,tgt,ans);
        curr_set.remove(curr_set.size()-1);
        dfs(nums,curr_set,sum,idx+1,tgt,ans);
    }
}
