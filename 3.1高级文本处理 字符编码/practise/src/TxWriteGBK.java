import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * @author ������
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
         bw.write("������");
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
         bwf.write("�й�������");
         bwf.newLine();
         bwf.write("�������");
         bwf.newLine();
      }catch (Exception e){
         e.printStackTrace();
      }
   }

}
