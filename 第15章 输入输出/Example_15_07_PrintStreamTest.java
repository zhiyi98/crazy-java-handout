import java.io.*;

public class Example_15_07_PrintStreamTest {

  public static void main(String[] args) {


    try {
        PrintStream ps = new PrintStream(new FileOutputStream("test.txt"));
        ps.println("普通字符串");
        ps.println(new Example_15_07_PrintStreamTest());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}
