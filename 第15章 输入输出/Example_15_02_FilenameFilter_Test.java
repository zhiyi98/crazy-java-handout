import java.io.File;
import java.io.FilenameFilter;

public class Example_15_02_FilenameFilter_Test {

  public static void main(String[] args) {

    /**
     * 文件过滤器
     */

    File file = new File(".");
    String[] nameList = file.list(new MyFilenameFilter());
    for (String name : nameList)
      System.out.println(name);

  }

  //实现此接口的类的实例用于过滤文件名。 这些实例用于过滤类File的list方法中的目录列表，
  static class MyFilenameFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
      return name.endsWith(".java") || new File(name).isDirectory();
    }
  }

}
