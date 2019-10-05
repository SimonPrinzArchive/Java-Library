/*   */ package com.pinplaycooperation.internal.javalibrary.crypt.aes;
/*   */ 
/*   */ import javax.crypto.spec.SecretKeySpec;
/*   */ 
/*   */ public class Key extends SecretKeySpec
/*   */ {
/*   */   public Key(byte[] key) {
/* 8 */     super(key, "AES");
/*   */   }
/*   */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/aes/Key.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */