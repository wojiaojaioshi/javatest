import java.util.Scanner;

public class meituan16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        char[] s=str.toCharArray();
        int left,right;
        for ( left = 0; left < s.length; left++) {
            if(s[left]=='M')
            {
                left++;
                break;
            }
        }
        for (right = n-1;  right>=0 ; right--) {
            if(s[right]=='T')
            {
                right--;
                break;
            }
        }
        while (!((s[left] == 'T') && (s[right] == 'M')))
        {
            if(s[left]!='T')
            {
                left++;
            }
            if(s[right]!='M')
            {
                right--;
            }
        }
        //左闭右开
        System.out.println(new String(s).substring(left+1,right));
    }
}
