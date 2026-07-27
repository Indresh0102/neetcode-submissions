class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int res = 0;
        for(int i=0;i<tokens.length;i++)
        {
            if("+-*/".contains(tokens[i]))
            {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                if(tokens[i].equals("+"))
                {
                    res=a+b;
                }
                else if(tokens[i].equals("-"))
                {
                    res=a-b;
                }
                else if(tokens[i].equals("*"))
                {
                    res=a*b;
                }
                else if(tokens[i].equals("/"))
                {
                    res=a/b;
                }
                stack.push(String.valueOf(res));
            }
            else
            {
                stack.push(tokens[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
