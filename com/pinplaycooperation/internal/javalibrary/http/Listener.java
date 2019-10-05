/*   */ package com.pinplaycooperation.internal.javalibrary.http;
/*   */ 
/*   */ public abstract class Listener {
/*   */   public void onPre() {}
/*   */   
/*   */   public void onPost(Response response) {}
/*   */   
/* 8 */   public void onError(Exception exception) { exception.printStackTrace(); }
/*   */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/http/Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */