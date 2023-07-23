import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        String maxv = "";
        String a[]=new String[3];
        for (int i = 0; i <n ; i++) {
            a[0]=str[i];
            for (int j = 0; j <n&&i!=j ; j++) {
                a[1]=str[j];
                for (int k = 0; k <n&&i!=k&&k!=j ; k++) {
                    a[2]=str[k];
                    String temp="";
                    for (int o = 0; o < 3; o++) {
                        temp+=a[o];
                    }
                    if(temp.compareTo(maxv)>=0)maxv=temp;
                }
            }
        }
        System.out.println(maxv);
    }
}
