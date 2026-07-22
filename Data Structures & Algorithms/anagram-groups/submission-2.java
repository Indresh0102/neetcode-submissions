class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> frq = new HashMap<>();
        for(int s=0;s<strs.length;s++)
        { 
            String str = strs[s];
            char[] str_arr = new char[str.length()];
            for(int i=0;i<str.length();i++)
            { 
                str_arr[i]=str.charAt(i);
            }
            Arrays.sort(str_arr);
            str = Arrays.toString(str_arr);
            if(frq.containsKey(str))
            { 
                frq.get(str).add(strs[s]);
            }
            else
            { 
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[s]);
                frq.put(str, list);
            }
        }
        return new ArrayList<>(frq.values());
        
    }
}