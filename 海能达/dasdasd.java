import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dasdasd {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str=in.next();
            if(str.equals("")) System.out.println("");
            int i=0,j=0,n=str.length(),maxlen=0;
            String ans="";
            Set<Character> set=new HashSet<>();
            int sum=0;
            while(j<n)
            {
                if(sum==3&&str.charAt(j)!=str.charAt(j-1))
                {
                    if(j-i>maxlen)
                    {
                        maxlen=Math.max(maxlen, j-i);
                        ans=i+" "+(j-1);
                    }

                    char temp=str.charAt(i);
                    while (str.charAt(i)==temp)i++;
                    sum--;
                    set.remove(temp);
                }
                if(!set.contains(str.charAt(j)))
                {
                    sum++;
                    set.add(str.charAt(j));
                }
                j++;
            }

            String []t=ans.split(" ");
            if(t.length!=2) System.out.println("");
            else{
                int l=Integer.parseInt(t[0]);
                int r=Integer.parseInt(t[1]);
                System.out.println(str.substring(l,r+1));
            }
        }
}
