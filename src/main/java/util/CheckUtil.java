package util;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
public class CheckUtil {

    private static final String token = "weixin";
    public static boolean checkSignature(String signature,String timestamp,String nonce){

        String[] arr = new String[] { token, timestamp, nonce };

        Arrays.sort(arr);
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        String temp = getSHA1String(content.toString());

        return temp.equals(signature);
    }

    private static String getSHA1String(String data){
        return DigestUtils.sha1Hex(data);
    }
}
