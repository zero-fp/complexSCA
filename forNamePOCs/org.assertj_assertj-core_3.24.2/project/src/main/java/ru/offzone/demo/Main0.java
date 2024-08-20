package ru.offzone.demo;

import java.io.File;
import java.nio.file.*; 

public class Main0 {
  public static String FILENAME = "/tmp/ArbitraryWrite.txt";

  public static void main(String[] args) throws Throwable {
    Files.deleteIfExists(Paths.get(FILENAME));
    if (new File(FILENAME).isFile()) {
      throw new AssertionError("File exists");
    }
    
  	org.assertj.core.error.ConstructorInvoker Variable0 = new org.assertj.core.error.ConstructorInvoker();
  	Variable0.newInstance("ru.offzone.demo.Gadget", (java.lang.Class[]) null, (java.lang.Object[]) null);
   	
    if (!(new File(FILENAME).isFile())) {
      throw new AssertionError("File not created");
    }     
    System.out.println("Validate OK");
  }
}