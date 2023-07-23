import java.util.HashMap;
import java.util.Map;

public class quickSort {
    public static void main(String[] args) {
        int []dp={9,8,7,6,5,4,3,2,1,0};
//        quickSort(dp,0,9);
        quickSort2(0,9,dp);
        for (int x:dp) {
            System.out.println(x);
        }
    }
    private static void quickSort(int[] array, int start,int end) {
        if (start <end) {
            int key = array[start];//用待排数组的第一个作为基准值
            int i = start;//i所处位置要不然和j一样，要不然就是比key大的位置（始终i<=j）
            for (int j = start + 1; j <= end; j++) {
                //当有比基准值小的数，放到前面
                if (key > array[j]) {
                    swap(array, j, ++i);
                }
            }
            //最后i的位置即为基准值的位置，左边都比key小，右边都比key大
            array[start] = array[i];//先挪，然后再把中枢放到指定位置
            array[i] = key;
            quickSort(array, start, i - 1);
            quickSort(array, i + 1, end);
        }
    }
    public static void swap(int[] A, int i, int j) {
        if (i != j) {
            A[i] ^= A[j];
            A[j] ^= A[i];
            A[i] ^= A[j];
        }
    }
     static void quickSort2(int left,int right,int arr[])
     {
         //如果l>=j递归结束
         if(left>=right)return;
         int i=left,j=right;
         int temp=arr[left];//基准值一般以左边界
         //出循环的条件是i=j
         while(i!=j)
         {
             //先右往左找比基准值小的
             while(arr[j]>=temp&&i<j)j--;
             //将比基准值小的放到前面
             if(i<j)arr[i++]=arr[j];
             //再左往右找比基准值大的
             while(arr[i]<=temp&&i<j)i++;
             //将比基准值大的放到后面
             if(i<j)arr[j--]=arr[i];
         }
         //循环结束i==j
         //再把基准值赋值到下标为i的位置
         arr[i]=temp;
         //递归两边
         quickSort2(left, i-1, arr);
         quickSort2(i+1, right, arr);
     }

}
