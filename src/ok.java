public class ok {
    public static void main(String[] args) {

    }
    public void reverseString(char[] s) {
        char temp=0;
        for (int i = 0 ,j= s.length-1;i<j ; i++,j--) {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }

}
