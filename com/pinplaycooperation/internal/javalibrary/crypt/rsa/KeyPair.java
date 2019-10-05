/*    */ package com.pinplaycooperation.internal.javalibrary.crypt.rsa;
/*    */ 
/*    */ 
/*    */ public final class KeyPair
/*    */ {
/*    */   PrivateKey pri;
/*    */   PublicKey pub;
/*    */   
/*  9 */   public KeyPair(java.security.KeyPair keypair) { this(new PrivateKey(keypair.getPrivate().getAlgorithm(), keypair.getPrivate().getFormat(), keypair.getPrivate().getEncoded()), new PublicKey(keypair.getPublic().getAlgorithm(), keypair.getPublic().getFormat(), keypair.getPublic().getEncoded())); }
/*    */   
/*    */   public KeyPair(PrivateKey pri, PublicKey pub) {
/* 12 */     this.pri = pri;
/* 13 */     this.pub = pub;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/rsa/KeyPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */