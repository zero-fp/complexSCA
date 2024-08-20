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
 		org.eclipse.core.runtime.spi.RegistryStrategy Variable0 = new org.eclipse.core.runtime.spi.RegistryStrategy((java.io.File[]) null, (boolean[]) null);
 		Variable0.createExecutableExtension((org.eclipse.core.runtime.spi.RegistryContributor) null, "ru.offzone.demo.Gadget", "AAA");
   	} catch (Exception e) {}

   	if (!(new File(FILENAME).isFile())) {
		throw new AssertionError("File not created");
	}   	
   	System.out.println("Validate OK");
  }
}