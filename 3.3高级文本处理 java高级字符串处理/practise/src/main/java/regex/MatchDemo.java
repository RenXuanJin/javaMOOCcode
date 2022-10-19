package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-19 16:11
 */
public class MatchDemo {

   static String REGEX = null;
   static Scanner scanner = null;
   static String INPUT = null;

   public static void main(String[] args) {
      scanner = new Scanner(System.in);
      REGEX = scanner.next();
      INPUT = scanner.next();

      Pattern pattern = Pattern.compile(REGEX);
      Matcher matcher = pattern.matcher(INPUT);

      int count = 0;
      while (matcher.find()){
         count++;
         System.out.println("Match number "+count);
         System.out.println("start(): "+ matcher.start());
         System.out.println("end(): "+matcher.end());
      }
   }
}
