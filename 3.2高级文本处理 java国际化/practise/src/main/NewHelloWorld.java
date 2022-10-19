import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author ½ðÈÊÐù
 * @create 2022-10-19 14:55
 */
public class NewHelloWorld {
   public static void main(String[] args) {
      Locale myLocale = Locale.getDefault();
      System.out.println(myLocale);
      ResourceBundle bundle = ResourceBundle.getBundle("msg", myLocale);
      System.out.println(bundle.getString("angry"));
      myLocale = new Locale("en","US");
      bundle = ResourceBundle.getBundle("msg",myLocale);
      System.out.println(bundle.getString("time"));
   }
}
