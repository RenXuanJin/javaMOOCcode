import org.apache.commons.text.StringEscapeUtils;

/**
 * @author 金仁轩
 * @create 2022-10-20 17:17
 */
public class EscapeString {
    public static void main(String[] args) {
        String str = "He didn't say, \"Stop\"";

//       连着里面/一起转义了
        String escapeJava = StringEscapeUtils.escapeJava(str);
        System.out.println("escape"+":"+escapeJava);

//      不转义
        String unescapeJava = StringEscapeUtils.unescapeJava(str);
        System.out.println("unescape"+":"+unescapeJava);
    }
}
