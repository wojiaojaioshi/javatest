public class 大数相乘 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
        public static String multiply(String num1, String num2) {
           if(num1.equals("0")||num2.equals("0"))return "0";
            int []res=new int[num1.length()+num2.length()];
           for (int i = num2.length()-1; i >=0; i--) {
                int n2=num2.charAt(i)-'0';
                for (int j = num1.length()-1; j >=0; j--) {
                    int n1=num1.charAt(j)-'0';
                    int sum=res[i+j+1]+n1*n2;
                    res[i+j+1]=sum%10;
                    res[i+j]+=sum/10;
                }
            }
            StringBuffer stringBuffer=new StringBuffer();
            for (int i = 0; i < res.length; i++) {
                if(i==0&&res[i]==0)continue;
                stringBuffer.append(res[i]);
            }
            return stringBuffer.toString();
        }
}
