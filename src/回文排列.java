import java.util.concurrent.locks.Lock;

public class 回文排列 {
    public boolean canPermutePalindrome(String s) {
        long highbitmap=0;
        long lowbitmap=0;
        for (char c:s.toCharArray()) {
            if(c>=64)
            {
                highbitmap^=1L<<c-64;
            }else {
                lowbitmap^=1L<<c;
            }
        }
        return Long.bitCount(highbitmap)+Long.bitCount(lowbitmap)<=1;
    }
}
