public class No5 {
    public String replaceSpace(String s) {
        StringBuilder StringBuilder=new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                StringBuilder.append("%20");
            }else {
                StringBuilder.append(s.charAt(i));
            }
        }
        return StringBuilder.toString();
    }
}
