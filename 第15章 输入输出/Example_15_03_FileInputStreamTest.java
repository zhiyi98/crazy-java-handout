import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example_15_03_FileInputStreamTest {

  public static void main(String[] args) {

    // 用FileInputStream 获取输入字节，打印出来
    try {
      FileInputStream fis = new FileInputStream("FileInputStreamTest.java");// 输入
      byte[] bbuf = new byte[1024];
      int hasRead = 0;
      while((hasRead = fis.read(bbuf))> 0)
        System.out.println(new String(bbuf, 0 ,hasRead));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
