import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example_15_20_ReadObject {

  public static void main(String[] args) {

    // 将刚刚生成的Object.txt文件中读取Person对象的步骤
    try {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
      Example_15_18_Person p = (Example_15_18_Person) ois.readObject();
      System.out.println(p.getName()+","+p.getAge());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
