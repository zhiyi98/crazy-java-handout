import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_15_13_ReadFromeProcess {

  public static void main(String[] args) {

    // Java 虚拟机读写其他进程的数据

    try {
      Process p = Runtime.getRuntime().exec("javac");
      BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream(),"GBK"));
      String buffer = null;
      while((buffer = br.readLine())!=null){
        System.out.println(buffer);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
