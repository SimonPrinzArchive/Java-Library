/*    */ package com.pinplaycooperation.internal.javalibrary.io;
/*    */ 
/*    */ import com.pinplaycooperation.internal.javalibrary.util.Silently;
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ public class Stream implements Closeable
/*    */ {
/*    */   private InputStream input;
/*    */   private OutputStream output;
/*    */   
/*    */   public Stream(InputStream is, OutputStream os)
/*    */   {
/* 16 */     this.input = is;
/* 17 */     this.output = os;
/*    */   }
/*    */   
/*    */   public int available() {
/* 21 */     int b = -1;
/*    */     try {
/* 23 */       b = this.input.available();
/*    */     } catch (Exception localException) {}
/* 25 */     return b;
/*    */   }
/*    */   
/* 28 */   public int read() { int b = -1;
/*    */     try {
/* 30 */       b = this.input.read();
/*    */     } catch (Exception e) {
/* 32 */       b = -2;
/*    */     }
/* 34 */     return b;
/*    */   }
/*    */   
/*    */ 
/* 38 */   public boolean write(String msg) { return write(msg.getBytes()); }
/*    */   
/*    */   public boolean write(byte[] bytes) {
/* 41 */     for (byte b : bytes)
/* 42 */       if (!write(b))
/* 43 */         return false;
/* 44 */     return true;
/*    */   }
/*    */   
/*    */   public boolean write(int b) {
/* 48 */     try { this.output.write(b);
/*    */     } catch (Exception e) {
/* 50 */       return false;
/*    */     }
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   public boolean flush() {
/* 56 */     try { this.output.flush();
/*    */     } catch (Exception e) {
/* 58 */       return false;
/*    */     }
/* 60 */     return true;
/*    */   }
/*    */   
/*    */   public void close() throws IOException
/*    */   {
/* 65 */     Silently.close(new Closeable[] { this.input, this.output });
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/io/Stream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */