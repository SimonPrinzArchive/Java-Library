/*    */ package com.pinplaycooperation.internal.javalibrary.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ 
/*    */ public class Silently
/*    */ {
/*    */   public static void run(Runnable runnable) {
/*    */     try {
/*  9 */       runnable.run();
/*    */     } catch (Exception localException) {}
/*    */   }
/*    */   
/*    */   public static void close(Closeable... closeables) {
/* 14 */     for (Closeable cls : closeables) {
/*    */       try {
/* 16 */         cls.close();
/*    */       }
/*    */       catch (Exception localException) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/util/Silently.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */