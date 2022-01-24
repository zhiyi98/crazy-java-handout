import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Example_15_35_ReadFile {

  public static void main(String[] args) {

    FileChannel fnic = null;
    try {
      FileInputStream fis = new FileInputStream("ReadFile.java");
      fnic = fis.getChannel();
      ByteBuffer bbuff = ByteBuffer.allocate(1024);//分配一个新的字节缓冲区。
      while (fnic.read(bbuff) > 1) {
        bbuff.flip();
        Charset charset = Charset.forName("gb2312");//返回指定字符集的字符集对象
        CharsetDecoder decoder = charset.newDecoder();//为此字符集构造一个新的解码器
        CharBuffer cbuff = decoder.decode(bbuff);// 将ByteBuffer的内容转码
        System.out.println(cbuff);
        bbuff.clear();// 数据取出后立即条用clear方法将Buffer的position设0,为下一次读取数据做准备
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fnic != null) {
          fnic.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }

}
