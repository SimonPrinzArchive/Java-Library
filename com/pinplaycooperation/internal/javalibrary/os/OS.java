/*    */ package com.pinplaycooperation.internal.javalibrary.os;
/*    */ 
/*    */ import com.pinplaycooperation.internal.javalibrary.ArrayList;
/*    */ import com.pinplaycooperation.internal.javalibrary.util.NotAVersionException;
/*    */ import com.pinplaycooperation.internal.javalibrary.util.Version;
/*    */ import java.util.List;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum OS
/*    */ {
/* 13 */   WINDOWS("Windows", new String[] { "win" }), 
/* 14 */   UNIX("Unix", new String[] { "nix", "nux", "aix" }), 
/* 15 */   MAC("Mac", new String[] { "mac" }), 
/* 16 */   SOLARIS("Solaris", new String[] { "sunos" }), 
/* 17 */   UNKNOWN("Unknown", new String[0]);
/*    */   
/*    */   private String name;
/*    */   private List<String> prefixes;
/*    */   
/*    */   private OS(String name, String... prefixes) {
/* 23 */     this.name = name;
/* 24 */     this.prefixes = ArrayList.toList(prefixes);
/*    */   }
/*    */   
/*    */   public String getName() {
/* 28 */     return this.name;
/*    */   }
/*    */   
/*    */   public Version getVersion() {
/* 32 */     Version version = null;
/*    */     try {
/* 34 */       version = Version.parse(System.getProperty("os.version"));
/*    */     } catch (NotAVersionException localNotAVersionException) {}
/* 36 */     return version;
/*    */   }
/*    */   
/*    */   public String getFileSeparator() {
/* 40 */     return System.getProperty("file.separator");
/*    */   }
/*    */   
/*    */   public String getLineSeparator() {
/* 44 */     return System.lineSeparator();
/*    */   }
/*    */   
/*    */   public boolean is64Bit() {
/* 48 */     return System.getProperty("sun.arch.data.model").contains("64");
/*    */   }
/*    */   
/*    */   public boolean isAdmin() {
/* 52 */     String node = "OSAdminTest";
/*    */     try {
/* 54 */       Preferences pref = Preferences.systemRoot();
/* 55 */       pref.put(node, "true");
/* 56 */       pref.flush();
/* 57 */       pref.remove(node);
/* 58 */       pref.flush();
/*    */     } catch (Exception e) {
/* 60 */       return false;
/*    */     }
/* 62 */     return true;
/*    */   }
/*    */   
/*    */ 
/* 66 */   public boolean equals(OS os) { return os == this; }
/*    */   
/*    */   public static OS getRuntime() {
/*    */     OS os;
/* 70 */     for (os : )
/* 71 */       for (String prefix : os.prefixes)
/* 72 */         if (System.getProperty("os.name").toLowerCase().contains(prefix))
/* 73 */           return os;
/* 74 */     return UNKNOWN;
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/os/OS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */