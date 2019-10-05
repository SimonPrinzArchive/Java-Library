/*    */ package com.pinplaycooperation.internal.javalibrary.crypt.aes;
/*    */ 
/*    */ import com.pinplaycooperation.internal.javalibrary.crypt.MD5;
/*    */ import java.util.Arrays;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class AES
/*    */ {
/*    */   public static final String ALGORITHM = "AES";
/*    */   
/*    */   public static Key generateKey(String passphrase)
/*    */   {
/* 14 */     byte[] key = MD5.fromBytes(passphrase.getBytes()).getBytes();
/* 15 */     key = Arrays.copyOf(key, 16);
/* 16 */     return new Key(key);
/*    */   }
/*    */   
/*    */ 
/* 20 */   public static byte[] encrypt(Key key, byte bytes) throws Exception { return encrypt(key, new byte[] { bytes }); }
/*    */   
/*    */   public static byte[] encrypt(Key key, byte[] bytes) throws Exception {
/* 23 */     if (key == null)
/* 24 */       return bytes;
/* 25 */     Cipher cipher = Cipher.getInstance("AES");
/* 26 */     cipher.init(1, key);
/* 27 */     return cipher.doFinal(bytes);
/*    */   }
/*    */   
/*    */   public static byte[] decrypt(Key key, byte[] bytes) throws Exception {
/* 31 */     if (key == null)
/* 32 */       return bytes;
/* 33 */     Cipher cipher = Cipher.getInstance("AES");
/* 34 */     cipher.init(2, key);
/* 35 */     return cipher.doFinal(bytes);
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/aes/AES.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */