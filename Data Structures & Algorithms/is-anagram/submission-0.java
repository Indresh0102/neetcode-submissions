class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            int count_t = 0;
            for(int j=0; j<t.length();j++){
                if (s.charAt(i) == t.charAt(j)){
                    count_t+=1;
                }
            }
            int count_s = 0;
            for(int k=0; k<s.length();k++){
                if (s.charAt(i) == s.charAt(k)){
                    count_s+=1;
                }
            }
            if (count_t!=count_s){
                return false;
            }
        }
        return true;
    }
}
