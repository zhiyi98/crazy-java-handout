import java.io.File;
import java.io.IOException;

public class Example_15_01_FileTest {
  public static void main(String[] args) throws IOException {

    File file = new File(".");
    System.out.println(file.getName());
    System.out.println(file.getParent());// 获取父路径可能出错
    System.out.println(file.getAbsoluteFile());
    System.out.println(file.getAbsoluteFile().getParent());
    File temp = File.createTempFile("aaa", "txt", file);// 创建一个临时文件
    temp.deleteOnExit();// JVM退出时删除临时文件

    System.out.println("-----------");
    File newFile = new File(String.valueOf(System.currentTimeMillis()));
    System.out.println("newFile存在吗：" + newFile.exists());
    newFile.createNewFile();
    newFile.mkdir();

    System.out.println("-----------");
    String[] fileList = file.list();
    for (String fileName :fileList) {
      System.out.println(fileName);
    }
    System.out.println("-----------");
    File[] roots = File.listRoots();// 系统根
    for (File root:roots) {
      System.out.println(root);
    }

  }

}
