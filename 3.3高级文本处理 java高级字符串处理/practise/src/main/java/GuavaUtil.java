import com.google.common.base.CaseFormat;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-20 17:33
 */
public class GuavaUtil {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(456);
        System.out.println(arrayList);

        ArrayList<Integer> list = Lists.newArrayList(123, 456);
        System.out.println(list);

        Iterable<String> split = Splitter.on(",").trimResults().omitEmptyStrings().split("123,321,,   abc");

        for (String s : split) {
            System.out.println(s);
        }

        String s1 = "CONSTANT_NAME";
        String s2 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL,s1);
        System.out.println(s2);

        String a = "123,321,,   abc";
        String[] as = a.split(",");

        for (int i = 0; i < as.length; i++) {
            if (null == as[i] || as[i].length()<=0){
                continue;
            }
            else {
                System.out.println(as[i].trim());
            }
        }

    }
}
