import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

public class 找朋友 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(getResult(arr));
    }

    public static String getResult(int[] arr) {
        LinkedList<int[]> stack = new LinkedList<>();
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            while (true) {
                if (stack.size() == 0) {
                    stack.add(new int[]{val, i});
                    break;
                }
                int[] peek = stack.getLast();
                int peekVal = peek[0];
                int peekIndex = peek[1];
                if (val > peekVal) {
                    res[peekIndex] = i;
                    stack.removeLast();
                } else {
                    break;
                }
            }
            stack.add(new int[]{val, i});
        }
        StringBuilder str = new StringBuilder();
        for (int x : res) {
            str.append(x).append(" ");
        }
        return str.toString();
    }

}
