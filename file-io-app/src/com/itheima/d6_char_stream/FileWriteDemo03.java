package com.itheima.d6_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteDemo03 {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("file-io-app/src/out08.txt",true);
        fw.write(98);
        fw.write("\r\n");
        fw.write(97);
        fw.write("\r\n");
        fw.write('徐');
        fw.write("\r\n");
        fw.write("abc我是中国人");
        fw.write("abc我是中国人",0,3);
        fw.write("abc我是中国人",3,5);
        fw.close();

    }
}
