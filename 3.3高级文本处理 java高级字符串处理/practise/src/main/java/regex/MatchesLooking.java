package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-19 16:56
 */
public class MatchesLooking {

    private static String REGEX = null;
    private static String INPUT = null;

    private static Pattern pattern = null;
    private static Matcher matcher = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        REGEX = scanner.next();
        INPUT = scanner.next();

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);

        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): "+matcher.matches());

    }
}
