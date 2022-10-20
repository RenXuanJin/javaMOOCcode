import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @author ½ğÈÊĞù
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


    }
}
