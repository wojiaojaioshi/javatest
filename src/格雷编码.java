//import java.util.List;
//
//public class 格雷编码 {
//    public List<Integer> grayCode(int n) {
//
//
//    }
//    void dfs(StringBuilder code,List<Integer>list,int n)
//    {
//        if(code.length()==n)
//        {   int sum=0,j=0;
//            for (int i = code.length()-1; i >=0 ; i++) {
//                sum+=code.charAt(i)*Math.pow(2, j++);
//            }
//            list.add(sum);
//        }
//        for (int i = 0; i < 2; i++) {
//            code.append(i);
//            dfs(code, list, n);
//            code.deleteCharAt(code.length()-1);
//        }
//    }
//}
