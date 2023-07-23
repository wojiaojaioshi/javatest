import java.util.Scanner;

public class sadiasodj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int L = 1; L <=str.length() ; L++) {
            for (int i = 0; i < str.length()&&i+L<=str.length(); i++) {
                String temp=str.substring(i,i+L);
                int l=i,r=i+L-1,flat=0;
                while(l<=r)
                {
                    if(str.charAt(l)!=str.charAt(r))
                    {
                        flat=1;
                        break;
                    }
                    l++;r--;
                }
                if(flat==0) System.out.println(temp);
            }
        }
    }
}
