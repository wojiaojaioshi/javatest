public class BBBBB {
    public static void main(String[] args) {
//        int [][]ans=spiralMatrix()
    }
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int left=0,right=n-1,top=0,bottom=m-1;
        if(n==0)return null;
        int numsum=0;
        int [][]nums=new int[m][n];
        while(numsum<n*m)
        {
            for (int i = left; i <=right&&numsum<n*m; i++) {
                if(head!=null)
                {
                    nums[top][i]= head.val;
                    numsum++;
                    head=head.next;
                }else {
                    nums[top][i]= -1;
                    numsum++;
                }
            }
            top++;
            for (int i = top; i <=bottom &&numsum<n*m; i++) {
                if(head!=null)
                {
                    nums[i][right]=head.val;
                    numsum++;
                    head=head.next;
                }else {
                    nums[i][right]= -1;
                    numsum++;
                }
            }
            right--;
            for (int i = right; i >=left&&numsum<n*m ; i--) {
                if(head!=null)
                {
                    nums[bottom][i]=head.val;
                    numsum++;
                    head=head.next;
                }else {
                    nums[bottom][i]= -1;
                    numsum++;
                }
            }
            bottom--;
            for (int i = bottom; i >=top&&numsum<n*m ; i--) {
                if(head!=null)
                {
                    nums[i][left]=head.val;
                    numsum++;
                    head=head.next;
                }else {
                    nums[i][left]= -1;
                    numsum++;
                }
            }
            left++;
        }
        return nums;
    }
}
