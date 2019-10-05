/*    */ package com.pinplaycooperation.internal.javalibrary.json;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
/*    */ import java.util.LinkedList;
/*    */ import java.util.Map;
/*    */ import org.json.JSONObject;
/*    */ 
/*    */ 
/*    */ public class JSON
/*    */ {
/* 13 */   private static LinkedList<Class<?>> NATIVES = new LinkedList(Arrays.asList(new Class[] { Boolean.TYPE, Collection.class, Double.TYPE, Float.TYPE, Integer.TYPE, Long.TYPE, Map.class, String.class }));
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 23 */   private static HashMap<Class<? extends Serializable<?>>, Serializable<?>> ADAPTERS = new HashMap();
/*    */   
/*    */   public static void registerAdapter(Class<? extends Serializable<?>> cls, Serializable<?> adapter) {
/* 26 */     if (ADAPTERS.containsKey(cls))
/* 27 */       return;
/* 28 */     ADAPTERS.put(cls, adapter);
/*    */   }
/*    */   
/*    */   public static <T> JSONObject set(JSONObject json, String name, T obj) {
/* 32 */     if (NATIVES.contains(obj.getClass()))
/*    */       try {
/* 34 */         return json.put(name, obj);
/*    */       } catch (Exception localException) {}
/* 36 */     if (ADAPTERS.containsKey(obj.getClass()))
/*    */       try {
/* 38 */         return json.put(name, ((Serializable)ADAPTERS.get(obj.getClass())).write(new JSONObject(), obj));
/*    */       } catch (Exception localException1) {}
/* 40 */     return json;
/*    */   }
/*    */   
/*    */ 
/* 44 */   public static <T> T get(JSONObject json, String name, Class<T> cls) { return (T)get(json, name, cls, null); }
/*    */   
/*    */   public static <T> T get(JSONObject json, String name, Class<T> cls, T def) {
/* 47 */     T obj = null;
/*    */     try {
/* 49 */       if (NATIVES.contains(cls))
/* 50 */         obj = cls.cast(json.get(name));
/* 51 */       if (ADAPTERS.containsKey(cls))
/* 52 */         obj = cls.cast(((Serializable)ADAPTERS.get(cls)).read(json.getJSONObject(name)));
/*    */     } catch (Exception e) {
/* 54 */       obj = def;
/*    */     }
/* 56 */     return obj;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/json/JSON.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */