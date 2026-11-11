class Solution {
    public String longestPalindrome(String s) {
        
        int longest = 0,l = 0,r=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))){
                    if(longest<j-i+1){
                        longest = j-i+1;
                        l = i;
                        r = j+1;
                    }
                }
            }
        }
        return s.substring(l,r);
    }
    public boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
}
