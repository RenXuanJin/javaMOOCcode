import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-19 14:27
 */
public class TxReadGBK {
   public static void main(String[] args) {
      readFile1();
      System.out.println("=====================");
   }

   private static void readFile1() {
      Scanner scanner = new Scanner(System.in);
      String charset = scanner.next();
      String path = scanner.next();
      try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),charset))) {
         String line;
         while ((line = br.readLine())!= null){
            System.out.println(line);
         }
      }catch (Exception e){
         e.printStackTrace();
      }

   }
}
