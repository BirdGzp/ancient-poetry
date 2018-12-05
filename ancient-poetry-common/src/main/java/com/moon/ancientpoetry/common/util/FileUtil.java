package com.moon.ancientpoetry.common.util;

import java.io.*;

public class FileUtil {
    public static String readTxtFile(String fileName) throws IOException, FileNotFoundException {
        StringBuilder result = new StringBuilder();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);

        String read = null;
        int count = 0;
        while((read = bufferedReader.readLine()) != null){
            result.append(read + "\r\n");
            count++;
        }

        if(bufferedReader != null){
            bufferedReader.close();
        }

        if(fileReader != null){
            fileReader.close();
        }
        return result.toString();
    }

    /**
     * @description 写文件
     * @param args
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public static boolean writeTxtFile(String content,String fileName) throws UnsupportedEncodingException, IOException{
        FileOutputStream o = null;
        o = new FileOutputStream(fileName);
        o.write(content.getBytes("UTF-8"));
        o.close();
        return true;
    }
}
