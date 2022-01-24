import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Example_15_11_RedirectOut {

  public static void main(String[] args) {

    // 重定向先目标输出流，将System.out的输出重定向先文件输出
    // 个人思考：通过这个可以很方便的用来打日志
    try {
      PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
      System.setOut(ps);
      System.out.println("普通字符串");
      System.out.println(new Example_15_11_RedirectOut());

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }

}
