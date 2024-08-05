import java.util.Scanner;

//2024年6月25日
public class 计算面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int end_x = sc.nextInt();
        long area = 0;
        long preX = 0, preY = 0;
        for (int i = 0; i < n; i++) {
            long curX = sc.nextLong();
            long curY = preY + sc.nextLong();
            area += (curX - preX) * Math.abs(preY);
            preX = curX;
            preY = curY;
        }
        if (end_x > preX) {
            area += (end_x - preX) * Math.abs(preY);
        }

        System.out.println(area);
    }
}
