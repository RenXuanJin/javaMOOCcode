package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 金仁轩
 * @create 2022-10-20 15:21
 */
public class RegexTest {

   private static String REGEX = null;
   private static int number ;
//   private static String[] INPUT = null;
   private static String REPLACE = null;

   private static Pattern pattern = null;
   private static Matcher matcher = null;

   public static void main(String[] args) {
      regularExpression();
   }

   private static void regularExpression() {

      Scanner scanner = new Scanner(System.in);
      number = Integer.parseInt(scanner.nextLine());
      String[] INPUT = new String[number];
      for (int i = 0; i < INPUT.length; i++) {
            INPUT[i] = scanner.nextLine();
      }
      REGEX = scanner.nextLine();
      REPLACE = scanner.nextLine();

      pattern = Pattern.compile(REGEX);
      for (String s : INPUT) {
         matcher = pattern.matcher(s);
         if (matcher.matches()){
            System.out.println(s + "是邮箱格式");
         }else {
            System.out.println(s + "不是是邮箱格式");
         }
      }

   }
}
