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

	org.apache.log4j.receivers.net.MulticastReceiver Variable0 = new org.apache.log4j.receivers.net.MulticastReceiver(); 
	Variable0.setDecoder("ru.offzone.demo.Gadget"); 
 	Variable0.activateOptions();

   	if (!(new File(FILENAME).isFile())) {
		throw new AssertionError("File not created");
	}
   	System.out.println("Validate OK");
  }
}