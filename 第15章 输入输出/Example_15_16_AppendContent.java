import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example_15_16_AppendContent {

  public static void main(String[] args) {

    // 与使用InputStream读取没有太大的区别
    try {
      RandomAccessFile raf = new RandomAccessFile("out.txt","rw");
      raf.seek(raf.length());// 移动记录指针到最后
      raf.write("追加的内容！\r\n".getBytes());
      raf.seek(0);// 移动记录指针到最前
      byte[] bbuf = new byte[1024];
      int hasRead = 0;
      while((hasRead = raf.read(bbuf))>0){
        System.out.println(new String(bbuf,0,hasRead));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
