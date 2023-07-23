public class 中心扩散法 {
    public String longestPalindrome(String s) {
        if(s.length()<2)return s;
        int start=0,maxLen=0;
        int length=s.length();
        for (int i = 0; i < length; ) {
            //如果后面的长度小于=maxlen/2，它就算是回文子串也不可能是最长的
            if (length-i<=maxLen/2)break;;
            int left=i,right=i;
            while (right<length-1&&s.charAt(right+1)==s.charAt(right))right++;
            i=right+1;
            while(right<length-1&&left>0&&s.charAt(right+1)==s.charAt(left-1)){
                right++;
                left--;
            }
            if(right-left+1>maxLen)
            {
                start=left;
                maxLen=right-left+1;
            }
        }
        return s.substring(start,start+maxLen);
    }
}
