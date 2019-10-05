/*    */ package com.pinplaycooperation.internal.javalibrary.io;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public final class NullInputStream extends InputStream
/*    */ {
/*    */   public int read() throws IOException
/*    */   {
/* 10 */     return -1;
/*    */   }
/*    */   
/*    */   public int available() throws IOException
/*    */   {
/* 15 */     return 0;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/io/NullInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */