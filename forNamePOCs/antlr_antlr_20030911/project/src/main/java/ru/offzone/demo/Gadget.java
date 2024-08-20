package ru.offzone.demo;

import java.io.IOException;
import java.nio.file.*;

public class Gadget {
	public static String FILENAME = "/tmp/ArbitraryWrite.txt";
	
	static {
        try {
            Files.createFile(Paths.get(FILENAME));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
