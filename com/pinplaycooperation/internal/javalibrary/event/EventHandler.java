/*    */ package com.pinplaycooperation.internal.javalibrary.event;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.Collections;
/*    */ import java.util.Comparator;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ 
/*    */ public final class EventHandler
/*    */ {
/*    */   private LinkedList<Listener> listeners;
/*    */   
/*    */   public EventHandler()
/*    */   {
/* 15 */     this.listeners = new LinkedList();
/*    */   }
/*    */   
/*    */   public void registerListener(Listener listener) {
/* 19 */     if (!this.listeners.contains(listener)) {
/* 20 */       this.listeners.add(listener);
/* 21 */       sortByEventPriority();
/*    */     }
/*    */   }
/*    */   
/*    */   private Priority getEventPriority(Listener listener) throws Exception {
/* 26 */     Method onEvent = null;
/* 27 */     for (Method m : listener.getClass().getDeclaredMethods())
/* 28 */       if (m.getName().equals("onEvent"))
/* 29 */         onEvent = m;
/* 30 */     return ((EventPriority)onEvent.getAnnotation(EventPriority.class)).priortiy();
/*    */   }
/*    */   
/* 33 */   private Class getEventClass(Listener listener) throws Exception { Method onEvent = null;
/* 34 */     for (Method m : listener.getClass().getDeclaredMethods())
/* 35 */       if (m.getName().equals("onEvent"))
/* 36 */         onEvent = m;
/* 37 */     Class cls = onEvent.getParameterTypes()[0];
/* 38 */     return cls;
/*    */   }
/*    */   
/*    */   public void fireEvent(Event event) {
/* 42 */     for (Listener l : this.listeners) {
/*    */       try {
/* 44 */         if (getEventClass(l).equals(event.getClass())) {
/* 45 */           l.onEvent(event);
/*    */         }
/*    */       } catch (Exception localException) {}
/*    */     }
/*    */   }
/*    */   
/*    */   private void sortByEventPriority() {
/* 52 */     Collections.sort(this.listeners, new Comparator()
/*    */     {
/*    */       public int compare(Listener o1, Listener o2) {
/* 55 */         Priority p1 = Priority.NORMAL;
/*    */         try {
/* 57 */           p1 = EventHandler.this.getEventPriority(o1);
/*    */         } catch (Exception localException) {}
/* 59 */         Priority p2 = Priority.NORMAL;
/*    */         try {
/* 61 */           p2 = EventHandler.this.getEventPriority(o2);
/*    */         } catch (Exception localException1) {}
/* 63 */         return p1.compare(p2);
/*    */       }
/*    */     });
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/event/EventHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */