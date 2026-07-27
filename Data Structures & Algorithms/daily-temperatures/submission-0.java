class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];
        stack.push(len-1);
        res[len-1] = 0;
        for(int i=len-2;i>=0;i--)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                res[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}
