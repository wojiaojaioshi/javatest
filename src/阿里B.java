import java.util.Scanner;

public class 阿里B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;int [][]a=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
                if(a[i][j]==0)
                ans=ans+finl(i,j,a)+finn(i, j, a);
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(a[i][j]==0)
                {
                    ans=ans+finr(i, j,a )+fins(i, j,a );
                }
            }
        }
        System.out.println(ans);
    }
    static int finl(int x,int y,int [][]a)
    {
        int flat=0;
        for (int i = y; i >=0 ; i--) {
            if(a[x][i]==1)
            {
                flat=1;
                break;
            }
        }
        if(flat==1)return 1;
        else return 0;
    }
    static int finr(int x,int y,int [][]a)
    {
        int flat=0;
        for (int i = y; i <a[0].length ; i++) {
            if(a[x][i]==1)
            {
                flat=1;
                break;
            }
        }
        if(flat==1)return 1;
        else return 0;
    }
    static int finn(int x,int y,int [][]a)
    {
        int flat=0;
        for (int i = x; i >=0 ; i--) {
            if(a[i][y]==1)
            {
                flat=1;
                break;
            }
        }
        if(flat==1)return 1;
        else return 0;
    }
    static int fins(int x,int y,int [][]a)
    {
        int flat=0;
        for (int i = x; i <a.length ; i++) {
            if(a[i][y]==1)
            {
                flat=1;
                break;
            }
        }
        if(flat==1)return 1;
        else return 0;
    }
}
