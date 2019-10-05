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
/*    */ public class Constructor
/*    */ {
/*    */   public static <T> T createPublicInstance(Class<T> _instanceClass, HashMap<Class<?>, Object> _parameter)
/*    */   {
/* 17 */     return (T)createInstance(_instanceClass, false, _parameter);
/*    */   }
/*    */   
/* 20 */   public static <T> T createPrivateInstance(Class<T> _instanceClass, HashMap<Class<?>, Object> _parameter) { return (T)createInstance(_instanceClass, true, _parameter); }
/*    */   
/*    */ 
/*    */   private static <T> T createInstance(Class<T> _instanceClass, boolean _private, HashMap<Class<?>, Object> _parameter)
/*    */   {
/* 25 */     Class<?>[] parameterClass = null;
/* 26 */     Object[] parameterObject = null;
/* 27 */     if (_parameter != null) {
/* 28 */       Iterator<Map.Entry<Class<?>, Object>> iterator = _parameter.entrySet().iterator();
/* 29 */       parameterClass = new Class[_parameter.size()];
/* 30 */       parameterObject = new Object[_parameter.size()];
/* 31 */       int i = 0;
/* 32 */       while (iterator.hasNext()) {
/* 33 */         Map.Entry<Class<?>, Object> entry = (Map.Entry)iterator.next();
/* 34 */         parameterClass[i] = ((Class)entry.getKey());
/* 35 */         parameterObject[i] = entry.getValue();
/* 36 */         i++;
/*    */       }
/*    */     }
/* 39 */     T value = null;
/*    */     try {
/* 41 */       java.lang.reflect.Constructor<T> constructor = _instanceClass.getDeclaredConstructor(parameterClass);
/* 42 */       if (_private) constructor.setAccessible(true);
/* 43 */       Object obj = constructor.newInstance(parameterObject);
/* 44 */       value = (T)obj;
/*    */     } catch (Exception localException) {}
/* 46 */     return value;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/reflect/Constructor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */