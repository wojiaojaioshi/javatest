public class D {
    public static void main(String[] args) {
        System.out.println(a(12293192));
    }
    public static boolean a(int x)
    {
        String str=String.valueOf(x);
        for (int i = 0,j=str.length()-1; i <=j; i++,j--) {
            if(str.charAt(i)==str.charAt(j))
            {
                continue;
            }
            else return false;
        }
        return true;
    }
}
