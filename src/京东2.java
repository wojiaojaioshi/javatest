import java.util.Scanner;

public class 京东2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt(),a=0,b=0,c=0,maxv=Integer.MIN_VALUE,minv=Integer.MAX_VALUE,ans=0;
            String str=sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A') a++;
                if (str.charAt(i) == 'B') b++;
                if (str.charAt(i) == 'C') c++;
                maxv = Math.max(Math.max(a, b), Math.max(b, c));
                minv = Math.min(Math.min(a, b), Math.min(b, c));
            }
                if(minv==maxv) System.out.println(0);
                else if(maxv==a)
                {
                    int l=0,r=0;
                    for (int j = 0; j < str.length()-1; j++) {
                        if(str.charAt(j)=='A'&&str.charAt(j+1)=='A')
                        {
                            r++;
                        }else {
                            l++;
                            r++;
                        }
                        if(minv+(r-l+1)>=maxv-(r-l+1))
                        {
                            ans++;
                            break;
                        }
                    }
                }
                else if(maxv==b)
                {
                    int l=0,r=0;
                    for (int j = 0; j < str.length()-1; j++) {
                        if(str.charAt(j)=='B'&&str.charAt(j+1)=='B')
                        {
                            r++;
                        }else {
                            l++;
                            r++;
                        }
                        if(minv+(r-l+1)>=maxv-(r-l+1))
                        {
                            ans++;
                            break;
                        }
                    }
                }
                else if(maxv==c)
                {
                    int l=0,r=0;
                    for (int j = 0; j < str.length()-1; j++) {
                        if(str.charAt(j)=='C'&&str.charAt(j+1)=='C')
                        {
                            r++;
                        }else {
                            l++;
                            r++;
                        }
                        if(minv+(r-l+1)>=maxv-(r-l+1))
                        {
                            ans++;
                            break;
                        }
                    }
                }
                
        }
    }
}
