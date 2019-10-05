/*    */ package com.pinplaycooperation.internal.javalibrary;
/*    */ 
/*    */ public class Timer
/*    */ {
/*    */   private long start;
/*    */   private long stop;
/*    */   
/*    */   public Timer() {
/*  9 */     this.start = (this.stop = 0L);
/*    */   }
/*    */   
/*    */   public void start() {
/* 13 */     this.start = System.currentTimeMillis();
/*    */   }
/*    */   
/* 16 */   public void stop() { this.stop = System.currentTimeMillis(); }
/*    */   
/*    */   public long getMillis()
/*    */   {
/* 20 */     long time = this.stop - this.start;
/* 21 */     return time;
/*    */   }
/*    */   
/*    */   public static void sleep(long millis) {
/* 25 */     long current = System.currentTimeMillis();
/* 26 */     while (current + millis >= System.currentTimeMillis()) {}
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/Timer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */