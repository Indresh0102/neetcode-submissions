class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();
        for(int i=0; i<strs.size();i++)
        {
            String str = strs.get(i);
            encoded_string.append(str.length());
            encoded_string.append("#");
            encoded_string.append(str);
        }
        return encoded_string.toString();
    }

    public List<String> decode(String str) {
        int len; int i=0;
        StringBuilder str_len = new StringBuilder();
        List<String> decoded_strs = new ArrayList<>();
        while(i<str.length())
        {
            if (str.charAt(i)=='#')
            {
                i=i+1;
                len = Integer.parseInt(str_len.toString());
                StringBuilder dec_str = new StringBuilder();
                int target = i + len;
                for(;i<target;i++)
                {
                    dec_str.append(str.charAt(i));
                }
                decoded_strs.add((dec_str.toString()));
                str_len.setLength(0);
            }
            else
            {
            str_len.append(str.charAt(i));
            i++;
            }
        }
        return decoded_strs;
    }
}
