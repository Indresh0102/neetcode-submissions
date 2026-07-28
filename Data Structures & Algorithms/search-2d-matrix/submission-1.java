class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, bottom = rows-1, m=0;
        while(top<=bottom)
        {
            m = (top+bottom)/2;
            if(matrix[m][cols-1]<target){
                top = m+1;
            }else if(matrix[m][0]>target){
                bottom = m-1;
            }else{
                break;
            }
        }
        if(!(top<=bottom)){
            return false;
        }
        int l=0,r=matrix[0].length-1,mid=0;
        while(l<=r){
            mid = (l+r)/2;
            if(matrix[m][mid]<target){
                l=mid+1;
            }else if(matrix[m][mid]>target){
                r=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}
