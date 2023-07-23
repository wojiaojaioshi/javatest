public class 替换字符 {
    class Solution {
        public String replaceSpace(String s) {
            char str[]=s.toCharArray();
            StringBuilder stringBuilder=new StringBuilder();
            for (int i = 0; i < str.length; i++) {
                if(str[i]==' ')
                {
                    stringBuilder.append("%20");
                }else stringBuilder.append(str[i]);

            }
            return stringBuilder.toString();
        }
    }
}
