/*    */ package com.pinplaycooperation.internal.javalibrary.reflect;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Method
/*    */ {
/*    */   public static <T> T invokePublicMethod(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass, HashMap<Class<?>, Object> _parameter)
/*    */   {
/* 17 */     return (T)invokeMethod(_name, _instance, _instanceClass, _returnClass, false, _parameter);
/*    */   }
/*    */   
/* 20 */   public static <T> T invokePrivateMethod(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass, HashMap<Class<?>, Object> _parameter) { return (T)invokeMethod(_name, _instance, _instanceClass, _returnClass, true, _parameter); }
/*    */   
/*    */   public static <T> T invokePublicStaticMethod(String _name, Class<?> _instanceClass, Class<T> _returnClass, HashMap<Class<?>, Object> _parameter) {
/* 23 */     return (T)invokeMethod(_name, null, _instanceClass, _returnClass, false, _parameter);
/*    */   }
/*    */   
/* 26 */   public static <T> T invokePrivateStaticMethod(String _name, Class<?> _instanceClass, Class<T> _returnClass, HashMap<Class<?>, Object> _parameter) { return (T)invokeMethod(_name, null, _instanceClass, _returnClass, true, _parameter); }
/*    */   
/*    */ 
/*    */   private static <T> T invokeMethod(String _name, Object _instance, Class<?> _instanceClass, Class<T> _returnClass, boolean _private, HashMap<Class<?>, Object> _parameter)
/*    */   {
/* 31 */     Class<?>[] parameterClass = null;
/* 32 */     Object[] parameterObject = null;
/* 33 */     if (_parameter != null) {
/* 34 */       Iterator<Map.Entry<Class<?>, Object>> iterator = _parameter.entrySet().iterator();
/* 35 */       parameterClass = new Class[_parameter.size()];
/* 36 */       parameterObject = new Object[_parameter.size()];
/* 37 */       int i = 0;
/* 38 */       while (iterator.hasNext()) {
/* 39 */         Map.Entry<Class<?>, Object> entry = (Map.Entry)iterator.next();
/* 40 */         parameterClass[i] = ((Class)entry.getKey());
/* 41 */         parameterObject[i] = entry.getValue();
/* 42 */         i++;
/*    */       }
/*    */     }
/* 45 */     T value = null;
/*    */     try {
/* 47 */       java.lang.reflect.Method method = _instanceClass.getDeclaredMethod(_name, parameterClass);
/* 48 */       if (_private) method.setAccessible(true);
/* 49 */       Object obj = method.invoke(_instance, parameterObject);
/* 50 */       value = (T)obj;
/*    */     } catch (Exception localException) {}
/* 52 */     return value;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/reflect/Method.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */