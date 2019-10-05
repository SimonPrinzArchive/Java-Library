/*    */ package com.pinplaycooperation.internal.javalibrary.io;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public final class FileIO
/*    */ {
/*    */   /* Error */
/*    */   public static byte[] read(File file)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aconst_null
/*    */     //   1: astore_1
/*    */     //   2: new 2	java/io/ByteArrayOutputStream
/*    */     //   5: dup
/*    */     //   6: invokespecial 3	java/io/ByteArrayOutputStream:<init>	()V
/*    */     //   9: astore_2
/*    */     //   10: new 4	java/io/FileInputStream
/*    */     //   13: dup
/*    */     //   14: aload_0
/*    */     //   15: invokespecial 5	java/io/FileInputStream:<init>	(Ljava/io/File;)V
/*    */     //   18: astore_1
/*    */     //   19: aload_1
/*    */     //   20: sipush 1024
/*    */     //   23: newarray <illegal type>
/*    */     //   25: dup
/*    */     //   26: astore 4
/*    */     //   28: invokevirtual 6	java/io/FileInputStream:read	([B)I
/*    */     //   31: dup
/*    */     //   32: istore_3
/*    */     //   33: ifle +12 -> 45
/*    */     //   36: aload_2
/*    */     //   37: aload 4
/*    */     //   39: invokevirtual 7	java/io/ByteArrayOutputStream:write	([B)V
/*    */     //   42: goto -23 -> 19
/*    */     //   45: aload_2
/*    */     //   46: invokevirtual 8	java/io/ByteArrayOutputStream:flush	()V
/*    */     //   49: iconst_2
/*    */     //   50: anewarray 9	java/io/Closeable
/*    */     //   53: dup
/*    */     //   54: iconst_0
/*    */     //   55: aload_1
/*    */     //   56: aastore
/*    */     //   57: dup
/*    */     //   58: iconst_1
/*    */     //   59: aload_2
/*    */     //   60: aastore
/*    */     //   61: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   64: goto +45 -> 109
/*    */     //   67: astore_3
/*    */     //   68: aconst_null
/*    */     //   69: astore 4
/*    */     //   71: iconst_2
/*    */     //   72: anewarray 9	java/io/Closeable
/*    */     //   75: dup
/*    */     //   76: iconst_0
/*    */     //   77: aload_1
/*    */     //   78: aastore
/*    */     //   79: dup
/*    */     //   80: iconst_1
/*    */     //   81: aload_2
/*    */     //   82: aastore
/*    */     //   83: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   86: aload 4
/*    */     //   88: areturn
/*    */     //   89: astore 5
/*    */     //   91: iconst_2
/*    */     //   92: anewarray 9	java/io/Closeable
/*    */     //   95: dup
/*    */     //   96: iconst_0
/*    */     //   97: aload_1
/*    */     //   98: aastore
/*    */     //   99: dup
/*    */     //   100: iconst_1
/*    */     //   101: aload_2
/*    */     //   102: aastore
/*    */     //   103: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   106: aload 5
/*    */     //   108: athrow
/*    */     //   109: aload_2
/*    */     //   110: invokevirtual 12	java/io/ByteArrayOutputStream:toByteArray	()[B
/*    */     //   113: areturn
/*    */     // Line number table:
/*    */     //   Java source line #13	-> byte code offset #0
/*    */     //   Java source line #14	-> byte code offset #2
/*    */     //   Java source line #16	-> byte code offset #10
/*    */     //   Java source line #18	-> byte code offset #19
/*    */     //   Java source line #19	-> byte code offset #36
/*    */     //   Java source line #20	-> byte code offset #45
/*    */     //   Java source line #24	-> byte code offset #49
/*    */     //   Java source line #25	-> byte code offset #64
/*    */     //   Java source line #21	-> byte code offset #67
/*    */     //   Java source line #22	-> byte code offset #68
/*    */     //   Java source line #24	-> byte code offset #71
/*    */     //   Java source line #22	-> byte code offset #86
/*    */     //   Java source line #24	-> byte code offset #89
/*    */     //   Java source line #26	-> byte code offset #109
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	114	0	file	File
/*    */     //   1	97	1	fis	java.io.FileInputStream
/*    */     //   9	101	2	baos	java.io.ByteArrayOutputStream
/*    */     //   32	2	3	read	int
/*    */     //   67	2	3	e	Exception
/*    */     //   26	61	4	buffer	byte[]
/*    */     //   89	18	5	localObject	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   10	49	67	java/lang/Exception
/*    */     //   10	49	89	finally
/*    */     //   67	71	89	finally
/*    */     //   89	91	89	finally
/*    */   }
/*    */   
/*    */   /* Error */
/*    */   public static boolean write(File file, byte[] bytes)
/*    */   {
/*    */     // Byte code:
/*    */     //   0: aconst_null
/*    */     //   1: astore_2
/*    */     //   2: new 13	java/io/FileOutputStream
/*    */     //   5: dup
/*    */     //   6: aload_0
/*    */     //   7: invokespecial 14	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
/*    */     //   10: astore_2
/*    */     //   11: aload_2
/*    */     //   12: aload_1
/*    */     //   13: invokevirtual 15	java/io/FileOutputStream:write	([B)V
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual 16	java/io/FileOutputStream:flush	()V
/*    */     //   20: iconst_1
/*    */     //   21: anewarray 9	java/io/Closeable
/*    */     //   24: dup
/*    */     //   25: iconst_0
/*    */     //   26: aload_2
/*    */     //   27: aastore
/*    */     //   28: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   31: goto +37 -> 68
/*    */     //   34: astore_3
/*    */     //   35: iconst_0
/*    */     //   36: istore 4
/*    */     //   38: iconst_1
/*    */     //   39: anewarray 9	java/io/Closeable
/*    */     //   42: dup
/*    */     //   43: iconst_0
/*    */     //   44: aload_2
/*    */     //   45: aastore
/*    */     //   46: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   49: iload 4
/*    */     //   51: ireturn
/*    */     //   52: astore 5
/*    */     //   54: iconst_1
/*    */     //   55: anewarray 9	java/io/Closeable
/*    */     //   58: dup
/*    */     //   59: iconst_0
/*    */     //   60: aload_2
/*    */     //   61: aastore
/*    */     //   62: invokestatic 10	com/pinplaycooperation/internal/javalibrary/util/Silently:close	([Ljava/io/Closeable;)V
/*    */     //   65: aload 5
/*    */     //   67: athrow
/*    */     //   68: iconst_1
/*    */     //   69: ireturn
/*    */     // Line number table:
/*    */     //   Java source line #30	-> byte code offset #0
/*    */     //   Java source line #32	-> byte code offset #2
/*    */     //   Java source line #33	-> byte code offset #11
/*    */     //   Java source line #34	-> byte code offset #16
/*    */     //   Java source line #38	-> byte code offset #20
/*    */     //   Java source line #39	-> byte code offset #31
/*    */     //   Java source line #35	-> byte code offset #34
/*    */     //   Java source line #36	-> byte code offset #35
/*    */     //   Java source line #38	-> byte code offset #38
/*    */     //   Java source line #36	-> byte code offset #49
/*    */     //   Java source line #38	-> byte code offset #52
/*    */     //   Java source line #40	-> byte code offset #68
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	signature
/*    */     //   0	70	0	file	File
/*    */     //   0	70	1	bytes	byte[]
/*    */     //   1	60	2	fos	java.io.FileOutputStream
/*    */     //   34	2	3	e	Exception
/*    */     //   36	14	4	bool	boolean
/*    */     //   52	14	5	localObject	Object
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   2	20	34	java/lang/Exception
/*    */     //   2	20	52	finally
/*    */     //   34	38	52	finally
/*    */     //   52	54	52	finally
/*    */   }
/*    */   
/*    */   public static boolean copy(File fromFile, File toFile)
/*    */   {
/* 44 */     byte[] buffer = read(fromFile);
/* 45 */     return write(toFile, buffer);
/*    */   }
/*    */ }


/* Location:              /Users/sipri1000/Desktop/Java-Library-0.180208.02.jar!/com/pinplaycooperation/internal/javalibrary/io/FileIO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */