/*    */ package com.pinplaycooperation.internal.javalibrary.crypt.rsa;
/*    */ 
/*    */ import java.security.KeyPairGenerator;
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RSA
/*    */ {
/*    */   public static final String ALGORITHM = "RSA";
/*    */   
/* 12 */   public static KeyPair generateKey() { return generateKey(2048); }
/*    */   
/*    */   public static KeyPair generateKey(int keysize) {
/*    */     try {
/* 16 */       KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
/* 17 */       keyGen.initialize(keysize);
/* 18 */       return new KeyPair(keyGen.genKeyPair());
/*    */     }
/*    */     catch (Exception localException) {}
/* 21 */     return null;
/*    */   }
/*    */   
/*    */   public static byte[] encrypt(byte[] _data, PublicKey _pubKey) throws Exception {
/* 25 */     Cipher cipher = Cipher.getInstance("RSA");
/* 26 */     cipher.init(1, new java.security.PublicKey() { private static final long serialVersionUID = 1L;
/*    */       
/* 28 */       public String getAlgorithm() { return this.val$_pubKey.algorithm; }
/* 29 */       public byte[] getEncoded() { return this.val$_pubKey.encoded; }
/* 30 */       public String getFormat() { return this.val$_pubKey.format; }
/* 31 */     });
/* 32 */     byte[] cipherText = cipher.doFinal(_data);
/* 33 */     return cipherText;
/*    */   }
/*    */   
/*    */   public static byte[] decrypt(byte[] _text, PrivateKey _priKey) throws Exception {
/* 37 */     Cipher cipher = Cipher.getInstance("RSA");
/* 38 */     cipher.init(2, new java.security.PrivateKey() { private static final long serialVersionUID = 1L;
/*    */       
/* 40 */       public String getAlgorithm() { return this.val$_priKey.algorithm; }
/* 41 */       public byte[] getEncoded() { return this.val$_priKey.encoded; }
/* 42 */       public String getFormat() { return this.val$_priKey.format; }
/* 43 */     });
/* 44 */     byte[] decryptedText = cipher.doFinal(_text);
/* 45 */     return decryptedText;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/rsa/RSA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */