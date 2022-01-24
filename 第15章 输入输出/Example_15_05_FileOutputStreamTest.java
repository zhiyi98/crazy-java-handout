import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example_15_05_FileOutputStreamTest {


  public static void main(String[] args) {

    // 用FileInputStream将文件读取并写入到另一个文件中
    try {
      FileInputStream fis = new FileInputStream("FileOutputStreamTest.java");
      FileOutputStream fos = new FileOutputStream("newFile.txt");
      byte[] bbuf = new byte[32];
      int hasRead = 0;
      while((hasRead = fis.read(bbuf))>0){
        fos.write(bbuf,0,hasRead);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
