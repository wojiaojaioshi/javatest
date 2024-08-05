import java.time.format.SignStyle;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class 英文输入法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pre = sc.nextLine();
        System.out.println(getResult(str, pre));
    }

    static String getResult(String str, String pre) {
        String[] strings = str.split("[^a-zA-Z]");
        List<String> ans = Arrays.stream(strings).filter(x -> x.startsWith(pre)).collect(Collectors.toList());
        Collections.sort(ans);
        ans = ans.stream().distinct().collect(Collectors.toList());
        Set<String>set=new HashSet<>();
        StringBuilder res = new StringBuilder();
        for (String x : ans) {
            res.append(x);
            res.append(" ");
        }
        if (res.toString().equals("")) {
            return pre;
        } else {
            return res.toString();
        }
    }

}
