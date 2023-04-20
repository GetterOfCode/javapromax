package com.itheima.d4_bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutPutStreamDemo04 {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("file-io-app/src/out04.txt");//追加（file，true）;
        os.write('a');
        os.write(98);
        /*os.write('徐');*/
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        //os.flush();//刷新数据
        byte[] buffer = {'a',97,98,99};
        os.write(buffer);
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        byte[] buffer2 = "我是中国人".getBytes();
        os.write(buffer2);
        os.write("\r\n".getBytes(StandardCharsets.UTF_8));
        byte[] buffer3 = {'a',97,98,99};
        os.write(buffer3,0,3);
        os.close();//释放资源 包含刷新 关闭流不可以使用了

    }
}
