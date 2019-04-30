
//StrongAES.java

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Rijndael {

   public void run() {
      try {
         String text = "Hello World";
         String key = "Bar12345Bar12345";
         // String key = "blablad93j2wp0s1";

         // Create key and cipher
         SecretKeySpec aesKey = new SecretKeySpec(key.getBytes(), "AES");
         // System.out.println("key: " + aesKey);
         Cipher cipher = Cipher.getInstance("AES");

         // encrypt the text
         cipher.init(Cipher.ENCRYPT_MODE, aesKey);
         byte[] encrypted = cipher.doFinal(text.getBytes());
         System.err.println(new String(encrypted));

         // decrypt the text
         cipher.init(Cipher.DECRYPT_MODE, aesKey);
         String decrypted = new String(cipher.doFinal(encrypted));
         System.err.println(decrypted);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      Rijndael app = new Rijndael();
      app.run();
   }
}
/*
 * OUTPUT: ???? 2??1j?????
 * 
 * Hello World
 */