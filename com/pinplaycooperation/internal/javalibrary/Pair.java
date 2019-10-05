/*    */ package com.pinplaycooperation.internal.javalibrary;
/*    */ 
/*    */ 
/*    */ public class Pair<K, V> {
/*    */   private K key;
/*    */   private V value;
/*    */   
/*  8 */   public Pair() { this(null, null); }
/*    */   
/* 10 */   public Pair(K key, V value) { this.key = key;
/* 11 */     this.value = value;
/*    */   }
/*    */   
/*    */   public Pair<K, V> setKey(K key) {
/* 15 */     this.key = key;
/* 16 */     return this;
/*    */   }
/*    */   
/* 19 */   public Pair<K, V> setValue(V value) { this.value = value;
/* 20 */     return this;
/*    */   }
/*    */   
/* 23 */   public K getKey() { return (K)this.key; }
/*    */   
/*    */   public V getValue() {
/* 26 */     return (V)this.value;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/Pair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */