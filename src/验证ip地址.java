import java.net.InetAddress;
import java.net.UnknownHostException;

public class 验证ip地址 {
        public String validIPAddress(String IP) {

            if (IP.chars().filter(ch -> ch == '.').count() == 3) {
                return validateIPv4(IP);
            }
            else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
                return validateIPv6(IP);
            }
            else return "Neither";
        }

    private String validateIPv6(String ip) {
        String[] res=ip.split("\\:" );
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x:res) {
            if(x.length()==0||x.length()>4)return "Neither";
            for (Character y:x.toCharArray()) {
                if (hexdigits.indexOf(y) == -1) return "Neither";
            }
        }
            return "有效的 IPv6 地址，返回 IPv6";
    }

    private String validateIPv4(String ip) {
        String[] res=ip.split("\\.");
        if(res.length!=4)return "Neither";

        for (String x:res) {

            for (Character y:x.toCharArray()) {
                if(!Character.isDigit(y))return "Neither";
            }
            if(x.length()==0||x.length()>3)return "Neither";
            if(x.charAt(0)=='0'&&x.length()==1)return "Neither";
            if(Integer.parseInt(x)>255)return "Neither";
        }
        return "有效的 IPv4 地址，返回 IPv4";
    }
}
