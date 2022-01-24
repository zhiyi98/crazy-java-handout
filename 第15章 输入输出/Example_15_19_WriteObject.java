import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example_15_19_WriteObject {

  public static void main(String[] args) {

    // 将Person对象写入磁盘文件
    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
      oos.writeObject(new Example_15_18_Person("大哥", 40));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
