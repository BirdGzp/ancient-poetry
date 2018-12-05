package com.moon.ancientpoetry.common.util;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteToFile {

    private String path;
    private FileOutputStream fos;

    public WriteToFile(String path) throws FileNotFoundException {
        this.path = path;
        fos = new FileOutputStream(path, true);
    }

    public  void writeDataToFile(String message) {
        byte[] bytes = message.getBytes();


        try{
            FileChannel fc = fos.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate( 1024*1000 );

            for (int i=0; i<bytes.length; ++i) {
                buffer.put( bytes[i] );
            }
            buffer.flip();
            fc.write( buffer );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close(){
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void appendFile(String text) {
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true)));
            out.write(text);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null != out){
                    out.flush();
                    out.close();
                }
            }catch(Exception e){

            }
        }
    }

}
