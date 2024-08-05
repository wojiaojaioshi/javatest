package 贪心;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 停车场车辆统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cars = sc.nextLine().split(",");
        List<String> preList = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < cars.length; i++) {
            String c = cars[i];
            if (c.equals("1")) {
                preList.add(cars[i]);
                if (preList.size() == 3) {
                    ans++;
                    preList = new ArrayList<>();
                }
            }
            if (c.equals("0")) {
                if (preList.size() != 0) {
                    preList=new ArrayList<>();
                    ans++;
                }
            }
        }
        if (preList.size() != 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
