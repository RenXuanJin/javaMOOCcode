package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-19 17:08
 */
public class RegexDemo {

   private static String REGEX = null;
   private static String INPUT = null;

   private static Pattern pattern = null;
   private static Matcher matcher = null;

   private static String REPLACE = null;

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      REGEX = scanner.next();
      INPUT = scanner.next();
      REPLACE = scanner.next();
      pattern = Pattern.compile(REGEX);
      matcher = pattern.matcher(INPUT);

      StringBuffer sb = new StringBuffer();
      while (matcher.find()){
         matcher.appendReplacement(sb,REPLACE);
      }
      System.out.println(sb.toString());
      matcher.appendTail(sb);
      System.out.println(sb.toString());
   }
}
