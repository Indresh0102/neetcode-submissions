class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        char[] char_arr_s = s.toCharArray();
        char[] char_arr_t = t.toCharArray();
        Arrays.sort(char_arr_s);
        Arrays.sort(char_arr_t);
        String sorted_s = new String(char_arr_s);
        String sorted_t = new String(char_arr_t);
        for (int i=0; i<s.length();i++){
            if (sorted_s.charAt(i)!=sorted_t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
