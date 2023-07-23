public class uy {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int count=0;
        int c = 0;
        for (int x:nums) {
            if(count==0)
            {
                c=x;
            }
            if(c==x)count++;
            else count--;
        }
        return c;
    }
}
