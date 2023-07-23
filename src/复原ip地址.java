import java.util.ArrayList;
import java.util.List;

public class 复原ip地址 {

    public  List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<>();
        //     str当前加入的字符，p第几块内容  idx s中的第几个位置
        backtrack(ans, s, "", 0, 0);
        return ans;
    }

    public  void backtrack(List<String> list, String s, String str, int p, int idx) {
        if(p==4&&idx==s.length())
        {
            list.add(str);
            return;
        }
        if((4-p)*3<s.length()-idx)return;
        int sum=0;
        for (int i = idx; i <s.length() ; i++) {
            if(s.charAt(idx)=='0'&&i>idx)break;
            sum=sum*10+s.charAt(i)-'0';
            if(sum>=0&&sum<=255)
            {
                backtrack(list, s, str+sum+(p==3?"":"."), p+1, i+1);
            }else return;
        }
    }
}
