package java8.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/5/27.
 */
public class IOStudy {

    public static void main(String[] args) throws IOException {

        String filePath = "c:/Users/natha/Desktop/The Friends of Voltaire.txt";

        // 读文件
        FileInputStream fileInputStream = new FileInputStream(filePath);
        // 读特定数据类型+缓冲流
        DataInputStream dataInputStream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filePath)));
        dataInputStream.readFloat();
        // 可以塞回去的回推流
        PushbackInputStream pushbackInputStream = new PushbackInputStream(new FileInputStream(filePath));
        int b = pushbackInputStream.read();
        pushbackInputStream.unread(b);

    }
}
