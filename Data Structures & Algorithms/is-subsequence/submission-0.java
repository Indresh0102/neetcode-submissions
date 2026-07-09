class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0; int j=0;
        int s_len = s.length();
        int t_len = t.length();
        while(i<s_len && j<t_len){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if (i==s_len){
            return true;
        }
        else{
            return false;
        }

    }
}