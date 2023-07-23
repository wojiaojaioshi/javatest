import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        int x=removeDuplicates(a);
        for (int i = 0; i <x ; i++) {
            System.out.print(a[i]);
        }
    }
    public static int a(String str)
    {
        int flat=1,index=0,sum=0;
        char[] s=str.toCharArray();
        StringBuffer stringBuffer=new StringBuffer();
        while (index<s.length&&(s[index]==' '))
        {
            index++;
        }
        if(s.length==index)return 0;
        if(s[index]=='+')
        {
            index++;
            flat=1;
        }
        else  if (s[index]=='-')
        {
            index++;
            flat=-1;
        }
        else  if(!Character.isDigit(s[index]))return 0;
        while (index<s.length)
        {
            if(Character.isDigit(s[index]))
            {
                int x=s[index]-'0';
                if(sum>(Integer.MAX_VALUE-x)/10)
                {
                    if(flat==-1)
                    {
                        return (flat*Integer.MAX_VALUE)-1;
                    }
                    else return flat*Integer.MAX_VALUE;
                }

                sum=sum*10+x;
                index++;
            }
            else break;

        }

        return flat*sum;
    }
    public static int removeDuplicates(int[] nums) {

        int slow=1,fast=1;
        while (fast<nums.length)
        {
            if(nums[fast]!=nums[fast-1])
            {
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
