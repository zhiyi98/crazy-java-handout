import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Example_15_14__WriteToProcess {

  public static void main(String[] args) {
    Process p = null;
    try {
      p = Runtime.getRuntime().exec("java ReadStandard");
      PrintStream ps = new PrintStream(p.getOutputStream());
      ps.println("普通字符串");
      ps.println(new Example_15_14__WriteToProcess());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


}


class ReadStandard {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(System.in);
    PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));
    scan.useDelimiter("\n");
    while (scan.hasNext()) {
      ps.println("键盘输入的内容是：" + scan.next());
    }
    scan.close();
  }
}
