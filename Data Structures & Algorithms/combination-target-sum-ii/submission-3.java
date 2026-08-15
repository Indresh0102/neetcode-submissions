class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> ans = new HashSet<>();
        dfs(candidates,new ArrayList<>(),0,target,0,ans);
        return new ArrayList<>(ans);
    }
    public void dfs(int[] arr, List<Integer> curr_arr, int idx, int tgt, int sum, Set<List<Integer>> ans){
        if(sum==tgt){
            ans.add(new ArrayList<>(curr_arr));
            return;
        }
        if(idx>=arr.length || sum>tgt){
            return;
        }

        curr_arr.add(arr[idx]);
        dfs(arr,curr_arr,idx+1,tgt,sum + arr[idx],ans);
        curr_arr.remove(curr_arr.size() - 1);
        int i=1;

        while(idx+i<arr.length && arr[idx+i]==arr[idx]){
            i+=1;
        }
        dfs(arr,curr_arr,idx+i,tgt,sum,ans);
    }
}
