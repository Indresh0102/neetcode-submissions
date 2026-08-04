class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder str = new StringBuilder();
        List<String> ans = new ArrayList<>();
        int open=0,closed=0;
        validParanthesis(n, str, ans, open, closed);
        return ans;
    }
    public void validParanthesis(int n, StringBuilder curr_str, List<String> ans, int open, int closed){
        if(curr_str.length()==2*n){
            ans.add(curr_str.toString());
            return;
        }
        if(open<n){
            curr_str.append("(");
            validParanthesis(n,curr_str, ans, open+1,closed);
            curr_str.setLength(curr_str.length()-1);
        }
        if(open>closed){
            curr_str.append(")");
            validParanthesis(n, curr_str, ans, open, closed+1);
            curr_str.setLength(curr_str.length()-1);
        }
    }

}
