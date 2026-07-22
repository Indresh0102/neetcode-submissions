class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> res = new HashMap<>();
        char A = 'a';
        for(int i=0; i<strs.length;i++){
            String str = strs[i];
            //create frq array and convert it to string
            int[] frq_arr = new int[26];
            for(int j=0;j<str.length();j++){
                frq_arr[(int) str.charAt(j) - (int) A]+=1;
            }
            String frq_str = Arrays.toString(frq_arr);
            if (res.containsKey(frq_str)){
                res.get(frq_str).add(str);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                res.put(frq_str, list);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key: res.keySet()){
            ans.add(res.get(key));
        }
        return ans;
    }
}
