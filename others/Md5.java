import sun.applet.Main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @program: person-demo
 * @description: md5加密
 * @author: jijiang
 * @create: 2019-11-23 14:46
 **/

public class Md5 {
    public static String securityString(String msg) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] data = digest.digest(msg.getBytes());
            return  new String(data);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void main(){
        String string = securityString("12345");
        System.out.println(string);
    }
}

