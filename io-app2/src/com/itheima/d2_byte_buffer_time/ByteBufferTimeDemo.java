package com.itheima.d2_byte_buffer_time;

import java.io.*;

public class ByteBufferTimeDemo {
    private static final String SRC_FILE = "D:\\英雄时刻\\25138484\\英雄时刻_20191220-22点33分04s.avi";
    private static final String DEST_FILE = "D:\\英雄时刻\\25138484\\";
    public static void main(String[] args) {
        //copy01();
        copy02();
        copy03();
        copy04();

    }

    private static void copy04() {
        long startTime = System.currentTimeMillis();
        try(

                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE+"new6.avi");
                OutputStream bos= new BufferedOutputStream(os);
        ){
            byte[] buffer =new byte[1024];
            int len;
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成！");


        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy04耗时"+(endTime-startTime)/1000.0+"s");
    }


    private static void copy03() {
        long startTime = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(DEST_FILE+"new5.avi");
                OutputStream bos= new BufferedOutputStream(os);
        ){
            int len;
            while ((len = bis.read())!=-1){
                bos.write(len);
            }
            System.out.println("复制完成！");


        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy03耗时"+(endTime-startTime)/1000.0+"s");
    }

    private static void copy02() {
        long startTime = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE+"new4.avi");
                ){
            byte[] buffer =new byte[1024];
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成！");

        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy02耗时"+(endTime-startTime)/1000.0+"s");
    }

    private static void copy01() {
        long startTime = System.currentTimeMillis();
        try(
                InputStream is = new FileInputStream(SRC_FILE);
                OutputStream os = new FileOutputStream(DEST_FILE+"new3.avi");
                ){
            int len;
            while ((len = is.read())!=-1){
                os.write(len);
            }
            System.out.println("复制完成！");


        }catch (Exception e){
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("copy01耗时"+(endTime-startTime)/1000.0+"s");
    }
}
