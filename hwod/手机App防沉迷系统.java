import java.util.ArrayList;
import java.util.Scanner;

public class 手机App防沉迷系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 需要注册的App
        ArrayList<App> apps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            apps.add(new App(sc.next(), sc.nextInt(), convert(sc.next()), convert(sc.next())));
        }

        // 需要查询的时间点
        int queryTime = convert(sc.next());

        System.out.println(getResult(apps, queryTime));
    }

    public static String getResult(ArrayList<App> apps, int queryTime) {
        // 记录已注册的App
        ArrayList<App> registereds = new ArrayList<>();

        // 按照注册优先级降序
        apps.sort((a, b) -> b.priority - a.priority);

        outer:
        for (App app : apps) {
            // 起始时间>=结束时间，则注册不上
            if (app.startTime >= app.endTime) continue;

            for (App registered : registereds) {
                // 如果和前面注册的App注册时间有交集（冲突），由于已经按照优先级排序，因此后注册的优先级肯定不比前面高，因此发生冲突时，后注册的无法成功
                if (hasInterSection(app, registered)) {
                    continue outer;
                }
            }

            // 如果和前面高优先级的App无注册时间冲突，则可以注册
            registereds.add(app);
        }

        String ans = "NA";

        for (App app : registereds) {
            if (queryTime >= app.startTime && queryTime < app.endTime) {
                ans = app.name;
                // 注册成功的App时段之间互不冲突，因此queryTime只会对应一个App
                break;
            }
        }

        return ans;
    }

    public static int convert(String time) {
        // 时间格式 HH:MM，小时和分钟都是两位，不足两位前面补0
        String[] tmp = time.split(":");

        String hours = tmp[0];
        String minutes = tmp[1];
        return Integer.parseInt(hours) * 60 + Integer.parseInt(minutes);
    }

    // 判断两个范围是否有交集
    private static boolean hasInterSection(App app1, App app2) {
        int s1 = app1.startTime, e1 = app1.endTime;
        int s2 = app2.startTime, e2 = app2.endTime;

        if (s1 >= s2 && s1 < e2) {
            return true;
        }

        if (s2 >= s1 && s2 < e1) {
            return true;
        }

        return false;
    }
}
class App {
    String name;
    int priority;
    int startTime;
    int endTime;

    public App(String name, int priority, int startTime, int endTime) {
        this.name = name;
        this.priority = priority;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
