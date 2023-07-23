//import java.util.ArrayList;
//import java.util.List;
//
//public class KKK {
//    int ans;
//    List<List<Character>>list;
//    List<Character>stringList;
//    char[] pos={'+','-'};
//    public int findTargetSumWays(int[] nums, int target) {
//        dfs(stringList,0,nums,pos);
//
//        for (int i = 0; i <list.size() ; i++) {
//            int sum=0;int a,b;
//            for (int j = 0; j <nums.length ; j++) {
//                char temp=list.get(i).get(j);
//                if(temp=='+'){
//                     a=1;
//                }else
//                {
//                     a=-1;
//                }
//                 b=nums[j];
//                sum+=a*b;
//            }
//            if(sum==target)ans++;
//        }
//        return ans;
//    }
//    void dfs(List<Character>stringList,int index,int []nums,char[] pos,int sum,int target)
//    {
//        if(index==nums.length)
//        {
//            if(sum==target)
//            {
//                for (int i = 0; i < stringList.size(); i++) {
//                    System.out.println(stringList.get(i));
//                }
//                list.add(stringList);
//                return;
//            }
//        }
//        for (int i = 0; i < pos.length; i++) {
//            stringList.add(pos[i]);
//            dfs(stringList, index+1, nums,pos);
//            stringList.remove(index);
//        }
//    }
//
//}
