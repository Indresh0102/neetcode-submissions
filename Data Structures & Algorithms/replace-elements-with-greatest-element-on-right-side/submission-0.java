class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max_right = arr[n-1];
        arr[n-1]=-1;
        for (int i=n-2;i>=0;i--){
            int curr_ival = arr[i];
            arr[i] = max_right;
            if (max_right<curr_ival){
                max_right = curr_ival;
            }
        }
        return arr;
    }
}