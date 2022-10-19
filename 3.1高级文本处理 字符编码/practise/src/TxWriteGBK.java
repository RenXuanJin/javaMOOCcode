import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author 金仁轩
 * @create 2022-10-19 14:15
 */
public class TxWriteGBK {
   public static void main(String[] args) {
      writeFile1();
      System.out.println("=================");
      writeFile2();
   }

   private static void writeFile1() {
      FileOutputStream fos = null;
      OutputStreamWriter osw = null;
      BufferedWriter bw = null;
      String charset = "GBK";

      try {
         fos = new FileOutputStream("c:/temp/abc.txt");
         osw = new OutputStreamWriter(fos,charset);
         bw = new BufferedWriter(osw);
         bw.write("我们是");
         bw.newLine();
         bw.write("Ecnuers.^^");
         bw.newLine();
      }catch (Exception exception){
         exception.printStackTrace();
      }finally {
         try{
            bw.close();
         }catch (Exception e){
            e.printStackTrace();
         }
      }
   }

   private static void writeFile2() {
      try(BufferedWriter bwf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/def.txt"),"GBK"))) {
         bwf.write("中国人真难");
         bwf.newLine();
         bwf.write("生活好难");
         bwf.newLine();
      }catch (Exception e){
         e.printStackTrace();
      }
   }

}
