/*    */ package com.pinplaycooperation.internal.javalibrary.reflect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Field
/*    */ {
/*    */   public static <T> T getPublicField(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass)
/*    */   {
/* 13 */     return (T)getField(_name, _instance, _instanceClass, _returnClass, false);
/*    */   }
/*    */   
/* 16 */   public static <T> T getPrivateField(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass) { return (T)getField(_name, _instance, _instanceClass, _returnClass, true); }
/*    */   
/*    */   public static <T> T getPublicStaticField(String _name, Class<?> _instanceClass, Class<T> _returnClass)
/*    */   {
/* 20 */     return (T)getField(_name, null, _instanceClass, _returnClass, false);
/*    */   }
/*    */   
/* 23 */   public static <T> T getPrivateStaticField(String _name, Class<?> _instanceClass, Class<T> _returnClass) { return (T)getField(_name, null, _instanceClass, _returnClass, true); }
/*    */   
/*    */ 
/*    */   private static <T> T getField(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass, boolean _private)
/*    */   {
/* 28 */     T value = null;
/*    */     try {
/* 30 */       java.lang.reflect.Field field = _instanceClass.getDeclaredField(_name);
/* 31 */       if (_private) field.setAccessible(true);
/* 32 */       Object obj = field.get(_instance);
/* 33 */       value = (T)obj;
/*    */     } catch (Exception localException) {}
/* 35 */     return value;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/reflect/Field.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */