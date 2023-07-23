import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class maopao {
    public static void main(String[] args) {
        int[]arg={9,8,6,4,2,1,3,51,2,3};
        int n=arg.length;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 1; j <= n-i-1; j++) {
                if(arg[j]<arg[j-1])
                {
                    int temp=arg[j];
                    arg[j]=arg[j-1];
                    arg[j-1]=temp;
                }
            }
        }
        for (int x:arg) {
            System.out.print(x+" ");
        }
    }
}
