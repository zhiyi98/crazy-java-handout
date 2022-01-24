import java.io.FileReader;
import java.io.IOException;

public class Example_15_04_FileReaderTest {

  public static void main(String[] args) throws IOException {


    FileReader file = null;
    try {
      file = new FileReader("FileReaderTest.java");
      char[] cbuf = new char[32];// 创建一个长度为32的”竹筒“
      int hasRead = 0;
      while ((hasRead = file.read(cbuf)) > 0)// 循环”取水“
        System.out.println(new String(cbuf, 0, hasRead));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (file != null) // 使用finally来关闭文件输入流
        file.close();
    }


  }

}
