public class No46 {
    public int translateNum(int num) {
        String str=String.valueOf(num);
        int p=0,q=0,r=1;
        String a;
        
        for (int i = 0; i < str.length(); i++) {
            p=q;
            q=r;
            r=0;
            r+=q;
            if(i==0)continue;
            String pre=str.substring(i-1, i+1);
            if(pre.compareTo("25")<=0&&pre.compareTo("10")>=0)
                r+=p;
        }
        return r;
    }
}
