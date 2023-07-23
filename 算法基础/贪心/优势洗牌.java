import java.util.Arrays;
import java.util.PriorityQueue;

public class 优势洗牌 {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len=nums1.length,k=0;
        int []res=new int[len];
        Arrays.sort(nums1);
        int min=0,max=nums1.length-1;
        PriorityQueue<int []>priorityQueue=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for (int i = 0; i < nums2.length; i++) {
            priorityQueue.add(new int[]{nums2[i],i});
        }
        while(!priorityQueue.isEmpty())
        {
            int temp[]=priorityQueue.poll();
            int index=temp[1];
            int val=temp[0];
            if(nums1[max]>val)
            {
                res[index]=nums1[max--];
            }else{
                res[index]=nums1[min++];
            }
        }
        return res;
    }
}
