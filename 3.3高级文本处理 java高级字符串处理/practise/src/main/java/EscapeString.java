import org.apache.commons.text.StringEscapeUtils;

/**
 * @author ������
 * @create 2022-10-20 17:17
 */
public class EscapeString {
    public static void main(String[] args) {
        String str = "He didn't say, \"Stop\"";

//       ��������/һ��ת����
        String escapeJava = StringEscapeUtils.escapeJava(str);
        System.out.println("escape"+":"+escapeJava);

//      ��ת��
        String unescapeJava = StringEscapeUtils.unescapeJava(str);
        System.out.println("unescape"+":"+unescapeJava);
    }
}
