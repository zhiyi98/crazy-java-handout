import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_15_12_RedirectIn {

  public static void main(String[] args) {

    // 使用RedirectIn.txt文件作为标准输入源
    try {
      FileInputStream fis = new FileInputStream("Redirection.java");
      System.setIn(fis);
      Scanner scan = new Scanner(System.in);
      scan.useDelimiter("\n");//使用分隔符
      while(scan.hasNext()){
        System.out.println("键盘输入的是："+scan.next());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }

}
