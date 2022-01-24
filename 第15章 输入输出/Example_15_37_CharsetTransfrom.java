import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;

public class Example_15_37_CharsetTransfrom {

  public static void main(String[] args) throws Exception {

    Charset cn = Charset.forName("GBK");
    CharsetEncoder cnEncoder = cn.newEncoder();// 编码器
    CharsetDecoder cnDecoder = cn.newDecoder();// 解码器

    CharBuffer cbuff = CharBuffer.allocate(8);
    cbuff.put("孙");
    cbuff.put("悟");
    cbuff.put("空");
    cbuff.flip();//翻转此缓冲区
    //-------------------------------编码-------------------------------
    ByteBuffer bbuff = cnEncoder.encode(cbuff);
    for (int i = 0; i < bbuff.capacity(); i++) {
      System.out.print(bbuff.get(i) + " ");
    }
//    System.out.println(Arrays.toString(bbuff.array()));

    //-------------------------------解码-------------------------------
    System.out.println("\n" + cnDecoder.decode(bbuff));


  }

}
