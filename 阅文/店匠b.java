import java.util.Scanner;

public class 店匠b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char []pos=str.toCharArray();
        int [][]dir=new int[2000][2000];
        int x=1000, y=1000;
        dir[x][y]=1;
        for (int i = 0; i < pos.length; i++) {
            if(pos[i]=='N')
            {
                x-=1;
                if(dir[x][y]==0)
                {
                    dir[x][y]=1;
                    continue;
                }else{
                    System.out.println("true");
                    break;
                }
            }
            if(pos[i]=='S')
            {
                x+=1;
                if(dir[x][y]==0)
                {
                    dir[x][y]=1;
                    continue;
                }else{
                    System.out.println("true");
                    break;
                }
            }
            if(pos[i]=='W')
            {
                y-=1;
                if(dir[x][y]==0)
                {
                    dir[x][y]=1;
                    continue;
                }else{
                    System.out.println("true");
                    break;
                }
            }
            if(pos[i]=='E')
            {
                y+=1;
                if(dir[x][y]==0)
                {
                    dir[x][y]=1;
                    continue;
                }else{
                    System.out.println("true");
                    break;
                }
            }
        }
        if(dir[x][y]==0)
        System.out.println("false");
    }

}
