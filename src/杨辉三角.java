import java.util.ArrayList;
import java.util.List;

public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>lists=new ArrayList<>();
        List<Integer>t=new ArrayList<>();
        t.add(1);
        lists.add(t);
        if(numRows==1)return lists;
        for (int i = 1; i < numRows; i++) {
            List<Integer>list=new ArrayList<>();
            for (int j = 0; j < numRows; j++) {
                if(j==0||j==i)
                    list.add(1);
                else
                {
                    list.add(lists.get(i-1).get(j)+lists.get(i-1).get(j-1));
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
