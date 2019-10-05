/*    */ package com.pinplaycooperation.internal.javalibrary;
/*    */ 
/*    */ public class Random
/*    */ {
/*    */   public static int random(int min, int max) {
/*  6 */     return new java.util.Random().nextInt(max + 1 - min) + min;
/*    */   }
/*    */   
/*    */   public static <E> E random(E... array) {
/* 10 */     return array[random(0, array.length - 1)];
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/Random.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */