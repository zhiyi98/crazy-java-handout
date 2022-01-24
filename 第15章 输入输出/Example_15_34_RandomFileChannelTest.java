import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Example_15_34_RandomFileChannelTest {

  public static void main(String[] args) {
    try {
      File f = new File("a.txt");
      RandomAccessFile raf = new RandomAccessFile(f, "rw");
      FileChannel randomChannel = raf.getChannel();//与此文件关联的文件通道
      //将此通道文件的一个区域直接映射到内存中。
      ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY,0, raf.length());
      randomChannel.position(f.length());//设置此通道的文件位置。
      randomChannel.write(buffer);// 写入内存中的映射
      // Channel对应的文件过大,使用map方法一次将所有文件内容映射到内存可能引起性能下降,也可使用15_33中的方式
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
