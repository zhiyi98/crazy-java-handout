import java.io.*;

public class Example_15_17_InsertContent {

  public static void main(String[] args) {


    try {
      File tmp = File.createTempFile("tmp", null);
      RandomAccessFile raf = new RandomAccessFile("InsertConent.java", "rw");
      FileOutputStream fos = new FileOutputStream(tmp);
      FileInputStream fis = new FileInputStream(tmp);
      raf.seek(45);
      // -----------------下面的代码将插入点后的内容读入临时文件中保存-----------------
      byte[] bbuf = new byte[64];
      int hasRead = 0;
      while((hasRead = raf.read())>0){
        fos.write(bbuf,0,hasRead);
      }
      // ----------------------------下面代码插入内容----------------------------
      raf.seek(45);
      raf.write("插入的内容\r\n".getBytes());
      while((hasRead = fis.read(bbuf))>0){
        raf.write(bbuf,0,hasRead);
      }


    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
