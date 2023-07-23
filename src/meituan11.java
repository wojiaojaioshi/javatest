import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class meituan11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            if (check(br.readLine().trim())){
                System.out.println("Accept");
            }else {
                System.out.println("Wrong");
            }
        }
    }

    private static boolean check(String s){
        int n=s.length();
        if (n<2)return false;
        if (!Character.isLetter(s.charAt(0)))return false;
        int dsum=0;
        for (int i = 1; i < n; i++) {
            if (!Character.isLetterOrDigit(s.charAt(i)))return false;
            if (Character.isDigit(s.charAt(i))){
                dsum++;
            }
        }
        return dsum>0;
    }
}
