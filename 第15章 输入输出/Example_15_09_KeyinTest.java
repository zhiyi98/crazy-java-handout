import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_15_09_KeyinTest {

  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String buffer = null;
      while ((buffer = br.readLine()) != null) {
        if (buffer.equals("exit"))
          System.exit(1);
        System.out.println("输入的内容是：" + buffer);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
