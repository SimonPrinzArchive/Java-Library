/*    */ package com.pinplaycooperation.internal.javalibrary;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract interface ArrayList
/*    */ {
/*    */   public static <T> T[] toArray(List<T> list)
/*    */   {
/*  9 */     return (Object[])list.toArray();
/*    */   }
/*    */   
/*    */   public static <T> List<T> toList(T[] array) {
/* 13 */     List<T> list = new java.util.LinkedList();
/* 14 */     for (T t : array)
/* 15 */       list.add(t);
/* 16 */     return list;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/ArrayList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */