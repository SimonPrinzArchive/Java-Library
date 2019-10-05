/*    */ package com.pinplaycooperation.internal.javalibrary.os;
/*    */ 
/*    */ import com.pinplaycooperation.internal.javalibrary.util.Version;
/*    */ 
/*    */ public class Environment
/*    */ {
/*    */   public static Version getJavaVersion() {
/*  8 */     String jv = System.getProperty("java.version");
/*  9 */     if (jv.substring(0, 3).equalsIgnoreCase("1.9"))
/* 10 */       return new Version(new int[] { 1, 9 });
/* 11 */     if (jv.substring(0, 3).equalsIgnoreCase("1.8"))
/* 12 */       return new Version(new int[] { 1, 8 });
/* 13 */     if (Integer.parseInt(jv.substring(2, 3)) >= 7)
/* 14 */       return new Version(new int[] { 1, 7 });
/* 15 */     return new Version(new int[] { 1, 6 });
/*    */   }
/*    */   
/* 18 */   public static boolean isJava7OrAbove() { return getJavaVersion().getIndex(1) >= 7; }
/*    */   
/*    */   public static boolean isJava8() {
/* 21 */     return getJavaVersion().getIndex(1) == 8;
/*    */   }
/*    */   
/* 24 */   public static boolean isJava9() { return getJavaVersion().getIndex(1) == 9; }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/os/Environment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */