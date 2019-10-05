/*    */ package com.pinplaycooperation.internal.javalibrary.util;
/*    */ 
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class Version
/*    */ {
/*    */   private LinkedList<Integer> numbers;
/*    */   
/*    */   public Version(int... nums) {
/* 10 */     this.numbers = new LinkedList();
/* 11 */     for (int i : nums)
/* 12 */       this.numbers.add(Integer.valueOf(i));
/*    */   }
/*    */   
/* 15 */   public Version(LinkedList<Integer> numbers) { this.numbers = numbers; }
/*    */   
/*    */   public int getIndex(int i)
/*    */   {
/*    */     try {
/* 20 */       this.numbers.get(i);
/*    */     } catch (Exception e) {
/* 22 */       return -1;
/*    */     }
/* 24 */     return ((Integer)this.numbers.get(i)).intValue();
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 29 */     StringBuffer sb = new StringBuffer();
/* 30 */     for (java.util.Iterator localIterator = this.numbers.iterator(); localIterator.hasNext();) { int i = ((Integer)localIterator.next()).intValue();
/* 31 */       sb.append(String.valueOf(i)).append("."); }
/* 32 */     sb.setLength(sb.length() - 1);
/* 33 */     return sb.toString();
/*    */   }
/*    */   
/*    */   public static Version parse(String version) throws NotAVersionException {
/* 37 */     String[] split = version.split("\\.");
/* 38 */     LinkedList<Integer> list = new LinkedList();
/* 39 */     for (String s : split)
/*    */       try {
/* 41 */         int i = Integer.parseInt(s);
/* 42 */         list.add(Integer.valueOf(i));
/*    */       } catch (Exception e) {
/* 44 */         throw new NotAVersionException();
/*    */       }
/* 46 */     return new Version(list);
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/util/Version.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */