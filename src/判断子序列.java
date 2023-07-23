public class 判断子序列 {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        int l=0,r=0;

        while (r<t.length()&&l<s.length())
        {
            if((s.charAt(l)==t.charAt(r)))
            {
                l++;
                r++;
            }
            else
            {
                r++;
            }
        }
        if(l==s.length())return true;
        else return false;
    }
}
