public class G extends ClassLoader{

    public static String a(String [] strs)
    {
        String tem=strs[0];int len=0;
        if(strs.length==0)return "";
        for (String str:strs) {
            while(!str.startsWith(tem))
            {
                if(tem.length()==0)return "";
                tem=tem.substring(0,tem.length()-1);
            }
        }
        return tem;

    }
}
