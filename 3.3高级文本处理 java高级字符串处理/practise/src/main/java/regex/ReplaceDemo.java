package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 金仁轩
 * @create 2022-10-19 17:27
 */
public class ReplaceDemo {

    private static String REGEX = null;
    private static String INPUT = "The dog says meow. All dogs say meow.";
    private static String REPLACE = null;

    private static Pattern pattern = null;
    private static Matcher matcher = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        REGEX = scanner.nextLine();
        INPUT = scanner.nextLine();
        REPLACE = scanner.nextLine();

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        String s = matcher.replaceAll(REPLACE);

        System.out.println("原来的:"+INPUT);
        System.out.println("现在的:"+s);

    }
}
