package com.moon.ancientpoetry.web.util;

import org.springframework.util.DigestUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * @Author: zhipeng gong
 * @Date: 2018/12/29 18:45
 * @Description:
 */
public class PrivacyEncrypt {

    /**
     * MD5 加密方式
     * @param text
     * @return
     */
    public static String md5Encrypt(String text){
        int count  = text.getBytes()[0] % 10;

        for (int i = 0; i < count; i++) {
            text = DigestUtils.md5DigestAsHex(text.getBytes());
        }
        return text;
    }


    /**
     * BASE 64 加密方式 最后一位是加密次数，添加到密文末尾
     * @param text
     * @return  返回加密的值和 加密的次数
     */
    public static String base64Encrypt(String text){
        int count  = text.getBytes()[0] % 15;
        BASE64Encoder encoder = new BASE64Encoder();
        for (int i = 0; i < count; i++) {
            text = encoder.encode(text.getBytes());
        }
        return text + Integer.toHexString(count);
    }

    /**
     * base 64 解密方式  最后一位是加密次数
     * @param text
     * @return
     */
    public static String base64Decrypt(String text){
        byte[] result = text.substring(0, text.length() - 1).getBytes();
        int count = Integer.valueOf(text.substring(text.length()-1), 16);
        BASE64Decoder decoder = new BASE64Decoder();
        for (int i = 0; i < count; i++) {
            try {
                result = decoder.decodeBuffer(new String(result));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new String(result);
    }
}
