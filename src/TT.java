public class TT {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=m-1,q=n-1,k=m+n-1;
        int nums[]=new int[m+n];
        while(p>=0&&q>=0)
        {
            if(p==0)nums[k--]=nums2[q--];
            else if(q==0)nums[k--]=nums1[p--];
            else if(nums1[p]>=nums2[q])
            {
                nums[k--]=nums1[p--];
            }
            else nums[k--]=nums2[q--];
        }
        for (int i = 0; i < nums.length; i++) {
            nums1[i]=nums[i];
        }
    }
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int p=0,q=0,k=0;
//        int nums[]=new int[m+n];
//        while(p<m&&q<n)
//        {
//            if(p==m)nums[k++]=nums2[n++];
//            else if(q==n)nums[k++]=nums1[m++];
//            else if(nums1[m]<=nums2[n])
//            {
//                nums[k++]=nums1[m];
//            }
//            else nums[k++]=nums2[n];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums1[i]=nums[i];
//        }
//    }
}
