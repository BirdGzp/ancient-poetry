package com.moon.ancientpoetry.common.util;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlImageDownloadUtil {
    public static void getHtmlPicture(String httpUrl) {
        URL url;
        BufferedInputStream in;
        FileOutputStream file;
        try {
            String fileName = httpUrl.substring(httpUrl.lastIndexOf("/"));
            String filePath = "E:\\personal file\\author\\";
            //File f = new File(filePath + fileName);
//            if(f.exists()){
//                return;
//            }
            url = new URL(httpUrl);

            in = new BufferedInputStream(url.openStream());

            file = new FileOutputStream(new File(filePath+fileName));

            int t;
            while ((t = in.read()) != -1) {
                file.write(t);
            }
            file.close();
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
