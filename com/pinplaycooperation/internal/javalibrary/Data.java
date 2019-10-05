/*    */ package com.pinplaycooperation.internal.javalibrary;
/*    */ 
/*    */ 
/*    */ public class Data<T> {
/*    */   private T data;
/*    */   
/*  7 */   public Data() { this(null); }
/*    */   
/*  9 */   public Data(T data) { this.data = data; }
/*    */   
/*    */   public Data<T> set(T data)
/*    */   {
/* 13 */     this.data = data;
/* 14 */     return this;
/*    */   }
/*    */   
/* 17 */   public T get() { return (T)this.data; }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/Data.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */