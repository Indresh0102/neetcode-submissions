class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(stack.isEmpty() || stack.peek()!=map.get(c)){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
