import java.nio.charset.Charset;
import java.util.SortedMap;

public class Example_15_36_CharsetTest {
  public static void main(String[] args) {

    /**
     * 编码集和Charset
     */

    //可以使用如下清单来获取JDK所有支持的全部字符集
    SortedMap<String, Charset> map = Charset.availableCharsets();
    for (String alias : map.keySet()) {
      System.out.println(alias + "----->" + map.get(alias));
    }

  }


}
