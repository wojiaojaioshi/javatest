import java.util.Arrays;
import java.util.List;

public class mergeSort {
    public static void main(String[] args) {
        int []dp={9,8,7,6,5,4,3,2,1,0};
        mergeSort(0,9,dp);
        for (int x:dp) {
            System.out.println(x);
        }
    }
    public static void mergeSort(int left,int right,int []ars){
        //当划分到长度为1，即一个数时进行合并
        if(left<right)
        {
            int mid=left+(right-left)>>1;
            //一直分半分半
            mergeSort(left, mid, ars);
            mergeSort(mid+1, right, ars);
            //上面函数递归出来后进行合并
            merge(left, right, mid, ars);
        }
    }
    static void merge(int left,int right,int mid,int []a)
    {
        int length=right-left+1;
        int []temp=new int[length];
        int tmpIndex=0;
        int l=left,r=mid+1;
        //两半数组进行比较，合成一个temp数组
        while(l <= mid && r <= right)
        {
            if(a[l]<=a[r])
            {
                temp[tmpIndex++]=a[l++];
            }else {
                temp[tmpIndex++]=a[r++];
            }
        }
        while (l<=mid)temp[tmpIndex++]=a[l++];
        while (r<=right)temp[tmpIndex++]=a[r++];
        tmpIndex=0;
        //再把temp数组10赋回原来的数组
        while (tmpIndex<length)
        {
            //原数组下表应该从left开始，因为当前是left-right区间
            a[left+tmpIndex]=temp[tmpIndex];
            tmpIndex++;
        }
    }

}
