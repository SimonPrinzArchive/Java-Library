/*    */ package com.pinplaycooperation.internal.javalibrary.event;
/*    */ 
/*    */ public enum Priority
/*    */ {
/*  5 */   LOW(0), 
/*  6 */   NORMAL(1), 
/*  7 */   HIGH(2);
/*    */   
/*    */   private int i;
/*    */   
/*    */   private Priority(int i) {
/* 12 */     this.i = i;
/*    */   }
/*    */   
/*    */ 
/* 16 */   public int getPriority() { return this.i; }
/*    */   
/*    */   public int compare(Priority priority) {
/* 19 */     int j = this.i - priority.i;
/* 20 */     if (j < -1) return -1;
/* 21 */     if (j > 1) return 1;
/* 22 */     return 0;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/event/Priority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */