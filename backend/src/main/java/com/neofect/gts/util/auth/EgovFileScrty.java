package com.neofect.gts.util.auth;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Base64;

/**
 * 기존 Password Encrypt
 * @author 
 *
 */
public class EgovFileScrty {
  static final char FILE_SEPARATOR = File.separatorChar;
  
  static final int BUFFER_SIZE = 1024;
  
  public static boolean encryptFile(String source, String target) throws Exception {
    boolean result = false;
    String sourceFile = source.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
    String targetFile = target.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
    File srcFile = new File(sourceFile);
    BufferedInputStream input = null;
    BufferedOutputStream output = null;
    byte[] buffer = new byte[1024];
    try {
      if (srcFile.exists() && srcFile.isFile()) {
        input = new BufferedInputStream(new FileInputStream(srcFile));
        output = new BufferedOutputStream(new FileOutputStream(targetFile));
        int length = 0;
        while ((length = input.read(buffer)) >= 0) {
          byte[] data = new byte[length];
          System.arraycopy(buffer, 0, data, 0, length);
          output.write(encodeBinary(data).getBytes());
          output.write(System.getProperty("line.separator").getBytes());
        } 
        result = true;
      } 
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    } finally {
      if (input != null)
        try {
          input.close();
        } catch (Exception ignore) {
          System.out.println("IGNORE: " + ignore);
        }  
      if (output != null)
        try {
          output.close();
        } catch (Exception ignore) {
          System.out.println("IGNORE: " + ignore);
        }  
    } 
    return result;
  }
  
  public static boolean decryptFile(String source, String target) throws Exception {
    boolean result = false;
    String sourceFile = source.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
    String targetFile = target.replace('\\', FILE_SEPARATOR).replace('/', FILE_SEPARATOR);
    File srcFile = new File(sourceFile);
    BufferedReader input = null;
    BufferedOutputStream output = null;
    String line = null;
    try {
      if (srcFile.exists() && srcFile.isFile()) {
        input = new BufferedReader(new InputStreamReader(new FileInputStream(srcFile)));
        output = new BufferedOutputStream(new FileOutputStream(targetFile));
        while ((line = input.readLine()) != null) {
          byte[] data = line.getBytes();
          output.write(decodeBinary(new String(data)));
        } 
        result = true;
      } 
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    } finally {
      if (input != null)
        try {
          input.close();
        } catch (Exception ignore) {
          System.out.println("IGNORE: " + ignore);
        }  
      if (output != null)
        try {
          output.close();
        } catch (Exception ignore) {
          System.out.println("IGNORE: " + ignore);
        }  
    } 
    return result;
  }
  
  public static String encodeBinary(byte[] data) throws Exception {
    if (data == null)
      return ""; 
    return new String(Base64.encodeBase64(data));
  }
  
  @Deprecated
  public static String encode(String data) throws Exception {
    return encodeBinary(data.getBytes());
  }
  
  public static byte[] decodeBinary(String data) throws Exception {
    return Base64.decodeBase64(data.getBytes());
  }
  
  @Deprecated
  public static String decode(String data) throws Exception {
    return new String(decodeBinary(data));
  }
  
  public static String encryptPassword(String data)  {
    if (data == null)
      return ""; 
    byte[] plainText = null;
    byte[] hashValue = null;
    plainText = data.getBytes();
    String retStr = "";
    try {
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	hashValue = md.digest(plainText);
    	
    	retStr =  new String(Base64.encodeBase64(hashValue));
    	
    }catch(Exception ex) {
    	System.out.println("=============EgovFileScrty encryptPassword ERROR=============");
    }
    return retStr;
  }
  
  public static String encryptPassword(String data, byte[] salt) throws Exception {
    if (data == null)
      return ""; 
    byte[] hashValue = null;
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.reset();
    md.update(salt);
    hashValue = md.digest(data.getBytes());
    return new String(Base64.encodeBase64(hashValue));
  }
  
  public static boolean checkPassword(String data, String encoded, byte[] salt) throws Exception {
    byte[] hashValue = null;
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.reset();
    md.update(salt);
    hashValue = md.digest(data.getBytes());
    return MessageDigest.isEqual(hashValue, Base64.decodeBase64(encoded.getBytes()));
  }
}