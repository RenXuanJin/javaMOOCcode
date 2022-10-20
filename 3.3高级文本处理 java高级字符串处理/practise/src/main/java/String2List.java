import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-20 16:22
 */
public class String2List {
    public static void main(String[] args) {
        List<String> names = new LinkedList<String>();
        names.add("Xiaohong");
        names.add("Xiaoming");
        names.add("Daming");
        names.add("Xiaohei");

        String str1 = String.join(",", names);
        System.out.println(str1);

        String str2 = StringUtils.join(names, ",");
        System.out.println(str2);

        List<String> strings = Arrays.asList(str1.split(","));
        System.out.println(strings.toString());
        for (String string : strings) {
            System.out.println(string);
        }


    }
}
