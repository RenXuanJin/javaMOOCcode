import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

/**
 * @author ������
 * @create 2022-10-17 11:20
 */
public class CharsetTest2 {
   public static void main(String[] args) {
      Charset charset = Charset.defaultCharset();
      System.out.println(charset.name());

      SortedMap<String, Charset> sm = Charset.availableCharsets();
      Set<String> keySet = sm.keySet();
      System.out.println("java ֧�ֵ������ַ�����");
      for (String s : keySet) {
         System.out.println(s);
      }
   }
}
