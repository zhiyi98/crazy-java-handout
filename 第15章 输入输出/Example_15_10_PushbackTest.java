import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Example_15_10_PushbackTest {

  public static void main(String[] args) {

    /**
     * 回推输入流
     */
    try {
      PushbackReader pr = new PushbackReader(new FileReader("PushbackTest.java"), 64);
      char[] buf = new char[32];
      String lastContent = "";
      int hasRead = 0;
      while ((hasRead = pr.read(buf)) > 0) {
        String content = new String(buf, 0, hasRead);
        int targetIndex = 0;
        // 如果包含"new PushbackReader"则回推输入流，重复读取刚刚读取的内容
        if((targetIndex = (lastContent + content).indexOf("new PushbackReader"))>0){
          pr.unread((lastContent+ content).toCharArray());
          pr.read(buf,0,targetIndex);
          System.out.println(new String(buf,0,targetIndex));
          System.exit(0);
        }else{
//          System.out.println(lastContent);
          lastContent = content;
        }
      }
    } catch (IOException e) {
      System.out.println("123");
    }


  }

}
