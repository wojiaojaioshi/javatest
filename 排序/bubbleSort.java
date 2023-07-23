public class bubbleSort {
    public static void main(String[] args) {
        int []dp={9,8,7,6,5,4,3,2,1,0};
        bubbleSort(dp);
        for (int x:dp) {
            System.out.println(x);
        }
    }
    static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        //外层i表示有n-1轮，即每轮确定一个数的最终位置，确认n-1个位置即确定n个数的位置
        for(int i=0;i<n-1;i++)
        {
            //每轮执行一次遍历，每轮得出一个最大值，即确定一个数的最终位置
            for (int j =0 ; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1])
                {
                    //j和j+1位置元素交换
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
