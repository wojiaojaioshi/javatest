import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int ans[]={10,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10-i-1 ; j++) {
                if(ans[j]>ans[j+1])
                {
                    int temp=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=temp;
                }
            }
        }
        for (int x:ans) {
            System.out.println(x);
        }

    }
}
