class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return ans;
        }
        int str_length = digits.length();
        StringBuilder str = new StringBuilder();
        Map<Character,String> digits_dict = new HashMap<>(Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        ));
        combinations(0,digits,digits_dict,ans,str);
        return ans;

    }
    public void combinations(int idx, String digits, Map<Character, String> digits_dict, List<String> ans, StringBuilder str){
        if(idx>=digits.length()){
            ans.add(str.toString());
            return;
        }
        String alphabets = digits_dict.get(digits.charAt(idx));
        for(int i=0;i<=alphabets.length()-1;i++){
            str.append(alphabets.charAt(i));
            combinations(idx+1,digits,digits_dict,ans,str);
            str.setLength(str.length()-1);
        }
    }
}
