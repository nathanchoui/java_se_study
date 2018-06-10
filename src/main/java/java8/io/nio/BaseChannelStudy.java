package java8.io.nio;

import java8.io.Constants;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * channel在java中最重要的四个实现：
 * 1、FileChannel 从文件中读写数据
 * 2、DatagramChannel 能通过UDP读写网络中的数据
 * 3、SocketChannel 能通过TCP读写网络中的数据
 * 4、ServerSocketChannel 可以监听新进来的TCP连接，像Web服务器那样。对每一个新进来的连接都会创建一个SocketChannel
 * <p>
 * Created by nathan.z on 2018/5/27.
 */
public class BaseChannelStudy {

    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile(Constants.FILE_PATH, "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        while (bytesRead != -1) {

            System.out.println("Read " + bytesRead);
            buf.flip();

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
