import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 金仁轩
 * @create 2022-10-20 17:13
 */
public class String2InputStream {
   public static void main(String[] args) {
      //构造字符串列表
      List<String> names = new LinkedList<String>();
      names.add("Xiaohong");
      names.add("Xiaoming");
      names.add("Daming");
      names.add("Xiaohei");

      String nameStr = String.join(",", names);

      InputStream inputStream = IOUtils.toInputStream(nameStr, Charsets.toCharset("UTF-8"));

      Scanner scanner = new Scanner(inputStream);
      scanner.useDelimiter(",");
      while (scanner.hasNext()){
         System.out.println(scanner.next());
      }


   }
}
