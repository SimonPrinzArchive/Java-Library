/*   */ package com.pinplaycooperation.internal.javalibrary;
/*   */ 
/*   */ public class Debug
/*   */ {
/*   */   public static void throwException() {
/* 6 */     throwException(null);
/*   */   }
/*   */   
/* 9 */   public static void throwException(Object obj) { throw new RuntimeException("This is supposed to be happen :)" + System.lineSeparator() + obj.toString()); }
/*   */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/Debug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */