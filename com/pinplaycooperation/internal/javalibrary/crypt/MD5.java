/*    */ package com.pinplaycooperation.internal.javalibrary.crypt;
/*    */ 
/*    */ import com.pinplaycooperation.internal.javalibrary.io.FileIO;
/*    */ import java.io.File;
/*    */ import java.security.MessageDigest;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ public class MD5
/*    */ {
/*    */   public static final String ALGORITHM = "MD5";
/*    */   public static final String PATTERN = "[a-f0-9]{32}";
/*    */   
/*    */   public static String fromBytes(byte[] bytes)
/*    */   {
/* 16 */     StringBuilder sb = new StringBuilder();
/*    */     try {
/* 18 */       MessageDigest md = MessageDigest.getInstance("MD5");
/* 19 */       byte[] mdBytes = md.digest(bytes);
/* 20 */       for (int i = 0; i < mdBytes.length; i++)
/* 21 */         sb.append(Integer.toString((mdBytes[i] & 0xFF) + 256, 16).substring(1));
/*    */     } catch (Exception localException) {}
/* 23 */     return sb.toString();
/*    */   }
/*    */   
/* 26 */   public static String fromFile(File file) { return fromBytes(FileIO.read(file)); }
/*    */   
/*    */   public static boolean isValid(String md5)
/*    */   {
/* 30 */     Pattern pat = Pattern.compile("^[a-f0-9]{32}$");
/* 31 */     Matcher mat = pat.matcher(md5);
/* 32 */     return mat.find();
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/crypt/MD5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */