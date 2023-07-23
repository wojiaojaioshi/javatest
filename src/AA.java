import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AA {
    List<String >list=new ArrayList<>();
    public  Map<Character,String>map=new HashMap<>();

    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty())return list;
        //存储数字字符-字符串键值对
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        dfs(list, 0, map, new StringBuffer(), digits);
    return list;
    }       //返回值    //原字符串遍历下标   //键值对                 //存储当前的配对字符串       //原字符
    void dfs(List<String> list, int index, Map<Character,String>map, StringBuffer stringBuffer, String digits)
    {
        //以遍历的字符串下标昨为递归出口
        if(index==digits.length())
        {
            list.add(stringBuffer.toString());
            return;
        }
        else {
            char a=digits.charAt(index);//获取原字符串的当前字符
            String b=map.get(a);
            for (int i = 0; i < b.length(); i++) {//遍历当前字符对应的键值对字符串
                stringBuffer.append(b.charAt(i));
                dfs(list, index+1, map, stringBuffer, digits);
                stringBuffer.deleteCharAt(index);//dfs函数结束，返回的Stringbuffer删掉第二个，这里删掉第一个（假设两个）
            }
        }
    }

}
