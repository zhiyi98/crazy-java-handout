import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example_15_15_RandomAccessFileTest {
  public static void main(String[] args) {

    try {
      RandomAccessFile raf = new RandomAccessFile("RandomAccessFileTest.java","r");
      System.out.println("RandomAccessFile的文件指针的初始位置"+raf.getFilePointer());
      raf.seek(300);// 移动raf文件记录的指针位置；设置当前偏移量；
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
