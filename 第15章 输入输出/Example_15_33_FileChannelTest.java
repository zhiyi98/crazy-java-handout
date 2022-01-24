import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Example_15_33_FileChannelTest {

  public static void main(String[] args) {

    /**
     * 使用Channel
     */
    File f = new File("FileChannelTest.java");
    try {
      FileChannel inChannel = new FileInputStream(f).getChannel();
      FileChannel outChannel = new FileOutputStream("a.txt").getChannel();
      //一个直接字节缓冲区，其内容是文件的内存映射区域
      MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,f.length());
      outChannel.write(buffer);
      buffer.clear();
      Charset charset = Charset.forName("GBK");
      CharsetDecoder decoder = charset.newDecoder();
      CharBuffer charBuffer = decoder.decode(buffer);
      System.out.println(charBuffer);
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
