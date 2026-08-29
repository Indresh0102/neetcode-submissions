class Solution {
    public int getSum(int a, int b) {
        int curr_bit,res=0,carry=0,a_bit,b_bit, mask = 0xFFFFFFFF;
        for(int i=0;i<32;i++){
            a_bit = (a>>i)&1;
            b_bit = (b>>i)&1;
            curr_bit = a_bit^b_bit^carry;
            carry = (a_bit+b_bit+carry)>=2?1:0;
            if(curr_bit==1){
                res|=curr_bit<<i;
            }
        }
         if (res > 0x7FFFFFFF) {
            res = ~(res ^ mask);
        }

        return res;
    }
}
