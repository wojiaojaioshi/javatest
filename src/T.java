public class T {
    public static void main(String[] args) {
        System.out.println(translate("我的撒打803293"));
    }
    public static String translate (String str) {
        String tempStr = "";
        try {
            tempStr = new String(str.getBytes("ISO-8859-1"), "GBK");
            tempStr = tempStr.trim();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tempStr;
    }
}
