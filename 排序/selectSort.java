public class selectSort {
    public static void main(String[] args) {
        int []dp={9,8,7,6,5,4,3,2,1,0};
        selectSort(dp);
        for (int x:dp) {
            System.out.println(x);
        }
    }
    static void  selectSort(int []arr)
    {
        int n=arr.length;
        //外层i表示当前确定的是数组的第i个数
        for (int i = 0; i < n; i++) {
            //预定设置k为i
            int k=i;
            for (int j = i+1; j <n ; j++) {
                //如果发现后边有比k预设值还要小的，就更换
                if(arr[k]>arr[j])
                {
                    k=j;
                }
            }
            //一轮循环选出[i+1,n]中最小的，放到i位置，如果k和i一样，则没有变化，不用交换
            if(i!=k)swap(arr, i, k);
        }
    }
    public static void swap(int[] A, int i, int j) {
        if (i != j) {
            A[i] ^= A[j];
            A[j] ^= A[i];
            A[i] ^= A[j];
        }
    }
}
