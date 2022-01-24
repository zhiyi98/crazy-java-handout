import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Example_15_08_StringNodeTest {

  public static void main(String[] args) {

    String src = "……我为父亲的去世流了很多眼泪，现在我们的处境更为可怕了；我讲的不是自己，而是指我们全家……但愿上帝保佑，" +
        "你能在莫斯科，这样我对我们全家便放心些，但请你讲一讲，世界上还有比我们可怜的兄弟姐妹更不幸的人吗？一想起他们将由别人来管教，" +
        "我就伤心极了。因而你升为军官后到乡下居住的想法依我看是很好的。在乡下你能够对他们进行教育，亲爱的哥哥，这种教育对于他们来说就是幸福。" +
        "它能使他们在自己的家里获得心灵的和谐，培养他们一切符合基督教精神的志向、对家中各种美德的自豪、对恶行和耻辱的厌恶。" +
        "我们的双亲将安心长眠于地下，但是，亲爱的朋友，你一定会遇到许多麻烦……";
    StringReader sr = new StringReader(src);
    char[] buffer = new char[32];// ”竹筒“
    int hasRead = 0;
    try {
      while ((hasRead = sr.read(buffer)) > 0)
        System.out.println(new String(buffer, 0, hasRead));
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("-------------");
    StringWriter sw = new StringWriter(20);
    sw.write("关于自己，我对你又能说些什么呢……我很久没有和你推心置腹地谈谈了。\n");
    sw.write("我不知道我现在是否有情绪和你谈这个问题。");
    System.out.println(sw.toString());// 使用toString方法返回StringWriter的字符串节点的内容


  }

}
