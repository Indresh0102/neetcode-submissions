class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frq_map = new HashMap<>();
        // HashMap<Character, Integer> countT = new Hashmap<>();
        for(int i=0; i<s.length(); i++){
            frq_map.put(s.charAt(i), frq_map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            frq_map.put(t.charAt(i), frq_map.getOrDefault(t.charAt(i),0)-1);
            if (frq_map.getOrDefault(t.charAt(i),-1)<0){
                return false;
            }
        }
        for (char key : frq_map.keySet()){
            if (frq_map.get(key)!=0){
                return false;
            }
        }
        return true;

    }
}
