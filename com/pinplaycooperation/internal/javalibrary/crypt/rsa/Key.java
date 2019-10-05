/*    */ package com.pinplaycooperation.internal.javalibrary.crypt.rsa;
/*    */ 
/*    */ public abstract class Key
/*    */ {
/*    */   String algorithm;
/*    */   String format;
/*    */   byte[] encoded;
/*    */   
/*    */   public Key(String algorithm, String format, byte[] encoded) {
/* 10 */     this.algorithm = algorithm;
/* 11 */     this.format = format;
/* 12 */     this.encoded = encoded;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/rsa/Key.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */