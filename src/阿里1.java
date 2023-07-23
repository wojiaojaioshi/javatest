import java.util.Scanner;

public class 阿里1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [][]nums=new int[n][k];
        int p=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                nums[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                int flat=1;
                for (int l = 0; l < nums[0].length-1; l++) {
                    if(nums[i][l]+nums[j][l]!=nums[i][l+1]+nums[j][l+1])
                    {
                        flat=0;
                        break;
                    }
                }
                if(flat==1)sum++;
            }
        }
        System.out.println(sum);
    }
}
