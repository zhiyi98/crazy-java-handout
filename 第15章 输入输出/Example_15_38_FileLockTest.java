import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class Example_15_38_FileLockTest {

  public static void main(String[] args) {

    /**
     * 文件锁
     */

    try {
      FileChannel channel = new FileOutputStream("a.txt").getChannel();
      FileLock lock = channel.tryLock();// 使用非阻塞式方式对指定文件加锁
      Thread.sleep(5000);// 5秒之后释放锁
      lock.release();// Releases this lock.
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }

    // 文件锁有什么用?
    // 如果多个运行的程序需要并发修改同时修改一个文件,程序之间就需要某种机制来进行通信
    // 使用文件锁可以有效地阻止多条进程并发修改同一份文件


  }

}
